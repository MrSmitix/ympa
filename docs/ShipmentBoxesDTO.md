# ShipmentBoxesDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Boxes** | [**ParcelBoxDTO[]**](ParcelBoxDTO.md) | Список грузовых мест. Маркет определил количество мест по длине этого списка.  | 

## Examples

- Prepare the resource
```powershell
$ShipmentBoxesDTO = Initialize-ympa_powershell_clientShipmentBoxesDTO  -Boxes null
```

- Convert the resource to JSON
```powershell
$ShipmentBoxesDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

