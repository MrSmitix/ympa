
# Table `SearchModelsResponse`
(mapped from: SearchModelsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**models** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ModelDTO&gt;**](ModelDTO.md) | Список моделей товаров. | 
**currency** | currency | long |  | [**CurrencyType**](CurrencyType.md) |  |  [optional] [foreignkey]
**regionId** | regionId | long |  | **kotlin.Long** | Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  |  [optional]
**pager** | pager | long |  | [**FlippingPagerDTO**](FlippingPagerDTO.md) |  |  [optional] [foreignkey]


# **Table `SearchModelsResponseModelDTO`**
(mapped from: SearchModelsResponseModelDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
searchModelsResponse | searchModelsResponse | long | | kotlin.Long | Primary Key | *one*
modelDTO | modelDTO | long | | kotlin.Long | Foreign Key | *many*






