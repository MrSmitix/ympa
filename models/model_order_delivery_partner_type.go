package models
// OrderDeliveryPartnerType : Тип сотрудничества со службой доставки в рамках конкретного заказа:  * `SHOP` — магазин работает со службой доставки напрямую или доставляет заказы самостоятельно.  * `YANDEX_MARKET` — магазин работает со службой доставки через Маркет.  * `UNKNOWN` — неизвестный тип. 
type OrderDeliveryPartnerType string

// List of OrderDeliveryPartnerType
const (
	SHOP OrderDeliveryPartnerType = "SHOP"
	YANDEX_MARKET OrderDeliveryPartnerType = "YANDEX_MARKET"
	UNKNOWN OrderDeliveryPartnerType = "UNKNOWN"
)
