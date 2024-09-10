package models

// PromoOfferUpdateWarningDto - Предупреждение, которое появилось при добавлении товара в акцию или изменении его цен.
type PromoOfferUpdateWarningDto struct {

	Code PromoOfferUpdateWarningCodeType `json:"code"`

	// Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете. 
	CampaignIds *[]int64 `json:"campaignIds,omitempty"`
}
