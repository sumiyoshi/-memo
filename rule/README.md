# 構成

## アプリケーション層

### Controller

```
HTTPのリクエストなど、ユーザのリクエストを受ける
```

### Presenter
```
viewが必要なアプリケーションの場合はPresenterで表現する
```

## ドメイン層

### Entity

```
ビジネスロジック
```

### Port

```
UseCaseに渡す（もらう）データ
```

#### InputPort
#### OutputPort

### Translator

```
EntityやPortの変換
```

### UseCase

```
業務フロー

Facade パターンで実装するのが良さそう
```

#### Interactor

### Gateway

```
外部機能へのインターフェース
```

#### RepositoryInterfereとか

## インフラストラクチャ層

### Repository

```
Data関連、DBとか
```



