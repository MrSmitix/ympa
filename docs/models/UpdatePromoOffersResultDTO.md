

# UpdatePromoOffersResultDTO

Ошибки и предупреждения, которые появились при добавлении товаров в акцию.

The class is defined in **[UpdatePromoOffersResultDTO.java](../../src/main/java/org/openapitools/model/UpdatePromoOffersResultDTO.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rejectedOffers** | [`List&lt;RejectedPromoOfferUpdateDTO&gt;`](RejectedPromoOfferUpdateDTO.md) | Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения.  |  [optional property]
**warningOffers** | [`List&lt;WarningPromoOfferUpdateDTO&gt;`](WarningPromoOfferUpdateDTO.md) | Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения.  |  [optional property]




