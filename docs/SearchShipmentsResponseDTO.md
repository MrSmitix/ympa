# SearchShipmentsResponseDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Shipments** | [**ShipmentInfoDTO[]**](ShipmentInfoDTO.md) | Список с информацией об отгрузках. | 
**Paging** | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$SearchShipmentsResponseDTO = Initialize-ympa_powershell_clientSearchShipmentsResponseDTO  -Shipments null `
 -Paging null
```

- Convert the resource to JSON
```powershell
$SearchShipmentsResponseDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

