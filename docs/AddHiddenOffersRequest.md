# AddHiddenOffersRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**HiddenOffers** | [**HiddenOfferDTO[]**](HiddenOfferDTO.md) | Список скрытых товаров.  | 

## Examples

- Prepare the resource
```powershell
$AddHiddenOffersRequest = Initialize-ympa_powershell_clientAddHiddenOffersRequest  -HiddenOffers null
```

- Convert the resource to JSON
```powershell
$AddHiddenOffersRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

