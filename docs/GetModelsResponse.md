# GetModelsResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**models** | [**Vec<models::ModelDto>**](ModelDTO.md) | Список моделей товаров. | 
**currency** | [***models::CurrencyType**](CurrencyType.md) |  | [optional] [default to None]
**region_id** | **i64** | Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


