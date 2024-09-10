package models

// OrderBusinessDocumentsDto - Информация о документах. 
type OrderBusinessDocumentsDto struct {

	Upd DocumentDto `json:"upd,omitempty"`

	Ukd DocumentDto `json:"ukd,omitempty"`

	TorgTwelve DocumentDto `json:"torgTwelve,omitempty"`

	Sf DocumentDto `json:"sf,omitempty"`

	Ksf DocumentDto `json:"ksf,omitempty"`
}
