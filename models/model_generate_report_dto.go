package models

// GenerateReportDto - Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
type GenerateReportDto struct {

	// Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
	ReportId string `json:"reportId"`

	// Ожидаемая продолжительность генерации в миллисекундах.
	EstimatedGenerationTime int64 `json:"estimatedGenerationTime"`
}
