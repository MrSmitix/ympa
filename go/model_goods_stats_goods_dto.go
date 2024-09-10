/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package ympa_go_gin_server

// GoodsStatsGoodsDto - Информация о товаре.
type GoodsStatsGoodsDto struct {

	// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	ShopSku string `json:"shopSku,omitempty" validate:"regexp=^[^\\\\x00-\\\\x08\\\\x0A-\\\\x1f\\\\x7f]{1,255}$"`

	// SKU на Маркете.
	MarketSku int64 `json:"marketSku,omitempty"`

	// Название товара.
	Name string `json:"name,omitempty"`

	// Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/).
	Price float32 `json:"price,omitempty"`

	// Идентификатор категории товара на Маркете.
	CategoryId int64 `json:"categoryId,omitempty"`

	// Название категории товара на Маркете.
	CategoryName string `json:"categoryName,omitempty"`

	WeightDimensions GoodsStatsWeightDimensionsDto `json:"weightDimensions,omitempty"`

	// Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе. 
	Warehouses *[]GoodsStatsWarehouseDto `json:"warehouses,omitempty"`

	// Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
	Tariffs *[]TariffDto `json:"tariffs,omitempty"`

	// Ссылки (URL) изображений товара в хорошем качестве.
	Pictures *[]string `json:"pictures,omitempty"`
}
