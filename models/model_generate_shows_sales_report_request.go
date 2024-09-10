package models

// GenerateShowsSalesReportRequest - Данные, необходимые для генерации отчета.
type GenerateShowsSalesReportRequest struct {

	// Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. 
	BusinessId int64 `json:"businessId,omitempty"`

	// Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. 
	CampaignId int64 `json:"campaignId,omitempty"`

	// Начало периода, включительно.
	DateFrom string `json:"dateFrom"`

	// Конец периода, включительно.
	DateTo string `json:"dateTo"`

	Grouping ShowsSalesGroupingType `json:"grouping"`
}
