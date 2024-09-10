package models

// OutletWorkingScheduleDto - Список режимов работы точки продаж. 
type OutletWorkingScheduleDto struct {

	// Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * `false` — точка продаж не работает в дни государственных праздников. * `true` — точка продаж работает в дни государственных праздников. 
	WorkInHoliday bool `json:"workInHoliday,omitempty"`

	// Список расписаний работы точки продаж. 
	ScheduleItems []OutletWorkingScheduleItemDto `json:"scheduleItems"`
}
