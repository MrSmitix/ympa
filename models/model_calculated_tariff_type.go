package models
// CalculatedTariffType : Услуга Маркета:  * `AGENCY_COMMISSION` — прием платежа покупателя.  * `PAYMENT_TRANSFER` — перевод платежа покупателя.  * `FEE` — размещение товара на Маркете.  * `DELIVERY_TO_CUSTOMER` — доставка покупателю.  * `CROSSREGIONAL_DELIVERY` — доставка в федеральный округ, город или населенный пункт.  * `EXPRESS_DELIVERY` — экспресс-доставка покупателю.  * `SORTING` — обработка заказа.  * `MIDDLE_MILE` — средняя миля.  Подробнее об услугах Маркета читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/index.html). 
type CalculatedTariffType string

// List of CalculatedTariffType
const (
	AGENCY_COMMISSION CalculatedTariffType = "AGENCY_COMMISSION"
	PAYMENT_TRANSFER CalculatedTariffType = "PAYMENT_TRANSFER"
	FEE CalculatedTariffType = "FEE"
	DELIVERY_TO_CUSTOMER CalculatedTariffType = "DELIVERY_TO_CUSTOMER"
	CROSSREGIONAL_DELIVERY CalculatedTariffType = "CROSSREGIONAL_DELIVERY"
	EXPRESS_DELIVERY CalculatedTariffType = "EXPRESS_DELIVERY"
	SORTING CalculatedTariffType = "SORTING"
	MIDDLE_MILE CalculatedTariffType = "MIDDLE_MILE"
)
