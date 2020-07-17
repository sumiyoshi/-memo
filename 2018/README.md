# Gateway Architecture

Gateway Architectureと呼ぶことにした<br />
現状いいと思うアーキテクト

## 構成

|名称|詳細|
|---|---|
|Domain|ビジネスロジック|
|Gateway|Domain層と外部とのやり取りを吸収する場所|

## Domain

### Model

#### Entity

```
todo
```

#### Value Object

```
todo
```

### UseCase


##### Operator

```
業務フローを制御する。
他のOperatorには依存しない
```

#### Manager

```
複数のOperatorを制御する場合に使用
```

#### Port

```
OperatorまたはManagerごとに、InputとOutputのパラメータをオブジェクトで定義
```

#### CommandInterface

```
OperatorまたはManagerごとに、外部へのデータの操作を期待するものを実装
複数のOperatorまたはManagerで使用はしない。
```

#### QueryInterface

```
OperatorまたはManagerごとに、外部からのデータの取得を期待するものを実装
複数のOperatorまたはManagerで使用はしない。
```

## Gateway

#### Adapter

```
外部ライブラリとDomainをつなぐクラス
CommandInterfaceとQueryInterfaceの実態
```

#### Controller

```
ユーザからのリクエストを受付、必要なPortを生成し、
OperatorまたはManagerを実行
```

##### View

```
テンプレートにわたすパラメータの定義と表示のときの変換処理
```

<img src="/2018/Architect.png" alt="イメージ">

```
.
├── Domain
│   ├── Model
│   │   ├── Entity
│   │   └── ValueObject
│   │   
│   └── Operator
│       ├── signIn
│       │   ├── InputPort
│       │   ├── OutputPort
│       │   ├── SignInOp
│       │   └── SignInQueryInterface
│       └── signUp
│           ├── InputPort
│           ├── OutputPort
│           ├── SignUpOp
│           ├── SignUpCommandInterface
│           └── SignUpQueryInterface
└── GateWay
    ├── Controller
    └── View
```
