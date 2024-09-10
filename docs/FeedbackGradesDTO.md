# FeedbackGradesDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Average** | **Decimal** | Общая оценка, указанная в отзыве: от &#x60;1&#x60; («Ужасный магазин») до &#x60;5&#x60; («Отличный магазин»). | [optional] 
**AgreeCount** | **Int64** | Количество пользователей, считающих отзыв полезным. | [optional] 
**RejectCount** | **Int64** | Количество пользователей, считающих отзыв бесполезным. | [optional] 
**Factors** | [**FeedbackFactorDTO[]**](FeedbackFactorDTO.md) | Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр &#x60;delivery&#x60;) указал автор.  | 

## Examples

- Prepare the resource
```powershell
$FeedbackGradesDTO = Initialize-ympa_powershell_clientFeedbackGradesDTO  -Average null `
 -AgreeCount null `
 -RejectCount null `
 -Factors null
```

- Convert the resource to JSON
```powershell
$FeedbackGradesDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

