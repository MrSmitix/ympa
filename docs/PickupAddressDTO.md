# PickupAddressDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Country** | **String** | Страна. | [optional] 
**City** | **String** | Город. | [optional] 
**Street** | **String** | Улица. | [optional] 
**House** | **String** | Номер дома. | [optional] 
**Postcode** | **String** | Почтовый индекс. | [optional] 

## Examples

- Prepare the resource
```powershell
$PickupAddressDTO = Initialize-ympa_powershell_clientPickupAddressDTO  -Country Россия `
 -City Москва `
 -Street Стрелецкая улица `
 -House 9к2 `
 -Postcode 123518
```

- Convert the resource to JSON
```powershell
$PickupAddressDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

