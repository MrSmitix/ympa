package models

// OrderBoxLayoutItemDto - Информация о товаре в коробке.
type OrderBoxLayoutItemDto struct {

	// Идентификатор товара в заказе.  {% cut \"Где его взять\" %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  {% endcut %}   
	Id int64 `json:"id"`

	// Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с `partialCount`. 
	FullCount int32 `json:"fullCount,omitempty"`

	PartialCount OrderBoxLayoutPartialCountDto `json:"partialCount,omitempty"`

	// Переданные вами коды маркировки.
	Instances *[]BriefOrderItemInstanceDto `json:"instances,omitempty"`
}
