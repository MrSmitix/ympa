/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package ympa_go_gin_server

// OrdersStatsItemDto - Список товаров в заказе после возможных изменений.  В ходе обработки заказа Маркет может удалить из него единицы товаров — при проблемах на складе или по инициативе пользователя.  * Если из заказа удалены все единицы товара, его не будет в списке `items` — только в списке `initialItems`.  * Если в заказе осталась хотя бы одна единица товара, он будет и в списке `items` (с уменьшенным количеством единиц `count`), и в списке `initialItems` (с первоначальным количеством единиц `initialCount`). 
type OrdersStatsItemDto struct {

	// Название товара.
	OfferName string `json:"offerName,omitempty"`

	// SKU на Маркете.
	MarketSku int64 `json:"marketSku,omitempty"`

	// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	ShopSku string `json:"shopSku,omitempty" validate:"regexp=^[^\\\\x00-\\\\x08\\\\x0A-\\\\x1f\\\\x7f]{1,255}$"`

	// Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список `initialItems`. 
	Count int32 `json:"count,omitempty"`

	// Цена или скидки на товар.
	Prices *[]OrdersStatsPriceDto `json:"prices,omitempty"`

	Warehouse OrdersStatsWarehouseDto `json:"warehouse,omitempty"`

	// Информация об удалении товара из заказа.
	Details *[]OrdersStatsDetailsDto `json:"details,omitempty"`

	// Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
	CisList *[]string `json:"cisList,omitempty"`

	// Первоначальное количество единиц товара.
	InitialCount int32 `json:"initialCount,omitempty"`

	// Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500. 
	BidFee int32 `json:"bidFee,omitempty"`

	// Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой. 
	CofinanceThreshold float32 `json:"cofinanceThreshold,omitempty"`

	// Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой. 
	CofinanceValue float32 `json:"cofinanceValue,omitempty"`
}
