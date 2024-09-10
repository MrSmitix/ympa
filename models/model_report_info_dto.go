package models

import (
	"time"
)

// ReportInfoDto - Статус генерации и ссылка на готовый отчет.
type ReportInfoDto struct {

	Status ReportStatusType `json:"status"`

	SubStatus ReportSubStatusType `json:"subStatus,omitempty"`

	// Дата и время запроса на генерацию.
	GenerationRequestedAt time.Time `json:"generationRequestedAt"`

	// Дата и время завершения генерации.
	GenerationFinishedAt time.Time `json:"generationFinishedAt,omitempty"`

	// Ссылка на готовый отчет.
	File string `json:"file,omitempty"`

	// Ожидаемая продолжительность генерации в миллисекундах.
	EstimatedGenerationTime int64 `json:"estimatedGenerationTime,omitempty"`
}
