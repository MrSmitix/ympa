package models

// OutletWorkingScheduleItemDto - Расписание работы точки продаж.
type OutletWorkingScheduleItemDto struct {

	StartDay DayOfWeekType `json:"startDay"`

	EndDay DayOfWeekType `json:"endDay"`

	// Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`. 
	StartTime string `json:"startTime"`

	// Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`. 
	EndTime string `json:"endTime"`
}
