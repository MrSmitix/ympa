package models

// CalculateTariffsResponseDto - Расчет стоимости услуг.
type CalculateTariffsResponseDto struct {

	// Стоимость услуг.
	Offers []CalculateTariffsOfferInfoDto `json:"offers"`
}
