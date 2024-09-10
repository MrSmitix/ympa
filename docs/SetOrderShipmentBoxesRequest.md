# SetOrderShipmentBoxesRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Boxes** | [**ParcelBoxDTO[]**](ParcelBoxDTO.md) | Список грузовых мест. Маркет определяет количество мест по длине этого списка. | 

## Examples

- Prepare the resource
```powershell
$SetOrderShipmentBoxesRequest = Initialize-ympa_powershell_clientSetOrderShipmentBoxesRequest  -Boxes null
```

- Convert the resource to JSON
```powershell
$SetOrderShipmentBoxesRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

