# DeleteHiddenOffersRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**HiddenOffers** | [**HiddenOfferDTO[]**](HiddenOfferDTO.md) | Список скрытых товаров.  | 

## Examples

- Prepare the resource
```powershell
$DeleteHiddenOffersRequest = Initialize-ympa_powershell_clientDeleteHiddenOffersRequest  -HiddenOffers null
```

- Convert the resource to JSON
```powershell
$DeleteHiddenOffersRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

