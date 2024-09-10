

# EnrichedModelDTO

Модель товара.

The class is defined in **[EnrichedModelDTO.java](../../src/main/java/org/openapitools/model/EnrichedModelDTO.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `Long` | Идентификатор модели товара. |  [optional property]
**name** | `String` | Название модели товара. |  [optional property]
**prices** | [`ModelPriceDTO`](ModelPriceDTO.md) |  |  [optional property]
**offers** | [`List&lt;ModelOfferDTO&gt;`](ModelOfferDTO.md) | Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них.  |  [optional property]
**offlineOffers** | `Integer` | Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина. |  [optional property]
**onlineOffers** | `Integer` | Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина. |  [optional property]








