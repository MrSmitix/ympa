package models

// OfferErrorDto - Сообщение об ошибке, связанной с размещением товара.
type OfferErrorDto struct {

	// Тип ошибки.
	Message string `json:"message,omitempty"`

	// Пояснение.
	Comment string `json:"comment,omitempty"`
}
