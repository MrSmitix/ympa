package models

// ParcelBoxLabelDto - Информация о ярлыке для коробки.
type ParcelBoxLabelDto struct {

	// Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md). 
	Url string `json:"url"`

	// Юридическое название магазина.
	SupplierName string `json:"supplierName"`

	// Юридическое название службы доставки.
	DeliveryServiceName string `json:"deliveryServiceName"`

	// Идентификатор заказа в системе Маркета.
	OrderId int64 `json:"orderId"`

	// Идентификатор заказа в информационной системе магазина.  Совпадает с `orderId`, если Маркету неизвестен номер заказа в системе магазина. 
	OrderNum string `json:"orderNum"`

	// Фамилия и инициалы получателя заказа.
	RecipientName string `json:"recipientName"`

	// Идентификатор коробки.
	BoxId int64 `json:"boxId"`

	// Идентификатор коробки в информационной системе магазина.  Возвращается в формате: `номер заказа на Маркете-номер коробки`. Например, `7206821‑1`, `7206821‑2` и т. д. 
	FulfilmentId string `json:"fulfilmentId"`

	// Номер коробки в заказе. Возвращается в формате: `номер места/общее количество мест`. 
	Place string `json:"place"`

	// {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: `weight кг`. 
	Weight string `json:"weight"`

	// Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
	DeliveryServiceId string `json:"deliveryServiceId"`

	// Адрес получателя.
	DeliveryAddress string `json:"deliveryAddress,omitempty"`

	// Дата отгрузки в формате `dd.MM.yyyy`.
	ShipmentDate string `json:"shipmentDate,omitempty"`
}
