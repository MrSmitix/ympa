# GetAllOffersResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offers** | [**OfferDTO[]**](OfferDTO.md) | Список предложений магазина. | 

## Examples

- Prepare the resource
```powershell
$GetAllOffersResponse = Initialize-ympa_powershell_clientGetAllOffersResponse  -Offers null
```

- Convert the resource to JSON
```powershell
$GetAllOffersResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

