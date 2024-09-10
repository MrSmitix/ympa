package models
// PriceCompetitivenessType : Привлекательность цены:  * `OPTIMAL` — привлекательная. * `AVERAGE` — умеренная. * `LOW` — непривлекательная. 
type PriceCompetitivenessType string

// List of PriceCompetitivenessType
const (
	OPTIMAL PriceCompetitivenessType = "OPTIMAL"
	AVERAGE PriceCompetitivenessType = "AVERAGE"
	LOW PriceCompetitivenessType = "LOW"
)
