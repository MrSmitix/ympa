package models

// CampaignDto - Информация о магазине.
type CampaignDto struct {

	// URL магазина.
	Domain string `json:"domain,omitempty"`

	// Идентификатор кампании.
	Id int64 `json:"id,omitempty"`

	// Идентификатор плательщика в Яндекс Балансе.
	ClientId int64 `json:"clientId,omitempty"`

	Business BusinessDto `json:"business,omitempty"`

	PlacementType PlacementType `json:"placementType,omitempty"`
}
