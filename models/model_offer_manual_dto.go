package models

// OfferManualDto - Инструкция по использованию товара. 
type OfferManualDto struct {

	// Ссылка на инструкцию.
	Url string `json:"url"`

	// Название инструкции, которое будет отображаться на карточке товара. 
	Title string `json:"title,omitempty"`
}
