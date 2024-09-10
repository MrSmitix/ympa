// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server




// GeneratePricesReportRequest - Данные, необходимые для генерации отчета.
type GeneratePricesReportRequest struct {

	// Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`. 
	BusinessId int64 `json:"businessId,omitempty"`

	// Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно. 
	CampaignId int64 `json:"campaignId,omitempty"`

	// Фильтр по категориям на Маркете.
	CategoryIds *[]int64 `json:"categoryIds,omitempty"`

	// Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`. 
	CreationDateFrom string `json:"creationDateFrom,omitempty"`

	// Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`. 
	CreationDateTo string `json:"creationDateTo,omitempty"`
}

// AssertGeneratePricesReportRequestRequired checks if the required fields are not zero-ed
func AssertGeneratePricesReportRequestRequired(obj GeneratePricesReportRequest) error {
	return nil
}

// AssertGeneratePricesReportRequestConstraints checks if the values respects the defined constraints
func AssertGeneratePricesReportRequestConstraints(obj GeneratePricesReportRequest) error {
	return nil
}
