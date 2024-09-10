# GetModelsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**models** | [**Vec<models::ModelDto>**](ModelDTO.md) | Список моделей товаров. | 
**currency** | Option<[**models::CurrencyType**](CurrencyType.md)> |  | [optional]
**region_id** | Option<**i64**> | Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


