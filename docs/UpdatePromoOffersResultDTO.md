# ympa_csharp_client.Model.UpdatePromoOffersResultDTO
Ошибки и предупреждения, которые появились при добавлении товаров в акцию.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RejectedOffers** | [**List&lt;RejectedPromoOfferUpdateDTO&gt;**](RejectedPromoOfferUpdateDTO.md) | Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения.  | [optional] 
**WarningOffers** | [**List&lt;WarningPromoOfferUpdateDTO&gt;**](WarningPromoOfferUpdateDTO.md) | Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

