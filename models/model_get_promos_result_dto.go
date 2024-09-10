package models

// GetPromosResultDto - Информация об акциях Маркета.
type GetPromosResultDto struct {

	// Акции Маркета.
	Promos []GetPromoDto `json:"promos"`
}
