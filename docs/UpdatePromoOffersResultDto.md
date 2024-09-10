# UpdatePromoOffersResultDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rejected_offers** | [**Vec<models::RejectedPromoOfferUpdateDto>**](RejectedPromoOfferUpdateDTO.md) | Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения.  | [optional] [default to None]
**warning_offers** | [**Vec<models::WarningPromoOfferUpdateDto>**](WarningPromoOfferUpdateDTO.md) | Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения.  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


