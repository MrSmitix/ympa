# FeedbackGradesDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**average** | **float** | Общая оценка, указанная в отзыве: от &#x60;1&#x60; («Ужасный магазин») до &#x60;5&#x60; («Отличный магазин»). | [optional] 
**agreeCount** | **int** | Количество пользователей, считающих отзыв полезным. | [optional] 
**rejectCount** | **int** | Количество пользователей, считающих отзыв бесполезным. | [optional] 
**factors** | [**OpenAPI\Server\Model\FeedbackFactorDTO**](FeedbackFactorDTO.md) | Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр &#x60;delivery&#x60;) указал автор. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


