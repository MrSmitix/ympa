package models

// OrderDeliveryAddressDto - Адрес доставки.  Указывается, если `type=DELIVERY`, `type=POST` или `type=PICKUP` (адрес пункта выдачи). 
type OrderDeliveryAddressDto struct {

	// Страна.  Обязательный параметр. 
	Country string `json:"country,omitempty"`

	// Почтовый индекс.  Указывается, если выбрана доставка почтой (`delivery type=POST`). 
	Postcode string `json:"postcode,omitempty"`

	// Город или населенный пункт.  Обязательный параметр. 
	City string `json:"city,omitempty"`

	// Район.
	District string `json:"district,omitempty"`

	// Станция метро.
	Subway string `json:"subway,omitempty"`

	// Улица.  Обязательный параметр. 
	Street string `json:"street,omitempty"`

	// Дом или владение.  Обязательный параметр. 
	House string `json:"house,omitempty"`

	// Корпус или строение.
	Block string `json:"block,omitempty"`

	// Подъезд.
	Entrance string `json:"entrance,omitempty"`

	// Код домофона.
	Entryphone string `json:"entryphone,omitempty"`

	// Этаж.
	Floor string `json:"floor,omitempty"`

	// Квартира или офис.
	Apartment string `json:"apartment,omitempty"`

	// Телефон получателя заказа.  Обязательный параметр. 
	Phone string `json:"phone,omitempty"`

	// Фамилия, имя и отчество получателя заказа.  Обязательный параметр. 
	Recipient string `json:"recipient,omitempty"`

	Gps GpsDto `json:"gps,omitempty"`
}
