package models

// OfferCampaignStatusDto - Статус товара в магазине.
type OfferCampaignStatusDto struct {

	// Идентификатор кампании. 
	CampaignId int64 `json:"campaignId"`

	Status OfferCampaignStatusType `json:"status"`
}
