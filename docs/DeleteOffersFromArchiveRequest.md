# DeleteOffersFromArchiveRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferIds** | **String[]** | Список товаров, которые нужно восстановить из архива. | 

## Examples

- Prepare the resource
```powershell
$DeleteOffersFromArchiveRequest = Initialize-ympa_powershell_clientDeleteOffersFromArchiveRequest  -OfferIds null
```

- Convert the resource to JSON
```powershell
$DeleteOffersFromArchiveRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

