# UpdatePromoOffersResultDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rejected_offers** | Option<[**Vec<models::RejectedPromoOfferUpdateDto>**](RejectedPromoOfferUpdateDTO.md)> | Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения.  | [optional]
**warning_offers** | Option<[**Vec<models::WarningPromoOfferUpdateDto>**](WarningPromoOfferUpdateDTO.md)> | Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения.  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


