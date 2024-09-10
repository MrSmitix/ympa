package models
// OrdersStatsPriceType : Тип скидки или цена на товар: - `BUYER` — цена на товар с учетом скидок, в том числе купонов. - `CASHBACK` — баллы Плюса. - `MARKETPLACE` — купоны. 
type OrdersStatsPriceType string

// List of OrdersStatsPriceType
const (
	BUYER OrdersStatsPriceType = "BUYER"
	CASHBACK OrdersStatsPriceType = "CASHBACK"
	MARKETPLACE OrdersStatsPriceType = "MARKETPLACE"
)
