# OfferContentErrorDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | [**OfferContentErrorType**](OfferContentErrorType.md) |  | 
**ParameterId** | **Int64** | Идентификатор характеристики, с которой связана ошибка. | [optional] 
**Message** | **String** | Текст ошибки. | 

## Examples

- Prepare the resource
```powershell
$OfferContentErrorDTO = Initialize-ympa_powershell_clientOfferContentErrorDTO  -Type null `
 -ParameterId null `
 -Message null
```

- Convert the resource to JSON
```powershell
$OfferContentErrorDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

