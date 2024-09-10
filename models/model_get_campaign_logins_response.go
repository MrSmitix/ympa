package models

// GetCampaignLoginsResponse - Ответ на запрос списка логинов, связанных с магазином.
type GetCampaignLoginsResponse struct {

	// Список логинов.
	Logins []string `json:"logins"`
}
