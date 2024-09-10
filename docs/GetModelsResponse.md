# GetModelsResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**models** | [**Vector{ModelDTO}**](ModelDTO.md) | Список моделей товаров. | [default to nothing]
**currency** | [***CurrencyType**](CurrencyType.md) |  | [optional] [default to nothing]
**regionId** | **Int64** | Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


