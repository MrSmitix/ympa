package models
// TariffType : Услуга Маркета или дополнительный тариф к услуге размещения:  * `AGENCY_COMMISSION` — прием платежа покупателя.  * `PAYMENT_TRANSFER` — перевод платежа покупателя.  * `STORAGE` — хранение товара на складе Маркета в течение суток.  * `SURPLUS` — хранение излишков на складе Маркета.  * `WITHDRAW` — вывоз товара со склада Маркета.  * `FEE` — размещение товара на Маркете.  * `DELIVERY_TO_CUSTOMER` — доставка покупателю.  * `CROSSREGIONAL_DELIVERY` — доставка в федеральный округ, город или населенный пункт.  * `CROSSREGIONAL_DELIVERY_RETURN` — доставка невыкупов и возвратов.  * `DISPOSAL` — утилизация.  * `SORTING_CENTER_STORAGE` — хранение невыкупов и возвратов.  * `EXPRESS_DELIVERY` — экспресс-доставка покупателю.  * `FF_XDOC_SUPPLY_BOX` — поставка товара через транзитный склад (за короб).  * `FF_XDOC_SUPPLY_PALLET` — поставка товара через транзитный склад (за палету).  * `SORTING` — обработка заказа.  * `MIDDLE_MILE` — средняя миля.  * `RETURN_PROCESSING` — обработка невыкупов и возвратов.  * `EXPRESS_CANCELLED_BY_PARTNER` — отмена заказа с экспресс-доставкой.  * `DELIVERY_TO_CUSTOMER_RETURN` — возврат доставляемого товара на склад.  * `CROSSBORDER_DELIVERY` — доставка из-за рубежа.  * `INTAKE_SORTING_BULKY_CARGO` — сортировка заказов с крупногабаритными товарами, которые Маркет забрал со склада продавца.  * `INTAKE_SORTING_SMALL_GOODS` — сортировка заказов с малогабаритными товарами, которые Маркет забрал со склада продавца.  * `INTAKE_SORTING_DAILY` — организация забора заказов со склада продавца.  * `FF_STORAGE_BILLING` — хранения товаров на складе.  * `CANCELLED_ORDER_FEE_QI` — отмена заказа по вине продавца.  * `LATE_ORDER_EXECUTION_FEE_QI` — несвоевременная отгрузка или доставка.  Подробнее об услугах Маркета читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/index.html). 
type TariffType string

// List of TariffType
const (
	AGENCY_COMMISSION TariffType = "AGENCY_COMMISSION"
	PAYMENT_TRANSFER TariffType = "PAYMENT_TRANSFER"
	STORAGE TariffType = "STORAGE"
	WITHDRAW TariffType = "WITHDRAW"
	SURPLUS TariffType = "SURPLUS"
	FEE TariffType = "FEE"
	DELIVERY_TO_CUSTOMER TariffType = "DELIVERY_TO_CUSTOMER"
	CROSSREGIONAL_DELIVERY TariffType = "CROSSREGIONAL_DELIVERY"
	CROSSREGIONAL_DELIVERY_RETURN TariffType = "CROSSREGIONAL_DELIVERY_RETURN"
	DISPOSAL TariffType = "DISPOSAL"
	SORTING_CENTER_STORAGE TariffType = "SORTING_CENTER_STORAGE"
	EXPRESS_DELIVERY TariffType = "EXPRESS_DELIVERY"
	FF_XDOC_SUPPLY_BOX TariffType = "FF_XDOC_SUPPLY_BOX"
	FF_XDOC_SUPPLY_PALLET TariffType = "FF_XDOC_SUPPLY_PALLET"
	SORTING TariffType = "SORTING"
	MIDDLE_MILE TariffType = "MIDDLE_MILE"
	RETURN_PROCESSING TariffType = "RETURN_PROCESSING"
	EXPRESS_CANCELLED_BY_PARTNER TariffType = "EXPRESS_CANCELLED_BY_PARTNER"
	DELIVERY_TO_CUSTOMER_RETURN TariffType = "DELIVERY_TO_CUSTOMER_RETURN"
	CROSSBORDER_DELIVERY TariffType = "CROSSBORDER_DELIVERY"
	INTAKE_SORTING_BULKY_CARGO TariffType = "INTAKE_SORTING_BULKY_CARGO"
	INTAKE_SORTING_SMALL_GOODS TariffType = "INTAKE_SORTING_SMALL_GOODS"
	INTAKE_SORTING_DAILY TariffType = "INTAKE_SORTING_DAILY"
	FF_STORAGE_BILLING TariffType = "FF_STORAGE_BILLING"
	CANCELLED_ORDER_FEE_QI TariffType = "CANCELLED_ORDER_FEE_QI"
	LATE_ORDER_EXECUTION_FEE_QI TariffType = "LATE_ORDER_EXECUTION_FEE_QI"
)
