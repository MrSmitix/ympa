# BidRecommendationItemDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bid** | **Int32** | Значение ставки. | 
**ShowPercent** | **Int64** | Доля показов.  | 

## Examples

- Prepare the resource
```powershell
$BidRecommendationItemDTO = Initialize-ympa_powershell_clientBidRecommendationItemDTO  -Bid 570 `
 -ShowPercent null
```

- Convert the resource to JSON
```powershell
$BidRecommendationItemDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

