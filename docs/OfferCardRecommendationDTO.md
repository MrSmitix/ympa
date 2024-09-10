# OfferCardRecommendationDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | [**OfferCardRecommendationType**](OfferCardRecommendationType.md) |  | 
**Percent** | **Int32** | Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов. | [optional] 

## Examples

- Prepare the resource
```powershell
$OfferCardRecommendationDTO = Initialize-ympa_powershell_clientOfferCardRecommendationDTO  -Type null `
 -Percent null
```

- Convert the resource to JSON
```powershell
$OfferCardRecommendationDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

