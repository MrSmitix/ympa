# PalletsCountDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Planned** | **Int32** | Количество палет, которое заявил продавец. | [optional] 
**Fact** | **Int32** | Количество палет, которое приняли в сортировочном центре. | [optional] 

## Examples

- Prepare the resource
```powershell
$PalletsCountDTO = Initialize-ympa_powershell_clientPalletsCountDTO  -Planned null `
 -Fact null
```

- Convert the resource to JSON
```powershell
$PalletsCountDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

