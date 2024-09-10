package models

// OrderBuyerInfoDto - Информация о покупателе и его номере телефона.
type OrderBuyerInfoDto struct {

	// Идентификатор покупателя.
	Id string `json:"id,omitempty"`

	// Фамилия покупателя.
	LastName string `json:"lastName,omitempty"`

	// Имя покупателя.
	FirstName string `json:"firstName,omitempty"`

	// Отчество покупателя.
	MiddleName string `json:"middleName,omitempty"`

	Type OrderBuyerType `json:"type,omitempty"`

	// Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: `+<код_страны><код_региона><номер_телефона>`. 
	Phone string `json:"phone,omitempty"`
}
