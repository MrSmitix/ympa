package models

// GetPromoMechanicsInfoDto - Информация о типе акции.
type GetPromoMechanicsInfoDto struct {

	Type MechanicsType `json:"type"`

	PromocodeInfo GetPromoPromocodeInfoDto `json:"promocodeInfo,omitempty"`
}
