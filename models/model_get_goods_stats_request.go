package models

// GetGoodsStatsRequest - Запрос отчета по товарам.
type GetGoodsStatsRequest struct {

	// Список ваших идентификаторов SKU. 
	ShopSkus []string `json:"shopSkus"`
}
