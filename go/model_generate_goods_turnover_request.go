/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package ympa_go_gin_server

// GenerateGoodsTurnoverRequest - Данные, необходимые для генерации отчета. 
type GenerateGoodsTurnoverRequest struct {

	// Идентификатор кампании.
	CampaignId int64 `json:"campaignId"`

	// Дата, за которую нужно рассчитать оборачиваемость. Если параметр не указан, используется текущая дата.
	Date string `json:"date,omitempty"`
}
