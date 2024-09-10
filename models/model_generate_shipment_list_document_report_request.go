package models

// GenerateShipmentListDocumentReportRequest - Данные, необходимые для генерации документа. 
type GenerateShipmentListDocumentReportRequest struct {

	// Идентификатор кампании.
	CampaignId int64 `json:"campaignId"`

	// Идентификатор отгрузки.
	ShipmentId int64 `json:"shipmentId,omitempty"`

	// Фильтр по идентификаторам заказа в отгрузке.
	OrderIds *[]int64 `json:"orderIds,omitempty"`
}
