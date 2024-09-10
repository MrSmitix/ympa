# FeedPublicationDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**FeedStatusType**](FeedStatusType.md) |  | [optional] 
**Full** | [**FeedPublicationFullDTO**](FeedPublicationFullDTO.md) |  | [optional] 
**PriceAndStockUpdate** | [**FeedPublicationPriceAndStockUpdateDTO**](FeedPublicationPriceAndStockUpdateDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$FeedPublicationDTO = Initialize-ympa_powershell_clientFeedPublicationDTO  -Status null `
 -Full null `
 -PriceAndStockUpdate null
```

- Convert the resource to JSON
```powershell
$FeedPublicationDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

