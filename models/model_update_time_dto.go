package models

import (
	"time"
)

// UpdateTimeDto - Время последнего обновления.
type UpdateTimeDto struct {

	// Время последнего обновления.
	UpdatedAt time.Time `json:"updatedAt"`
}
