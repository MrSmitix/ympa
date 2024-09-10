# GetPromoOffersRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PromoId** | **String** | Идентификатор акции. | 
**StatusType** | [**PromoOfferParticipationStatusFilterType**](PromoOfferParticipationStatusFilterType.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetPromoOffersRequest = Initialize-ympa_powershell_clientGetPromoOffersRequest  -PromoId null `
 -StatusType null
```

- Convert the resource to JSON
```powershell
$GetPromoOffersRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

