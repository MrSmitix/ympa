# GoodsFeedbackMediaDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Photos** | **String[]** | Ссылки на фото. | [optional] 
**Videos** | **String[]** | Ссылки на видео. | [optional] 

## Examples

- Prepare the resource
```powershell
$GoodsFeedbackMediaDTO = Initialize-ympa_powershell_clientGoodsFeedbackMediaDTO  -Photos null `
 -Videos null
```

- Convert the resource to JSON
```powershell
$GoodsFeedbackMediaDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

