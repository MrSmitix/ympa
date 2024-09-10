# ConfirmPricesRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferIds** | **String[]** | Идентификаторы товаров, у которых подтверждается цена. | 

## Examples

- Prepare the resource
```powershell
$ConfirmPricesRequest = Initialize-ympa_powershell_clientConfirmPricesRequest  -OfferIds null
```

- Convert the resource to JSON
```powershell
$ConfirmPricesRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

