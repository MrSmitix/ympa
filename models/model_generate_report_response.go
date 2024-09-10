package models

// GenerateReportResponse - Ответ на запрос генерации отчета.
type GenerateReportResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result GenerateReportDto `json:"result,omitempty"`
}
