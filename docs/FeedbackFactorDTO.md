
# Table `FeedbackFactorDTO`
(mapped from: FeedbackFactorDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | long PRIMARY KEY AUTOINCREMENT |  | **kotlin.Long** | Идентификатор параметра. |  [optional]
**title** | title | text |  | **kotlin.String** | Название параметра. Например, &#x60;Скорость обработки заказа&#x60;. |  [optional]
**description** | description | text |  | **kotlin.String** | Описание параметра. Например, &#x60;Как быстро с вами связались для подтверждения заказа?&#x60;. |  [optional]
**value** | value | int |  | **kotlin.Int** | Оценка по параметру, указанная в отзыве: от &#x60;1&#x60; (низшая оценка) до &#x60;5&#x60; (высшая оценка).  |  [optional]






