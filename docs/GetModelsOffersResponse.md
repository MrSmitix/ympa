# ympa_r_client::GetModelsOffersResponse

Ответ на запрос списка предложений для моделей.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**models** | [**array[EnrichedModelDTO]**](EnrichedModelDTO.md) | Список моделей товаров. | 
**currency** | [**CurrencyType**](CurrencyType.md) |  | [optional] [Enum: ] 
**regionId** | **integer** | Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  | [optional] 


