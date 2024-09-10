package models

// CampaignSettingsTimePeriodDto - Период, за который рассчитывается итоговый список нерабочих дней службы доставки.
type CampaignSettingsTimePeriodDto struct {

	// Формат даты: `ДД-ММ-ГГГГ`. 
	FromDate string `json:"fromDate,omitempty"`

	// Формат даты: `ДД-ММ-ГГГГ`. 
	ToDate string `json:"toDate,omitempty"`
}
