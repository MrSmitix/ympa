# OfferConditionDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | [**OfferConditionType**](OfferConditionType.md) |  | [optional] 
**Quality** | [**OfferConditionQualityType**](OfferConditionQualityType.md) |  | [optional] 
**Reason** | **String** | Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать.  | [optional] 

## Examples

- Prepare the resource
```powershell
$OfferConditionDTO = Initialize-ympa_powershell_clientOfferConditionDTO  -Type null `
 -Quality null `
 -Reason null
```

- Convert the resource to JSON
```powershell
$OfferConditionDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

