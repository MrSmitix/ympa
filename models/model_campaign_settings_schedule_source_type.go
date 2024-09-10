package models
// CampaignSettingsScheduleSourceType : Источник информации о расписании работы службы доставки. Возможные значения: * `WEB` — информация получена из настроек кабинета продавца на Маркете. * `YML` — информация получена из прайс-листа магазина. 
type CampaignSettingsScheduleSourceType string

// List of CampaignSettingsScheduleSourceType
const (
	WEB CampaignSettingsScheduleSourceType = "WEB"
	YML CampaignSettingsScheduleSourceType = "YML"
)
