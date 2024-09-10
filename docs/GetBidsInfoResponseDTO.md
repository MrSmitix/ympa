# GetBidsInfoResponseDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bids** | [**SkuBidItemDTO[]**](SkuBidItemDTO.md) | Страница списка товаров. | 
**Paging** | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetBidsInfoResponseDTO = Initialize-ympa_powershell_clientGetBidsInfoResponseDTO  -Bids null `
 -Paging null
```

- Convert the resource to JSON
```powershell
$GetBidsInfoResponseDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

