
# Table `ModelsDTO`
(mapped from: ModelsDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**models** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ModelDTO&gt;**](ModelDTO.md) | Список моделей товаров. | 


# **Table `ModelsDTOModelDTO`**
(mapped from: ModelsDTOModelDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
modelsDTO | modelsDTO | long | | kotlin.Long | Primary Key | *one*
modelDTO | modelDTO | long | | kotlin.Long | Foreign Key | *many*



