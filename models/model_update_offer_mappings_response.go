package models

// UpdateOfferMappingsResponse - Описывает проблемы, возникшие при сохранении товара.
type UpdateOfferMappingsResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	// Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. 
	Results *[]UpdateOfferMappingResultDto `json:"results,omitempty"`
}
