package models

// OrderItemInstanceModificationDto - Позиция в корзине, требующая маркировки.
type OrderItemInstanceModificationDto struct {

	// Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. 
	Id int64 `json:"id"`

	// Список кодов маркировки единиц товара. 
	Instances []BriefOrderItemInstanceDto `json:"instances"`
}
