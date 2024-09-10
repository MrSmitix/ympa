package models

// OfferMappingErrorDto - Текст ошибки.
type OfferMappingErrorDto struct {

	Type OfferMappingErrorType `json:"type"`

	// Идентификатор характеристики, с которой связана ошибка.
	ParameterId int64 `json:"parameterId,omitempty"`

	// Текст ошибки.
	Message string `json:"message"`
}
