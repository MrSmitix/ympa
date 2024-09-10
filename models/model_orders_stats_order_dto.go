package models

import (
	"time"
)

// OrdersStatsOrderDto - Информация о заказе.
type OrdersStatsOrderDto struct {

	// Идентификатор заказа.
	Id int64 `json:"id,omitempty"`

	// Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
	CreationDate string `json:"creationDate,omitempty"`

	// Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва). 
	StatusUpdateDate time.Time `json:"statusUpdateDate,omitempty"`

	Status OrderStatsStatusType `json:"status,omitempty"`

	// Идентификатор заказа в информационной системе магазина.
	PartnerOrderId string `json:"partnerOrderId,omitempty"`

	PaymentType OrdersStatsOrderPaymentType `json:"paymentType,omitempty"`

	// Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
	Fake bool `json:"fake,omitempty"`

	DeliveryRegion OrdersStatsDeliveryRegionDto `json:"deliveryRegion,omitempty"`

	// Список товаров в заказе после возможных изменений.
	Items []OrdersStatsItemDto `json:"items"`

	// Список товаров в заказе до изменений.
	InitialItems *[]OrdersStatsItemDto `json:"initialItems,omitempty"`

	// Информация о денежных переводах по заказу.
	Payments []OrdersStatsPaymentDto `json:"payments"`

	// Информация о комиссиях за заказ.
	Commissions []OrdersStatsCommissionDto `json:"commissions"`
}
