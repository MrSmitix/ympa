# QualityRatingDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Rating** | **Int64** | Значение индекса качества. | 
**CalculationDate** | **System.DateTime** | Дата вычисления.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  | 
**Components** | [**QualityRatingComponentDTO[]**](QualityRatingComponentDTO.md) | Составляющие индекса качества. | 

## Examples

- Prepare the resource
```powershell
$QualityRatingDTO = Initialize-ympa_powershell_clientQualityRatingDTO  -Rating null `
 -CalculationDate null `
 -Components null
```

- Convert the resource to JSON
```powershell
$QualityRatingDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

