package models

// TimePeriodDto - Временной отрезок с комментарием. Требования к содержанию комментария зависят от контекста использования параметра и указаны в описании поля, которое его содержит.
type TimePeriodDto struct {

	// Продолжительность в указанных единицах.
	TimePeriod int32 `json:"timePeriod"`

	TimeUnit TimeUnitType `json:"timeUnit"`

	// Комментарий.
	Comment string `json:"comment,omitempty"`
}
