package models

// OrderBuyerDto - Информация о покупателе.  Параметры `id`, `lastName`, `firstName` и `middleName` возвращаются, только если вы работаете по модели DBS. 
type OrderBuyerDto struct {

	// Идентификатор покупателя.
	Id string `json:"id,omitempty"`

	// Фамилия покупателя.
	LastName string `json:"lastName,omitempty"`

	// Имя покупателя.
	FirstName string `json:"firstName,omitempty"`

	// Отчество покупателя.
	MiddleName string `json:"middleName,omitempty"`

	Type OrderBuyerType `json:"type,omitempty"`
}
