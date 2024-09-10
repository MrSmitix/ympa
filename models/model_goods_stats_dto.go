package models

// GoodsStatsDto - Отчет по товарам.
type GoodsStatsDto struct {

	// Список товаров.
	ShopSkus []GoodsStatsGoodsDto `json:"shopSkus"`
}
