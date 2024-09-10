package models

// OrderBoxesLayoutDto - Распределение товаров по коробкам.
type OrderBoxesLayoutDto struct {

	// Список коробок.
	Boxes []EnrichedOrderBoxLayoutDto `json:"boxes"`
}
