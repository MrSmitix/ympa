

# DeletePromoOffersResultDTO

Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр `offerIds`. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rejectedOffers** | [**Seq&lt;RejectedPromoOfferDeleteDTO&gt;**](RejectedPromoOfferDeleteDTO.md) | Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары.  |  [optional]



