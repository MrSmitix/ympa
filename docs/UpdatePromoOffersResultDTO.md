# UpdatePromoOffersResultDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rejectedOffers** | [**Vector{RejectedPromoOfferUpdateDTO}**](RejectedPromoOfferUpdateDTO.md) | Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения.  | [optional] [default to nothing]
**warningOffers** | [**Vector{WarningPromoOfferUpdateDTO}**](WarningPromoOfferUpdateDTO.md) | Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения.  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


