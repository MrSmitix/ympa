# SearchModelsResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**models** | [**OpenAPI\Server\Model\ModelDTO**](ModelDTO.md) | Список моделей товаров. | 
**currency** | [**OpenAPI\Server\Model\CurrencyType**](CurrencyType.md) |  | [optional] 
**regionId** | **int** | Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). | [optional] 
**pager** | [**OpenAPI\Server\Model\FlippingPagerDTO**](FlippingPagerDTO.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


