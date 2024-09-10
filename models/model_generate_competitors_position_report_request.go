package models

// GenerateCompetitorsPositionReportRequest - Данные, необходимые для генерации отчета.
type GenerateCompetitorsPositionReportRequest struct {

	// Идентификатор бизнеса.
	BusinessId int64 `json:"businessId"`

	// Идентификатор категории.
	CategoryId int64 `json:"categoryId"`

	// Начало периода, включительно.
	DateFrom string `json:"dateFrom"`

	// Конец периода, включительно.
	DateTo string `json:"dateTo"`
}
