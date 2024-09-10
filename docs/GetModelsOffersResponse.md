
# Table `GetModelsOffersResponse`
(mapped from: GetModelsOffersResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**models** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;EnrichedModelDTO&gt;**](EnrichedModelDTO.md) | Список моделей товаров. | 
**currency** | currency | long |  | [**CurrencyType**](CurrencyType.md) |  |  [optional] [foreignkey]
**regionId** | regionId | long |  | **kotlin.Long** | Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  |  [optional]


# **Table `GetModelsOffersResponseEnrichedModelDTO`**
(mapped from: GetModelsOffersResponseEnrichedModelDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getModelsOffersResponse | getModelsOffersResponse | long | | kotlin.Long | Primary Key | *one*
enrichedModelDTO | enrichedModelDTO | long | | kotlin.Long | Foreign Key | *many*





