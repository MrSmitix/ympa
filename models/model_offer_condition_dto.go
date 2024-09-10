package models

// OfferConditionDto - Состояние уцененного товара. 
type OfferConditionDto struct {

	Type OfferConditionType `json:"type,omitempty"`

	Quality OfferConditionQualityType `json:"quality,omitempty"`

	// Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать. 
	Reason string `json:"reason,omitempty"`
}
