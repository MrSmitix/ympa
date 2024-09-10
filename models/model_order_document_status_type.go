package models
// OrderDocumentStatusType : Статус документа:  * `READY` — готов. * `NOT_READY` — не готов. 
type OrderDocumentStatusType string

// List of OrderDocumentStatusType
const (
	READY OrderDocumentStatusType = "READY"
	NOT_READY OrderDocumentStatusType = "NOT_READY"
)
