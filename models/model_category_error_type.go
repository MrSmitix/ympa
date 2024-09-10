package models
// CategoryErrorType : Типы ошибок:  * `UNKNOWN_CATEGORY` — указана неизвестная категория. * `CATEGORY_IS_NOT_LEAF` — указана нелистовая категория. Укажите ту, которая не имеет дочерних категорий. 
type CategoryErrorType string

// List of CategoryErrorType
const (
	UNKNOWN_CATEGORY CategoryErrorType = "UNKNOWN_CATEGORY"
	CATEGORY_IS_NOT_LEAF CategoryErrorType = "CATEGORY_IS_NOT_LEAF"
)
