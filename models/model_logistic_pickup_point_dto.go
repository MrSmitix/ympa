package models

// LogisticPickupPointDto - Описание пункта вывоза для возврата.
type LogisticPickupPointDto struct {

	// Идентификатор пункта вывоза.
	Id int64 `json:"id,omitempty"`

	// Название пункта вывоза.
	Name string `json:"name,omitempty"`

	Address PickupAddressDto `json:"address,omitempty"`

	// Дополнительные инструкции к вывозу.
	Instruction string `json:"instruction,omitempty"`

	Type LogisticPointType `json:"type,omitempty"`

	// Идентификатор логистического партнера, к которому относится логистическая точка.
	LogisticPartnerId int64 `json:"logisticPartnerId,omitempty"`
}
