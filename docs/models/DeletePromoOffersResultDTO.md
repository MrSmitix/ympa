

# DeletePromoOffersResultDTO

Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр `offerIds`. 

The class is defined in **[DeletePromoOffersResultDTO.java](../../src/main/java/org/openapitools/model/DeletePromoOffersResultDTO.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rejectedOffers** | [`List&lt;RejectedPromoOfferDeleteDTO&gt;`](RejectedPromoOfferDeleteDTO.md) | Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары.  |  [optional property]



