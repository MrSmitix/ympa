# AddOffersToArchiveRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferIds** | **String[]** | Список товаров, которые нужно поместить в архив. | 

## Examples

- Prepare the resource
```powershell
$AddOffersToArchiveRequest = Initialize-ympa_powershell_clientAddOffersToArchiveRequest  -OfferIds null
```

- Convert the resource to JSON
```powershell
$AddOffersToArchiveRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

