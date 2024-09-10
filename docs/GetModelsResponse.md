
# Table `GetModelsResponse`
(mapped from: GetModelsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**models** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ModelDTO&gt;**](ModelDTO.md) | Список моделей товаров. | 
**currency** | currency | long |  | [**CurrencyType**](CurrencyType.md) |  |  [optional] [foreignkey]
**regionId** | regionId | long |  | **kotlin.Long** | Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  |  [optional]


# **Table `GetModelsResponseModelDTO`**
(mapped from: GetModelsResponseModelDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getModelsResponse | getModelsResponse | long | | kotlin.Long | Primary Key | *one*
modelDTO | modelDTO | long | | kotlin.Long | Foreign Key | *many*





