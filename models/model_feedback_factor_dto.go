package models

// FeedbackFactorDto - Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. 
type FeedbackFactorDto struct {

	// Идентификатор параметра.
	Id int64 `json:"id,omitempty"`

	// Название параметра. Например, `Скорость обработки заказа`.
	Title string `json:"title,omitempty"`

	// Описание параметра. Например, `Как быстро с вами связались для подтверждения заказа?`.
	Description string `json:"description,omitempty"`

	// Оценка по параметру, указанная в отзыве: от `1` (низшая оценка) до `5` (высшая оценка). 
	Value int32 `json:"value,omitempty"`
}
