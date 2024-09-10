package models

type CalculateTariffsRequest struct {

	Parameters CalculateTariffsParametersDto `json:"parameters"`

	// Товары, для которых нужно рассчитать стоимость услуг.
	Offers []CalculateTariffsOfferDto `json:"offers"`
}
