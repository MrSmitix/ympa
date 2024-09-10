package models

// OrderParcelBoxDto - Информация о грузоместе.
type OrderParcelBoxDto struct {

	// Идентификатор грузоместа.
	Id int64 `json:"id,omitempty"`

	// Идентификатор грузового места в информационной системе магазина.
	FulfilmentId string `json:"fulfilmentId,omitempty"`
}
