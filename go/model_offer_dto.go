/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package ympa_go_gin_server

// OfferDto - Предложение.
type OfferDto struct {

	// Цена предложения.  До версии 2.0 партнерского API у параметра был тип String. 
	Price float32 `json:"price,omitempty"`

	// Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API. 
	FeedId int64 `json:"feedId,omitempty"`

	// Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр `id` указывается только для первого из них, для остальных параметры `id` и `feedId` не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API. 
	Id string `json:"id,omitempty"`

	// Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API. 
	ShopCategoryId string `json:"shopCategoryId,omitempty"`

	// Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API. 
	MarketCategoryId int32 `json:"marketCategoryId,omitempty"`

	// Цена предложения без скидки.
	PreDiscountPrice float32 `json:"preDiscountPrice,omitempty"`

	// Скидка на предложение в процентах.
	Discount int32 `json:"discount,omitempty"`

	// Является ли предложение уцененным:  * `true` — да. * `false` — нет.  Параметр доступен начиная с версии 2.58 партнерского API. 
	CutPrice bool `json:"cutPrice,omitempty"`

	// URL-адрес предложения на сайте магазина.
	Url string `json:"url,omitempty"`

	// Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр `modelid` содержит значение `0`.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра `product`. Например: `https://market.yandex.ru/product/13584121`.  {% endnote %} 
	ModelId int64 `json:"modelId"`

	// Наименование предложения.
	Name string `json:"name,omitempty"`

	Currency CurrencyType `json:"currency,omitempty"`

	// {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
	Bid float32 `json:"bid,omitempty"`

	// {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
	Cbid float32 `json:"cbid,omitempty"`

	// {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA. 
	Fee float32 `json:"fee,omitempty"`

	// Признак блокировки предложения. Возможные значения: * `false` — предложение активно, параметр не выводится. * `true` — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина. 
	Blocked bool `json:"blocked,omitempty"`
}
