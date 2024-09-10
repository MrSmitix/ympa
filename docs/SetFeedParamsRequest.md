# SetFeedParamsRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Parameters** | [**FeedParameterDTO[]**](FeedParameterDTO.md) | Параметры прайс-листа.  Обязательный параметр.  | 

## Examples

- Prepare the resource
```powershell
$SetFeedParamsRequest = Initialize-ympa_powershell_clientSetFeedParamsRequest  -Parameters null
```

- Convert the resource to JSON
```powershell
$SetFeedParamsRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

