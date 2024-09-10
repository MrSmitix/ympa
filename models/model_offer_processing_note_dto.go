package models

// OfferProcessingNoteDto - Причины, по которым товар не прошел модерацию.
type OfferProcessingNoteDto struct {

	Type OfferProcessingNoteType `json:"type,omitempty"`

	// Дополнительная информация о причине отклонения товара. 
	Payload string `json:"payload,omitempty"`
}
