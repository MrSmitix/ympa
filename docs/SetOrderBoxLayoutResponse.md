# SetOrderBoxLayoutResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**OrderBoxesLayoutDTO**](OrderBoxesLayoutDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$SetOrderBoxLayoutResponse = Initialize-ympa_powershell_clientSetOrderBoxLayoutResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$SetOrderBoxLayoutResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

