package models

// GetBusinessSettingsInfoDto - Информация о кабинете и его настройках.
type GetBusinessSettingsInfoDto struct {

	Info BusinessDto `json:"info,omitempty"`

	Settings BusinessSettingsDto `json:"settings,omitempty"`
}
