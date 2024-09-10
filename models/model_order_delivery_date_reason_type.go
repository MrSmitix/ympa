package models
// OrderDeliveryDateReasonType : Причина переноса доставки заказа. Возможные причины изменения даты:   - ```USER_MOVED_DELIVERY_DATES``` — покупатель попросил изменить дату или вы договорились привезти ему заказ раньше изначальной даты. Кроме этого указывается для подтверждения даты доставки товаров на заказ с долгой (31-60 дней) доставкой.   - ```PARTNER_MOVED_DELIVERY_DATES``` — магазин не может доставить заказ в срок. 
type OrderDeliveryDateReasonType string

// List of OrderDeliveryDateReasonType
const (
	USER_MOVED_DELIVERY_DATES OrderDeliveryDateReasonType = "USER_MOVED_DELIVERY_DATES"
	PARTNER_MOVED_DELIVERY_DATES OrderDeliveryDateReasonType = "PARTNER_MOVED_DELIVERY_DATES"
)
