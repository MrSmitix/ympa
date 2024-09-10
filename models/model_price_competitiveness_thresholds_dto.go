package models

// PriceCompetitivenessThresholdsDto - Максимальные значения цены, при которых она является привлекательной или умеренной.
type PriceCompetitivenessThresholdsDto struct {

	OptimalPrice BasePriceDto `json:"optimalPrice,omitempty"`

	AveragePrice BasePriceDto `json:"averagePrice,omitempty"`
}
