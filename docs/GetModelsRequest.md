
# Table `GetModelsRequest`
(mapped from: GetModelsRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**models** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Long&gt;** | Список моделей. | 


# **Table `GetModelsRequestModels`**
(mapped from: GetModelsRequestModels)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getModelsRequest | getModelsRequest | long | | kotlin.Long | Primary Key | *one*
models | models | long | | kotlin.Long | Foreign Key | *many*



