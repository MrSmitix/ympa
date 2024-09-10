# OrderCourierDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FullName** | **String** | Полное имя курьера. | [optional] 
**Phone** | **String** | Номер телефона курьера. | [optional] 
**PhoneExtension** | **String** | Добавочный номер телефона. | [optional] 
**VehicleNumber** | **String** | Номер транспортного средства. | [optional] 
**VehicleDescription** | **String** | Описание машины. Например, модель и цвет. | [optional] 

## Examples

- Prepare the resource
```powershell
$OrderCourierDTO = Initialize-ympa_powershell_clientOrderCourierDTO  -FullName null `
 -Phone null `
 -PhoneExtension null `
 -VehicleNumber null `
 -VehicleDescription null
```

- Convert the resource to JSON
```powershell
$OrderCourierDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

