package models

// OrderDeliveryDto - Информация о доставке.
type OrderDeliveryDto struct {

	// Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md). 
	Id string `json:"id,omitempty"`

	Type OrderDeliveryType `json:"type,omitempty"`

	// Наименование службы доставки.
	ServiceName string `json:"serviceName,omitempty"`

	// {% note warning \"\" %}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {% endnote %}  Стоимость доставки в валюте заказа. 
	// Deprecated
	Price float32 `json:"price,omitempty"`

	DeliveryPartnerType OrderDeliveryPartnerType `json:"deliveryPartnerType,omitempty"`

	Courier OrderCourierDto `json:"courier,omitempty"`

	Dates OrderDeliveryDatesDto `json:"dates,omitempty"`

	Region RegionDto `json:"region,omitempty"`

	Address OrderDeliveryAddressDto `json:"address,omitempty"`

	Vat OrderVatType `json:"vat,omitempty"`

	// Идентификатор службы доставки.
	DeliveryServiceId int64 `json:"deliveryServiceId,omitempty"`

	LiftType OrderLiftType `json:"liftType,omitempty"`

	// Стоимость подъема на этаж.
	LiftPrice float32 `json:"liftPrice,omitempty"`

	// Идентификатор пункта самовывоза, присвоенный магазином.
	OutletCode string `json:"outletCode,omitempty"`

	// Формат даты: `ДД-ММ-ГГГГ`. 
	OutletStorageLimitDate string `json:"outletStorageLimitDate,omitempty"`

	DispatchType OrderDeliveryDispatchType `json:"dispatchType,omitempty"`

	// Информация для отслеживания перемещений посылки.
	Tracks *[]OrderTrackDto `json:"tracks,omitempty"`

	// Информация о посылках.
	Shipments *[]OrderShipmentDto `json:"shipments,omitempty"`

	// Приблизительная ли дата доставки.
	Estimated bool `json:"estimated,omitempty"`

	EacType OrderDeliveryEacType `json:"eacType,omitempty"`

	// Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`). 
	EacCode string `json:"eacCode,omitempty"`
}
