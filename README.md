# Gateway Architecture

Gateway Architectureと呼ぶことにした<br />
現状いいと思うアーキテクト


## 構成

|名称|詳細|
|---|---|
|Domain|ビジネスロジック|
|Adapter|外部とのやり取り|
|Gateway|ユーザとのやり取り|

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
todo
```

#### Manager

```
todo
```

#### Port

```
todo
```

#### CommandInterface

```
todo
```

#### QueryInterface

```
todo
```

## Adapter

```
todo
```


## Gateway

#### Controller

```
todo
```

### Presenter

```
todo
```

<img src="/Architect.png" alt="イメージ">

```
.
├── Domain
│   ├── model
│   │   ├── entity
│   │   └── valueObject
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
    └── Presenter
```
