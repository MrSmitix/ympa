# GoodsFeedbackDescriptionDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Advantages** | **String** | Описание плюсов товара в отзыве. | [optional] 
**Disadvantages** | **String** | Описание минусов товара в отзыве. | [optional] 
**Comment** | **String** | Комментарий в отзыве. | [optional] 

## Examples

- Prepare the resource
```powershell
$GoodsFeedbackDescriptionDTO = Initialize-ympa_powershell_clientGoodsFeedbackDescriptionDTO  -Advantages null `
 -Disadvantages null `
 -Comment null
```

- Convert the resource to JSON
```powershell
$GoodsFeedbackDescriptionDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

