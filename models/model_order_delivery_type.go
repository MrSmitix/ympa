package models
// OrderDeliveryType : Способ доставки заказа:  * `DELIVERY` — курьерская доставка.  * `PICKUP` — самовывоз.  * `POST` — почта.  * `DIGITAL` — для цифровых товаров.  * `UNKNOWN` — неизвестный тип. 
type OrderDeliveryType string

// List of OrderDeliveryType
const (
	DELIVERY OrderDeliveryType = "DELIVERY"
	PICKUP OrderDeliveryType = "PICKUP"
	POST OrderDeliveryType = "POST"
	DIGITAL OrderDeliveryType = "DIGITAL"
	UNKNOWN OrderDeliveryType = "UNKNOWN"
)
