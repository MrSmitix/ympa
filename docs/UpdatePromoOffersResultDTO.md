

# UpdatePromoOffersResultDTO

Ошибки и предупреждения, которые появились при добавлении товаров в акцию.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rejectedOffers** | [**Seq&lt;RejectedPromoOfferUpdateDTO&gt;**](RejectedPromoOfferUpdateDTO.md) | Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения.  |  [optional]
**warningOffers** | [**Seq&lt;WarningPromoOfferUpdateDTO&gt;**](WarningPromoOfferUpdateDTO.md) | Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения.  |  [optional]



