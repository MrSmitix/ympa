package models

// DocumentDto - Информация о документе.
type DocumentDto struct {

	Status OrderDocumentStatusType `json:"status,omitempty"`

	// Номер документа.
	Number string `json:"number,omitempty"`

	// Дата создания документа.
	Date string `json:"date,omitempty"`
}
