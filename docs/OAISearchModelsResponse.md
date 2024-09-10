# OAISearchModelsResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**models** | [**NSArray&lt;OAIModelDTO&gt;***](OAIModelDTO.md) | Список моделей товаров. | 
**currency** | [**OAICurrencyType***](OAICurrencyType.md) |  | [optional] 
**regionId** | **NSNumber*** | Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  | [optional] 
**pager** | [**OAIFlippingPagerDTO***](OAIFlippingPagerDTO.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


