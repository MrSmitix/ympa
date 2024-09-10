# FeedContentDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RejectedOffersCount** | **Int64** | Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;.  | [optional] 
**Status** | [**FeedStatusType**](FeedStatusType.md) |  | [optional] 
**TotalOffersCount** | **Int64** | Количество предложений в прайс-листе. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;.  | [optional] 
**VarError** | [**FeedContentErrorDTO**](FeedContentErrorDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$FeedContentDTO = Initialize-ympa_powershell_clientFeedContentDTO  -RejectedOffersCount null `
 -Status null `
 -TotalOffersCount null `
 -VarError null
```

- Convert the resource to JSON
```powershell
$FeedContentDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

