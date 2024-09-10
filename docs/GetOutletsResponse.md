# GetOutletsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Outlets** | [**FullOutletDTO[]**](FullOutletDTO.md) | Информация о точках продаж. | 
**Paging** | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] 
**Pager** | [**FlippingPagerDTO**](FlippingPagerDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetOutletsResponse = Initialize-ympa_powershell_clientGetOutletsResponse  -Outlets null `
 -Paging null `
 -Pager null
```

- Convert the resource to JSON
```powershell
$GetOutletsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

