package models

// CampaignSettingsScheduleDto - Расписание работы службы доставки в своем регионе.
type CampaignSettingsScheduleDto struct {

	// Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни. 
	AvailableOnHolidays bool `json:"availableOnHolidays,omitempty"`

	// Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете.
	CustomHolidays []string `json:"customHolidays"`

	// Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете.
	CustomWorkingDays []string `json:"customWorkingDays"`

	Period CampaignSettingsTimePeriodDto `json:"period,omitempty"`

	// Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете.
	TotalHolidays []string `json:"totalHolidays"`

	// Список выходных дней недели и государственных праздников.
	WeeklyHolidays []int32 `json:"weeklyHolidays"`
}
