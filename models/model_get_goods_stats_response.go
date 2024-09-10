package models

// GetGoodsStatsResponse - Ответ на запрос отчета по товарам.
type GetGoodsStatsResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result GoodsStatsDto `json:"result,omitempty"`
}
