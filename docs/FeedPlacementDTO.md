# FeedPlacementDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**FeedStatusType**](FeedStatusType.md) |  | [optional] 
**TotalOffersCount** | **Int32** | Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса. | [optional] 

## Examples

- Prepare the resource
```powershell
$FeedPlacementDTO = Initialize-ympa_powershell_clientFeedPlacementDTO  -Status null `
 -TotalOffersCount null
```

- Convert the resource to JSON
```powershell
$FeedPlacementDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

