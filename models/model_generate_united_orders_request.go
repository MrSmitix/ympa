package models

// GenerateUnitedOrdersRequest - Данные, необходимые для генерации отчета. 
type GenerateUnitedOrdersRequest struct {

	// Идентификатор бизнеса.
	BusinessId int64 `json:"businessId"`

	// Начало периода, включительно.
	DateFrom string `json:"dateFrom"`

	// Конец периода, включительно. Максимальный период — 1 год.
	DateTo string `json:"dateTo"`

	// Список магазинов, которые нужны в отчете.
	CampaignIds *[]int64 `json:"campaignIds,omitempty"`

	// Идентификатор акции, товары из которой нужны в отчете.
	PromoId string `json:"promoId,omitempty"`
}
