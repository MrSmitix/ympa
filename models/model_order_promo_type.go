package models
// OrderPromoType : Тип скидки:  * `DIRECT_DISCOUNT` — прямая скидка, которую устанавливает продавец или Маркет.  * `BLUE_SET` — комплекты.  * `BLUE_FLASH` — флеш-акция.  * `MARKET_COUPON` — скидка по промокоду Маркета.  * `MARKET_PROMOCODE` — скидка по промокоду магазина.  * `MARKET_BLUE` — скидка на Маркете.  * `YANDEX_PLUS` — бесплатная доставка с подпиской Яндекс Плюс.  * `YANDEX_EMPLOYEE` — бесплатная доставка по определенным адресам.  * `LIMITED_FREE_DELIVERY_PROMO` — бесплатная доставка по ограниченному предложению.  * `FREE_DELIVERY_THRESHOLD` — бесплатная доставка при достижении определенной суммы заказа.  * `MULTICART_DISCOUNT` — скидка за то, что оформлена мультикорзина.  * `FREE_DELIVERY_FOR_LDI` — бесплатная доставка за то, что один из товаров крупногабаритный.  * `FREE_DELIVERY_FOR_LSC` — бесплатная доставка за то, что одна из корзин в мультикорзине крупногабаритная.  * `FREE_PICKUP` — бесплатная доставка в пункт выдачи заказов.  * `CHEAPEST_AS_GIFT` — самый дешевый товар в подарок.  * `CASHBACK` — кешбэк.  * `SUPPLIER_MULTICART_DISCOUNT` — скидка за доставку.  * `SPREAD_DISCOUNT_COUNT` — скидка за количество одинаковых товаров.  * `SPREAD_DISCOUNT_RECEIPT` — скидка от суммы чека.  * `ANNOUNCEMENT_PROMO` — информационная акция, скидка не применяется к товарам.  * `DISCOUNT_BY_PAYMENT_TYPE` — прямая скидка при оплате картой Плюса.  * `PERCENT_DISCOUNT` — прямая скидка в процентах.  * `DCO_EXTRA_DISCOUNT` — дополнительная скидка, необходимая для расчета субсидии от Маркета.  * `EMPTY_PROMO` — скрытые промокоды.  * `BLOCKING_PROMO` — блокирующее промо.  * `UNKNOWN` — неизвестный тип.  Устаревшие типы:  * `GENERIC_BUNDLE`.  * `MARKET_DEAL`.  * `MARKET_PRIME`.  * `MARKET_COIN`.  * `BERU_PLUS`.  * `PRICE_DROP_AS_YOU_SHOP`.  * `SECRET_SALE`. 
type OrderPromoType string

// List of OrderPromoType
const (
	DIRECT_DISCOUNT OrderPromoType = "DIRECT_DISCOUNT"
	BLUE_SET OrderPromoType = "BLUE_SET"
	BLUE_FLASH OrderPromoType = "BLUE_FLASH"
	GENERIC_BUNDLE OrderPromoType = "GENERIC_BUNDLE"
	MARKET_COUPON OrderPromoType = "MARKET_COUPON"
	MARKET_PROMOCODE OrderPromoType = "MARKET_PROMOCODE"
	MARKET_DEAL OrderPromoType = "MARKET_DEAL"
	MARKET_BLUE OrderPromoType = "MARKET_BLUE"
	MARKET_PRIME OrderPromoType = "MARKET_PRIME"
	YANDEX_PLUS OrderPromoType = "YANDEX_PLUS"
	BERU_PLUS OrderPromoType = "BERU_PLUS"
	MARKET_COIN OrderPromoType = "MARKET_COIN"
	YANDEX_EMPLOYEE OrderPromoType = "YANDEX_EMPLOYEE"
	LIMITED_FREE_DELIVERY_PROMO OrderPromoType = "LIMITED_FREE_DELIVERY_PROMO"
	FREE_DELIVERY_THRESHOLD OrderPromoType = "FREE_DELIVERY_THRESHOLD"
	MULTICART_DISCOUNT OrderPromoType = "MULTICART_DISCOUNT"
	PRICE_DROP_AS_YOU_SHOP OrderPromoType = "PRICE_DROP_AS_YOU_SHOP"
	FREE_DELIVERY_FOR_LDI OrderPromoType = "FREE_DELIVERY_FOR_LDI"
	FREE_DELIVERY_FOR_LSC OrderPromoType = "FREE_DELIVERY_FOR_LSC"
	SECRET_SALE OrderPromoType = "SECRET_SALE"
	FREE_PICKUP OrderPromoType = "FREE_PICKUP"
	CHEAPEST_AS_GIFT OrderPromoType = "CHEAPEST_AS_GIFT"
	CASHBACK OrderPromoType = "CASHBACK"
	SUPPLIER_MULTICART_DISCOUNT OrderPromoType = "SUPPLIER_MULTICART_DISCOUNT"
	SPREAD_DISCOUNT_COUNT OrderPromoType = "SPREAD_DISCOUNT_COUNT"
	SPREAD_DISCOUNT_RECEIPT OrderPromoType = "SPREAD_DISCOUNT_RECEIPT"
	ANNOUNCEMENT_PROMO OrderPromoType = "ANNOUNCEMENT_PROMO"
	DISCOUNT_BY_PAYMENT_TYPE OrderPromoType = "DISCOUNT_BY_PAYMENT_TYPE"
	PERCENT_DISCOUNT OrderPromoType = "PERCENT_DISCOUNT"
	DCO_EXTRA_DISCOUNT OrderPromoType = "DCO_EXTRA_DISCOUNT"
	EMPTY_PROMO OrderPromoType = "EMPTY_PROMO"
	BLOCKING_PROMO OrderPromoType = "BLOCKING_PROMO"
	UNKNOWN OrderPromoType = "UNKNOWN"
)
