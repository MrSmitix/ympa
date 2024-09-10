# GetBidsRecommendationsRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Skus** | **String[]** | Список товаров, для которых нужно получить рекомендации по ставкам.  | 

## Examples

- Prepare the resource
```powershell
$GetBidsRecommendationsRequest = Initialize-ympa_powershell_clientGetBidsRecommendationsRequest  -Skus null
```

- Convert the resource to JSON
```powershell
$GetBidsRecommendationsRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

