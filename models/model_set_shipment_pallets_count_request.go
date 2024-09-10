package models

// SetShipmentPalletsCountRequest - Запрос на передачу количества упаковок в отгрузке.
type SetShipmentPalletsCountRequest struct {

	// Количество упаковок в отгрузке.
	PlacesCount int32 `json:"placesCount"`
}
