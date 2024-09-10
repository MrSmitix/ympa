package models

// OfferContentErrorDto - Текст ошибки.
type OfferContentErrorDto struct {

	Type OfferContentErrorType `json:"type"`

	// Идентификатор характеристики, с которой связана ошибка.
	ParameterId int64 `json:"parameterId,omitempty"`

	// Текст ошибки.
	Message string `json:"message"`
}
