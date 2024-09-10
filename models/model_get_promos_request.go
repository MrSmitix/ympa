package models

// GetPromosRequest - Фильтры для получения списка акций.
type GetPromosRequest struct {

	Participation PromoParticipationType `json:"participation,omitempty"`

	Mechanics MechanicsType `json:"mechanics,omitempty"`
}
