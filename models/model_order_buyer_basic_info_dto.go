package models

// OrderBuyerBasicInfoDto - Информация о покупателе с базовыми полями.
type OrderBuyerBasicInfoDto struct {

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
