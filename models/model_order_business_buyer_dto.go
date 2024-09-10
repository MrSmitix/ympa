package models

// OrderBusinessBuyerDto - Информация о покупателе. 
type OrderBusinessBuyerDto struct {

	// ИНН.
	Inn string `json:"inn,omitempty"`

	// КПП.
	Kpp string `json:"kpp,omitempty"`

	// Наименование юридического лица.
	OrganizationName string `json:"organizationName,omitempty"`

	// Юридический адрес.
	OrganizationJurAddress string `json:"organizationJurAddress,omitempty"`
}
