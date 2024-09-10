package models
// OutletStatusType : Статус точки продаж.  Возможные значения:  * `AT_MODERATION` — проверяется. * `FAILED` — не прошла проверку и отклонена модератором. * `MODERATED` — проверена и одобрена. * `NONMODERATED` — новая точка, нуждается в проверке. 
type OutletStatusType string

// List of OutletStatusType
const (
	AT_MODERATION OutletStatusType = "AT_MODERATION"
	FAILED OutletStatusType = "FAILED"
	MODERATED OutletStatusType = "MODERATED"
	NONMODERATED OutletStatusType = "NONMODERATED"
	UNKNOWN OutletStatusType = "UNKNOWN"
)
