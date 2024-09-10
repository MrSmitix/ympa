package models
// OrderDeliveryDispatchType : Способ отгрузки:  * `BUYER` — доставка покупателю.  * `MARKET_PARTNER_OUTLET` — доставка в пункт выдачи партнера.  * `MARKET_BRANDED_OUTLET` — доставка в пункт выдачи заказов Маркета.  * `SHOP_OUTLET` — доставка в пункт выдачи заказов магазина.  * `DROPOFF` — доставка в пункт выдачи, который принимает заказы от продавцов и передает их курьерам.  * `UNKNOWN` — неизвестный тип. 
type OrderDeliveryDispatchType string

// List of OrderDeliveryDispatchType
const (
	UNKNOWN OrderDeliveryDispatchType = "UNKNOWN"
	BUYER OrderDeliveryDispatchType = "BUYER"
	MARKET_PARTNER_OUTLET OrderDeliveryDispatchType = "MARKET_PARTNER_OUTLET"
	MARKET_BRANDED_OUTLET OrderDeliveryDispatchType = "MARKET_BRANDED_OUTLET"
	SHOP_OUTLET OrderDeliveryDispatchType = "SHOP_OUTLET"
	DROPOFF OrderDeliveryDispatchType = "DROPOFF"
)
