# Api.GetModelsOffersResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**models** | [**[EnrichedModelDTO]**](EnrichedModelDTO.md) | Список моделей товаров. | 
**currency** | [**CurrencyType**](CurrencyType.md) |  | [optional] 
**regionId** | **Number** | Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  | [optional] 


