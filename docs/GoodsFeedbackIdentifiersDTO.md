# GoodsFeedbackIdentifiersDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrderId** | **Int64** | Идентификатор заказа на Маркете. | 
**ModelId** | **Int64** | Идентификатор модели товара. | 

## Examples

- Prepare the resource
```powershell
$GoodsFeedbackIdentifiersDTO = Initialize-ympa_powershell_clientGoodsFeedbackIdentifiersDTO  -OrderId null `
 -ModelId null
```

- Convert the resource to JSON
```powershell
$GoodsFeedbackIdentifiersDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

