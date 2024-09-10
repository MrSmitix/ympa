# DeleteOffersRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferIds** | **String[]** | Список SKU товаров, которые нужно удалить. | 

## Examples

- Prepare the resource
```powershell
$DeleteOffersRequest = Initialize-ympa_powershell_clientDeleteOffersRequest  -OfferIds null
```

- Convert the resource to JSON
```powershell
$DeleteOffersRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

