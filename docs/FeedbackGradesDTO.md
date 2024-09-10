# FeedbackGradesDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**average** | **Float64** | Общая оценка, указанная в отзыве: от &#x60;1&#x60; («Ужасный магазин») до &#x60;5&#x60; («Отличный магазин»). | [optional] [default to nothing]
**agreeCount** | **Int64** | Количество пользователей, считающих отзыв полезным. | [optional] [default to nothing]
**rejectCount** | **Int64** | Количество пользователей, считающих отзыв бесполезным. | [optional] [default to nothing]
**factors** | [**Vector{FeedbackFactorDTO}**](FeedbackFactorDTO.md) | Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр &#x60;delivery&#x60;) указал автор.  | [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


