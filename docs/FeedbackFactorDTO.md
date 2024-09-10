# FeedbackFactorDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор параметра. | [optional] 
**Title** | **String** | Название параметра. Например, &#x60;Скорость обработки заказа&#x60;. | [optional] 
**Description** | **String** | Описание параметра. Например, &#x60;Как быстро с вами связались для подтверждения заказа?&#x60;. | [optional] 
**Value** | **Int32** | Оценка по параметру, указанная в отзыве: от &#x60;1&#x60; (низшая оценка) до &#x60;5&#x60; (высшая оценка).  | [optional] 

## Examples

- Prepare the resource
```powershell
$FeedbackFactorDTO = Initialize-ympa_powershell_clientFeedbackFactorDTO  -Id null `
 -Title null `
 -Description null `
 -Value null
```

- Convert the resource to JSON
```powershell
$FeedbackFactorDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

