

# SearchModelsResponse

The class is defined in **[SearchModelsResponse.java](../../src/main/java/org/openapitools/model/SearchModelsResponse.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**models** | [`List&lt;ModelDTO&gt;`](ModelDTO.md) | Список моделей товаров. | 
**currency** | `CurrencyType` |  |  [optional property]
**regionId** | `Long` | Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  |  [optional property]
**pager** | [`FlippingPagerDTO`](FlippingPagerDTO.md) |  |  [optional property]






