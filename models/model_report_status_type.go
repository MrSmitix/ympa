package models
// ReportStatusType : Статус генерации отчета:  * `PENDING` — отчет ожидает генерации. * `PROCESSING` — отчет генерируется. * `FAILED` — во время генерации произошла ошибка. * `DONE` — отчет готов. 
type ReportStatusType string

// List of ReportStatusType
const (
	PENDING ReportStatusType = "PENDING"
	PROCESSING ReportStatusType = "PROCESSING"
	FAILED ReportStatusType = "FAILED"
	DONE ReportStatusType = "DONE"
)
