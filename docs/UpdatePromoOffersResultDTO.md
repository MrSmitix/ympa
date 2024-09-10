# UpdatePromoOffersResultDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RejectedOffers** | [**RejectedPromoOfferUpdateDTO[]**](RejectedPromoOfferUpdateDTO.md) | Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения.  | [optional] 
**WarningOffers** | [**WarningPromoOfferUpdateDTO[]**](WarningPromoOfferUpdateDTO.md) | Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения.  | [optional] 

## Examples

- Prepare the resource
```powershell
$UpdatePromoOffersResultDTO = Initialize-ympa_powershell_clientUpdatePromoOffersResultDTO  -RejectedOffers null `
 -WarningOffers null
```

- Convert the resource to JSON
```powershell
$UpdatePromoOffersResultDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

