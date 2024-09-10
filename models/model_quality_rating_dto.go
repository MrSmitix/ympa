package models

// QualityRatingDto - Информация об индексе качества.
type QualityRatingDto struct {

	// Значение индекса качества.
	Rating int64 `json:"rating"`

	// Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`. 
	CalculationDate string `json:"calculationDate"`

	// Составляющие индекса качества.
	Components []QualityRatingComponentDto `json:"components"`
}
