package models

// GenerateStocksOnWarehousesReportRequest - Данные, необходимые для генерации отчета. 
type GenerateStocksOnWarehousesReportRequest struct {

	// Идентификатор магазина.
	CampaignId int64 `json:"campaignId"`

	// Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).
	WarehouseIds *[]int64 `json:"warehouseIds,omitempty"`

	// Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.
	ReportDate string `json:"reportDate,omitempty"`

	// Фильтр по категориям на Маркете (кроме модели FBY).
	CategoryIds *[]int64 `json:"categoryIds,omitempty"`

	// Фильтр по наличию остатков (кроме модели FBY).
	HasStocks bool `json:"hasStocks,omitempty"`
}
