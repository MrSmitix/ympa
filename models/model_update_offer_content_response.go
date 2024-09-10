package models

// UpdateOfferContentResponse - Описывает проблемы, которые появились при сохранении товара.
type UpdateOfferContentResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	// Ошибки и предупреждения, которые появились при обработке переданных значений. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. 
	Results *[]UpdateOfferContentResultDto `json:"results,omitempty"`
}
