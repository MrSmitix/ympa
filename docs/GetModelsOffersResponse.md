# ympa_csharp_client.Model.GetModelsOffersResponse
Ответ на запрос списка предложений для моделей.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Models** | [**List&lt;EnrichedModelDTO&gt;**](EnrichedModelDTO.md) | Список моделей товаров. | 
**Currency** | **CurrencyType** |  | [optional] 
**RegionId** | **long** | Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

