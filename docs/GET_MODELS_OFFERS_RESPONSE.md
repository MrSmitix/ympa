# GET_MODELS_OFFERS_RESPONSE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**models** | [**LIST [ENRICHED_MODEL_DTO]**](EnrichedModelDTO.md) | Список моделей товаров. | [default to null]
**currency** | [**CURRENCY_TYPE**](CurrencyType.md) |  | [optional] [default to null]
**region_id** | **INTEGER_64** | Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


