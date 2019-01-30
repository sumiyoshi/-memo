# Architect

現状いいと思うアーキテクト


## 構成

|名称|詳細|
|---|---|
|Domain|ビジネスロジック|
|InterfaceAdapter|ユーザや外部とのやり取り|

※以下「境界」とはDomainとInterfaceAdapterの間に存在するものとする

### Domain

#### Entity

ビジネスデータや操作、ただし規模によってはデータ構造のみの場合もありえる

#### Gateway

境界を越えるときはGatewayにInterfaceを定義する

##### Interactor

InterfaceAdapterからUserCaseを呼び出すためのInterface

##### Repository

DomainからDBの処理を呼び出すためのInterface

#### Service

Interactor、Repository以外の理由で境界を超えるとき

#### UseCase

ビジネスルールをもつ、Input(DS)とOutput(DS)を定義する、<br />
レスポンスは定義されているOutput(DS)<br />
引数にはGatewayのInterfaceとInput(DS)

### InterfaceAdapter

#### Controller OR Activity

ユーザからのリクエストを受け取る<br />
Interactorを生成し、ユーザにレスポンスを返す<br />
レスポンスデータが複雑な場合なPresenterとViewModel(DS)を使用するのもあり<br />
トランザクションはこの単位がいい

#### Interactor

Gatewayに用意されているInterfaceの実装<br />
入力値のパラメータの検証を行い、UserCaseを実行する<br />
実行した結果のOutputの検証も行う<br />
つまりUserCaseのInputとOutputのデータの検証をする


#### Repository

Gatewayに用意されているInterfaceの実装

#### Service

Gatewayに用意されているInterfaceの実装

<img src="/Architect.png" alt="イメージ">