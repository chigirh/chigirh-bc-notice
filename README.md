# Getting Started
## docs
`/docs/`

## Application Architect
### config
#### description
アプリケーション全体の設定情報に関連するモジュール
#### detail
- アプリケーションの設定ファイル
- message.properties
- 起動用のboot class
#### dependencies
- common
- web
- batch
- application
- domain
- persistence
- infra:mysql
- infra:api
- infra:mail

### common
#### description
Application共通機能に関連するモジュール
#### detail
- message関連の共通クラス群
- Application共通のUtility class
#### dependencies

### application
#### description
ApplicationのDomain領域。業務ロジックに関連するモジュール
#### details
- UseCase class
- Service class
- Repository interface class
#### dependencies
- common
- domain

### domain
#### description
ApplicationのDomain領域。Modelに関連するモジュール
#### details
- Model entity
- Exception class
#### dependencies
- common

### web
#### dependencies
Server側のWebAPIに関連するモジュール
#### detail
- Controller(generated by OpenAPI)
- Request/Response Dto(generated by OpenAPI)
- Delegator interface(generated by OpenAPI)
- Delegator impl
- Converter class
#### dependencies
- common
- application
- domain

### batch
#### description
バッチ処理に関連するモジュール
#### details
- Process
#### dependencies
- common
- application
- domain

### persistence
#### description
Repository interfaceとinfraモジュールのAdapterとして動作するモジュール
#### detail
- Repository impl
### dependencies
- application
- domain
- infra:mysql
- infra:api
- infra:mail

### infra:mysql
#### description
MySqlへのクエリの発行を行うモジュール
#### details
- Entity class
- Mapper interface
- Mapper xml
#### dependencies
- common

### infra:mysql
#### description
Client側のWebAPIに関連するモジュール
#### details
- Request/Response Dto
- Api client
#### dependencies
- common

### infra:mail
#### description
メールの送信機能に関連するモジュール
#### details
- Mail　send client
#### dependencies
- common