/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package ympa_go_gin_server

// OfferMappingDto - Информация о текущей карточке товара на Маркете.
type OfferMappingDto struct {

	// SKU на Маркете.
	MarketSku int64 `json:"marketSku,omitempty"`

	// Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр `marketSku`), но одинаковый идентификатор модели товара. 
	ModelId int64 `json:"modelId,omitempty"`

	// Идентификатор категории для текущей карточки товара на Маркете.
	CategoryId int64 `json:"categoryId,omitempty"`
}
