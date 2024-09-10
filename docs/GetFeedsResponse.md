# GetFeedsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Feeds** | [**FeedDTO[]**](FeedDTO.md) | Список прайс-листов. | 

## Examples

- Prepare the resource
```powershell
$GetFeedsResponse = Initialize-ympa_powershell_clientGetFeedsResponse  -Feeds null
```

- Convert the resource to JSON
```powershell
$GetFeedsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

