package models

// GenerateBoostConsolidatedRequest - Данные, необходимые для генерации отчета. 
type GenerateBoostConsolidatedRequest struct {

	// Идентификатор бизнеса.
	BusinessId int64 `json:"businessId"`

	// Начало периода, включительно.
	DateFrom string `json:"dateFrom"`

	// Конец периода, включительно.
	DateTo string `json:"dateTo"`
}
