package models

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
