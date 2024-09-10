# PutSkuBidsRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bids** | [**SkuBidItemDTO[]**](SkuBidItemDTO.md) | Список товаров и ставки для продвижения, которые на них нужно установить. | 

## Examples

- Prepare the resource
```powershell
$PutSkuBidsRequest = Initialize-ympa_powershell_clientPutSkuBidsRequest  -Bids null
```

- Convert the resource to JSON
```powershell
$PutSkuBidsRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

