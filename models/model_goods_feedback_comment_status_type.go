package models
// GoodsFeedbackCommentStatusType : Статус комментария:  * `PUBLISHED` — опубликован. * `UNMODERATED` — не проверен. * `BANNED` — заблокирован. * `DELETED` — удален. 
type GoodsFeedbackCommentStatusType string

// List of GoodsFeedbackCommentStatusType
const (
	PUBLISHED GoodsFeedbackCommentStatusType = "PUBLISHED"
	UNMODERATED GoodsFeedbackCommentStatusType = "UNMODERATED"
	BANNED GoodsFeedbackCommentStatusType = "BANNED"
	DELETED GoodsFeedbackCommentStatusType = "DELETED"
)
