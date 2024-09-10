package models

// GetReportInfoResponse - Ответ на запрос информации об отчете.
type GetReportInfoResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result ReportInfoDto `json:"result,omitempty"`
}
