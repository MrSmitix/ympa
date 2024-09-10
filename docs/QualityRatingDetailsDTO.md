# QualityRatingDetailsDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AffectedOrders** | [**QualityRatingAffectedOrderDTO[]**](QualityRatingAffectedOrderDTO.md) | Список заказов, которые повлияли на индекс качества. | 

## Examples

- Prepare the resource
```powershell
$QualityRatingDetailsDTO = Initialize-ympa_powershell_clientQualityRatingDetailsDTO  -AffectedOrders null
```

- Convert the resource to JSON
```powershell
$QualityRatingDetailsDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

