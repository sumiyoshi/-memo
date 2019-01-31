# Gateway Architecture

Gateway Architectureと呼ぶことにした<br />
現状いいと思うアーキテクト


## 構成

|名称|詳細|
|---|---|
|Domain|ビジネスロジック|
|InterfaceAdapter|ユーザや外部とのやり取り|

※以下「境界」とはDomainとInterfaceAdapterの間に存在するものとする

### Domain

#### Entity

```
ビジネスデータや操作、ただし規模によってはデータ構造のみの場合もありえる
データと操作は分ける、操作用のclassは関数の集合体
```

#### Gateway

```
境界を越えるときはGatewayにInterfaceを定義する
Gatewayは下記の3つの種類があり、データの流れは一方通行
```

##### Operator

```
InterfaceAdapterからUserCaseを呼び出すためのInterface
```

##### Receiver

```
InterfaceAdapterからDomainへデータを取得するためのInterface
DBだとSelect、ただしDB限定ではないファイルの取得APIを経由して外部のサービスからのデータ取得もありえる
```

##### Sender

```
DomainからInterfaceAdapterへデータを送るためのInterface
DBだとinsertなど、メールの送信などもこちらに含まれる
```

#### UseCase

```
ビジネスルールをもつ、Input(DS)とOutput(DS)を定義する、
レスポンスは定義されているOutput(DS)
引数にはGatewayのInterfaceとInput(DS)
```

### InterfaceAdapter

#### Adapter

```
Gatewayに定義されているInterfaceの実装
```

##### Operator

```
Operatorの実装
入力値のパラメータの検証を行い、UserCaseを実行する
実行した結果のOutputの検証も行う
つまりUserCaseのInputとOutputのデータの検証をする
```

##### Receiver

```
Receiverの実装
```

##### Sender

```
Senderの実装
```

#### Controller OR Activity

```
ユーザからのリクエストを受け取る
Interactorを生成し、ユーザにレスポンスを返す
レスポンスデータが複雑な場合なPresenterとViewModel(DS)を使用するのもあり
トランザクションはこの単位がいい
```

#### Infrastructure

```
フレームワークや外部のライブラリに依存していて、かつInterfaceAdapter内で使用するもの
```

<img src="/Architect.png" alt="イメージ">

```
.
├── Domain
│   ├── entity
│   ├── gateway
│   │   ├── operator
│   │   ├── receiver
│   │   └── sender
│   └── useCase
│       ├── signIn
│       │   ├── DS.kt
│       │   ├── UserCase.kt
│       │   └── UserCaseImpl.kt
│       └── signUp
│           ├── DS.kt
│           ├── UserCase.kt
│           └── UserCaseImpl.kt
└── InterfaceAdapter
    ├── adapter
    │   ├── operator
    │   ├── receiver
    │   └── sender
    ├── controller
    └── infrastructure
```
