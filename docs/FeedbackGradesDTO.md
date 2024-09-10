
# Table `FeedbackGradesDTO`
(mapped from: FeedbackGradesDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**factors** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;FeedbackFactorDTO&gt;**](FeedbackFactorDTO.md) | Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр &#x60;delivery&#x60;) указал автор.  | 
**average** | average | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Общая оценка, указанная в отзыве: от &#x60;1&#x60; («Ужасный магазин») до &#x60;5&#x60; («Отличный магазин»). |  [optional]
**agreeCount** | agreeCount | long |  | **kotlin.Long** | Количество пользователей, считающих отзыв полезным. |  [optional]
**rejectCount** | rejectCount | long |  | **kotlin.Long** | Количество пользователей, считающих отзыв бесполезным. |  [optional]


# **Table `FeedbackGradesDTOFeedbackFactorDTO`**
(mapped from: FeedbackGradesDTOFeedbackFactorDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
feedbackGradesDTO | feedbackGradesDTO | long | | kotlin.Long | Primary Key | *one*
feedbackFactorDTO | feedbackFactorDTO | long | | kotlin.Long | Foreign Key | *many*






