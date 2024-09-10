

# GetModelsOffersResponse

Ответ на запрос списка предложений для моделей.

The class is defined in **[GetModelsOffersResponse.java](../../src/main/java/org/openapitools/model/GetModelsOffersResponse.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**models** | [`List&lt;EnrichedModelDTO&gt;`](EnrichedModelDTO.md) | Список моделей товаров. | 
**currency** | `CurrencyType` |  |  [optional property]
**regionId** | `Long` | Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  |  [optional property]





