/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package ympa_go_gin_server
// AffectedOrderQualityRatingComponentType : Составляющие индекса качества.  **Для модели DBS:** * `DBS_CANCELLATION_RATE` — доля отмененных товаров. * `DBS_LATE_DELIVERY_RATE` — доля заказов, доставленных после плановой даты.  **Для моделей FBS и Экспресс:** * `FBS_CANCELLATION_RATE` — доля отмененных товаров. * `FBS_LATE_SHIP_RATE` — доля не вовремя отгруженных заказов. 
type AffectedOrderQualityRatingComponentType string

// List of AffectedOrderQualityRatingComponentType
const (
	DBS_CANCELLATION_RATE AffectedOrderQualityRatingComponentType = "DBS_CANCELLATION_RATE"
	DBS_LATE_DELIVERY_RATE AffectedOrderQualityRatingComponentType = "DBS_LATE_DELIVERY_RATE"
	FBS_CANCELLATION_RATE AffectedOrderQualityRatingComponentType = "FBS_CANCELLATION_RATE"
	FBS_LATE_SHIP_RATE AffectedOrderQualityRatingComponentType = "FBS_LATE_SHIP_RATE"
)
