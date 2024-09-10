# OfferManualDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Url** | **String** | Ссылка на инструкцию. | 
**Title** | **String** | Название инструкции, которое будет отображаться на карточке товара.  | [optional] 

## Examples

- Prepare the resource
```powershell
$OfferManualDTO = Initialize-ympa_powershell_clientOfferManualDTO  -Url null `
 -Title null
```

- Convert the resource to JSON
```powershell
$OfferManualDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

