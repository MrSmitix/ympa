# SkipGoodsFeedbackReactionRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FeedbackIds** | **Int64[]** | Список идентификаторов отзывов, на которые магазин не будет отвечать. | 

## Examples

- Prepare the resource
```powershell
$SkipGoodsFeedbackReactionRequest = Initialize-ympa_powershell_clientSkipGoodsFeedbackReactionRequest  -FeedbackIds null
```

- Convert the resource to JSON
```powershell
$SkipGoodsFeedbackReactionRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

