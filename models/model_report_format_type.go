package models
// ReportFormatType : Формат отчета:  * `FILE` — файл с электронной таблицей. * `CSV` — ZIP-архив с CSV-файлами на каждый лист отчета. 
type ReportFormatType string

// List of ReportFormatType
const (
	FILE ReportFormatType = "FILE"
	CSV ReportFormatType = "CSV"
)
