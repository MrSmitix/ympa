# OrderBoxesLayoutDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Boxes** | [**EnrichedOrderBoxLayoutDTO[]**](EnrichedOrderBoxLayoutDTO.md) | Список коробок. | 

## Examples

- Prepare the resource
```powershell
$OrderBoxesLayoutDTO = Initialize-ympa_powershell_clientOrderBoxesLayoutDTO  -Boxes null
```

- Convert the resource to JSON
```powershell
$OrderBoxesLayoutDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

