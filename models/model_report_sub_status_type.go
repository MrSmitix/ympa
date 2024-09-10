package models
// ReportSubStatusType : Подстатус генерации отчета: * `NO_DATA` — для такого отчета нет данных. * `TOO_LARGE` — отчет превысил допустимый размер — укажите меньший период времени или уточните условия запроса. * `RESOURCE_NOT_FOUND` — для такого отчета не удалось найти часть сущностей. 
type ReportSubStatusType string

// List of ReportSubStatusType
const (
	NO_DATA ReportSubStatusType = "NO_DATA"
	TOO_LARGE ReportSubStatusType = "TOO_LARGE"
	RESOURCE_NOT_FOUND ReportSubStatusType = "RESOURCE_NOT_FOUND"
)
