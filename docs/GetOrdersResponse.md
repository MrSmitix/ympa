# GetOrdersResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Pager** | [**FlippingPagerDTO**](FlippingPagerDTO.md) |  | [optional] 
**Orders** | [**OrderDTO[]**](OrderDTO.md) | Модель заказа.  | 
**Paging** | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetOrdersResponse = Initialize-ympa_powershell_clientGetOrdersResponse  -Pager null `
 -Orders null `
 -Paging null
```

- Convert the resource to JSON
```powershell
$GetOrdersResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

