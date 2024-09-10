# FeedbackGradesDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**average** | **f64** | Общая оценка, указанная в отзыве: от `1` («Ужасный магазин») до `5` («Отличный магазин»). | [optional] [default to None]
**agree_count** | **i64** | Количество пользователей, считающих отзыв полезным. | [optional] [default to None]
**reject_count** | **i64** | Количество пользователей, считающих отзыв бесполезным. | [optional] [default to None]
**factors** | [**Vec<models::FeedbackFactorDto>**](FeedbackFactorDTO.md) | Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор.  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


