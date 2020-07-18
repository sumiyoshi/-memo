# Architecture

```
├── Application
│   ├── Cli
│   └── Http
├── Domain
│   ├── Model
│   │   ├── Sample
│   │   │   ├── SampleEntity.php
│   │   │   ├── SampleRepositoryInterface.php
│   │   │   └── Service
│   │   │       └── SampleService.php
│   │   └── ValueObject
│   │       └── Sample.php
│   └── UseCase
│       └── Sample
│           ├── Read
│           │   ├── Parameter
│           │   │   ├── ReadInput.php
│           │   │   └── ReadOutput.php
│           │   ├── ReadQueryInterface.php
│           │   └── ReadUseCase.php
│           └── Update
│               ├── Parameter
│               │   ├── UpdateInput.php
│               │   └── UpdateOutput.php
│               ├── UpdateCommandInterface.php
│               ├── UpdateQueryInterface.php
│               └── UpdateUseCase.php
└── Infrastructure
    ├── Adapter
    │   └── Sample
    │       ├── ReadAdapter.php
    │       └── UpdateAdapter.php
    ├── Client
    │   └── AClient.php
    ├── DataAccess
    │   ├── Dao
    │   │   └── ADao.php
    │   └── File
    │       └── AFile.php
    └── Repository
        └── SampleRepository.php

```
	

