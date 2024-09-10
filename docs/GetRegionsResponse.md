# GetRegionsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Regions** | [**RegionDTO[]**](RegionDTO.md) | Регион доставки. | 
**Paging** | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetRegionsResponse = Initialize-ympa_powershell_clientGetRegionsResponse  -Regions null `
 -Paging null
```

- Convert the resource to JSON
```powershell
$GetRegionsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

