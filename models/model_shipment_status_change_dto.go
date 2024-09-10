package models

import (
	"time"
)

// ShipmentStatusChangeDto - Статус отгрузки.
type ShipmentStatusChangeDto struct {

	Status ShipmentStatusType `json:"status,omitempty"`

	// Описание статуса отгрузки.
	Description string `json:"description,omitempty"`

	// Время последнего изменения статуса отгрузки.
	UpdateTime time.Time `json:"updateTime,omitempty"`
}
