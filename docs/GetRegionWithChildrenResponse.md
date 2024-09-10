# GetRegionWithChildrenResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Pager** | [**FlippingPagerDTO**](FlippingPagerDTO.md) |  | [optional] 
**Regions** | [**RegionDTO**](RegionDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetRegionWithChildrenResponse = Initialize-ympa_powershell_clientGetRegionWithChildrenResponse  -Pager null `
 -Regions null
```

- Convert the resource to JSON
```powershell
$GetRegionWithChildrenResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

