package models

// WarehouseDto - Информация о складе.
type WarehouseDto struct {

	// Идентификатор склада.
	Id int64 `json:"id"`

	// Название склада.
	Name string `json:"name"`

	// Идентификатор кампании в API и идентификатор магазина.
	CampaignId int64 `json:"campaignId"`

	// Возможна ли доставка по модели Экспресс.
	Express bool `json:"express"`

	Address WarehouseAddressDto `json:"address,omitempty"`
}
