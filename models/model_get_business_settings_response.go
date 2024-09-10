package models

// GetBusinessSettingsResponse - Ответ на запрос настроек кабинета.
type GetBusinessSettingsResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result GetBusinessSettingsInfoDto `json:"result,omitempty"`
}
