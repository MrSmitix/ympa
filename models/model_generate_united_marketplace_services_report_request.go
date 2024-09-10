package models

import (
	"time"
)

// GenerateUnitedMarketplaceServicesReportRequest - Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
type GenerateUnitedMarketplaceServicesReportRequest struct {

	// Идентификатор бизнеса.
	BusinessId int64 `json:"businessId"`

	// {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. 
	DateTimeFrom time.Time `json:"dateTimeFrom,omitempty"`

	// {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. 
	DateTimeTo time.Time `json:"dateTimeTo,omitempty"`

	// Начало периода, включительно.
	DateFrom string `json:"dateFrom,omitempty"`

	// Конец периода, включительно. Максимальный период — 1 год.
	DateTo string `json:"dateTo,omitempty"`

	// Начальный год формирования акта.
	YearFrom int32 `json:"yearFrom,omitempty"`

	// Начальный номер месяца формирования акта.
	MonthFrom int32 `json:"monthFrom,omitempty"`

	// Конечный год формирования акта.
	YearTo int32 `json:"yearTo,omitempty"`

	// Конечный номер месяца формирования акта.
	MonthTo int32 `json:"monthTo,omitempty"`

	// Список моделей, которые нужны в отчете. 
	PlacementPrograms *[]PlacementType `json:"placementPrograms,omitempty"`

	// Список ИНН, которые нужны в отчете.
	Inns *[]string `json:"inns,omitempty"`

	// Список магазинов, которые нужны в отчете.
	CampaignIds *[]int64 `json:"campaignIds,omitempty"`
}
