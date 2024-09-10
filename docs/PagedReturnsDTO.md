# PagedReturnsDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Paging** | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] 
**Returns** | [**ReturnDTO[]**](ReturnDTO.md) | Список возвратов. | 

## Examples

- Prepare the resource
```powershell
$PagedReturnsDTO = Initialize-ympa_powershell_clientPagedReturnsDTO  -Paging null `
 -Returns null
```

- Convert the resource to JSON
```powershell
$PagedReturnsDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

