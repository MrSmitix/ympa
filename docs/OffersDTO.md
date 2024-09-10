# OffersDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offers** | [**OfferDTO[]**](OfferDTO.md) | Список предложений магазина. | 

## Examples

- Prepare the resource
```powershell
$OffersDTO = Initialize-ympa_powershell_clientOffersDTO  -Offers null
```

- Convert the resource to JSON
```powershell
$OffersDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

