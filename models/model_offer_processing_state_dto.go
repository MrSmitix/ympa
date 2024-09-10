package models

// OfferProcessingStateDto - Информация о статусе публикации товара на Маркете.
type OfferProcessingStateDto struct {

	Status OfferProcessingStatusType `json:"status,omitempty"`

	// Причины, по которым товар не прошел модерацию.
	Notes *[]OfferProcessingNoteDto `json:"notes,omitempty"`
}
