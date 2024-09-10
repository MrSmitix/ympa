/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package ympa_go_gin_server

// PromoOfferUpdateWarningDto - Предупреждение, которое появилось при добавлении товара в акцию или изменении его цен.
type PromoOfferUpdateWarningDto struct {

	Code PromoOfferUpdateWarningCodeType `json:"code"`

	// Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете. 
	CampaignIds *[]int64 `json:"campaignIds,omitempty"`
}
