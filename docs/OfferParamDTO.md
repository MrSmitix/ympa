# OfferParamDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** | Название.  Должно совпадать с названием характеристики на Маркете. Узнать его можно из Excel-шаблона категории или через запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).  | 
**Value** | **String** | Значение.  | 

## Examples

- Prepare the resource
```powershell
$OfferParamDTO = Initialize-ympa_powershell_clientOfferParamDTO  -Name Wi-Fi `
 -Value есть
```

- Convert the resource to JSON
```powershell
$OfferParamDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

