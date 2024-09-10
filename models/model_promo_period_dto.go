package models

import (
	"time"
)

// PromoPeriodDto - Время проведения акции.
type PromoPeriodDto struct {

	// Дата и время начала акции.
	DateTimeFrom time.Time `json:"dateTimeFrom"`

	// Дата и время окончания акции.
	DateTimeTo time.Time `json:"dateTimeTo"`
}
