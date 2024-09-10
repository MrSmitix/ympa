package models

import (
	"time"
)

// ReturnDto - Возврат заказа.
type ReturnDto struct {

	// Идентификатор возврата.
	Id int64 `json:"id,omitempty"`

	// Номер заказа.
	OrderId int64 `json:"orderId,omitempty"`

	// Дата создания возврата клиентом.
	CreationDate time.Time `json:"creationDate,omitempty"`

	// Дата обновления возврата.
	UpdateDate time.Time `json:"updateDate,omitempty"`

	RefundStatus RefundStatusType `json:"refundStatus,omitempty"`

	LogisticPickupPoint LogisticPickupPointDto `json:"logisticPickupPoint,omitempty"`

	ShipmentRecipientType RecipientType `json:"shipmentRecipientType,omitempty"`

	ShipmentStatus ReturnShipmentStatusType `json:"shipmentStatus,omitempty"`

	// Сумма возврата.
	RefundAmount int64 `json:"refundAmount,omitempty"`

	// Список товаров в возврате.
	Items []ReturnItemDto `json:"items"`

	ReturnType ReturnType `json:"returnType,omitempty"`

	// Используется ли опция **Быстрый возврат денег за дешевый брак**. 
	FastReturn bool `json:"fastReturn,omitempty"`
}
