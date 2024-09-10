# CategoryParameterDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор характеристики. | 
**Name** | **String** | Название характеристики. | [optional] 
**Type** | [**ParameterType**](ParameterType.md) |  | 
**Unit** | [**CategoryParameterUnitDTO**](CategoryParameterUnitDTO.md) |  | [optional] 
**Description** | **String** | Описание характеристики. | [optional] 
**RecommendationTypes** | [**OfferCardRecommendationType[]**](OfferCardRecommendationType.md) | Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика. | [optional] 
**Required** | **Boolean** | Обязательность характеристики. | 
**Filtering** | **Boolean** | Используется ли характеристика в фильтре. | 
**Distinctive** | **Boolean** | Является ли характеристика особенностью варианта. | 
**Multivalue** | **Boolean** | Можно ли передать сразу несколько значений. | 
**AllowCustomValues** | **Boolean** | Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа &#x60;ENUM&#x60;. | 
**Values** | [**ParameterValueOptionDTO[]**](ParameterValueOptionDTO.md) | Список допустимых значений параметра. Только для характеристик типа &#x60;ENUM&#x60;. | [optional] 
**Constraints** | [**ParameterValueConstraintsDTO**](ParameterValueConstraintsDTO.md) |  | [optional] 
**ValueRestrictions** | [**ValueRestrictionDTO[]**](ValueRestrictionDTO.md) | Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа &#x60;ENUM&#x60;. | [optional] 

## Examples

- Prepare the resource
```powershell
$CategoryParameterDTO = Initialize-ympa_powershell_clientCategoryParameterDTO  -Id null `
 -Name null `
 -Type null `
 -Unit null `
 -Description null `
 -RecommendationTypes null `
 -Required null `
 -Filtering null `
 -Distinctive null `
 -Multivalue null `
 -AllowCustomValues null `
 -Values null `
 -Constraints null `
 -ValueRestrictions null
```

- Convert the resource to JSON
```powershell
$CategoryParameterDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

