package models
// ShipmentType : Способ отгрузки заказов:  * `IMPORT` — вы самостоятельно привозите заказы в выбранный сортировочный центр или пункт приема заказов. * `WITHDRAW` — вы отгружаете заказы со своего склада курьерам Яндекс Маркета. 
type ShipmentType string

// List of ShipmentType
const (
	IMPORT ShipmentType = "IMPORT"
	WITHDRAW ShipmentType = "WITHDRAW"
)
