# ScrollingPagerDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NextPageToken** | **String** | Идентификатор следующей страницы результатов. | [optional] 
**PrevPageToken** | **String** | Идентификатор предыдущей страницы результатов. | [optional] 

## Examples

- Prepare the resource
```powershell
$ScrollingPagerDTO = Initialize-ympa_powershell_clientScrollingPagerDTO  -NextPageToken null `
 -PrevPageToken null
```

- Convert the resource to JSON
```powershell
$ScrollingPagerDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

