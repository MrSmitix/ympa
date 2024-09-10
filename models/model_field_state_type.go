package models
// FieldStateType : Фильтр по заполненности или незаполненности поля:  * `SPECIFIED` — вывести товары, у которых поле заполнено. * `EMPTY` — вывести товары, у которых поле не заполнено. 
type FieldStateType string

// List of FieldStateType
const (
	SPECIFIED FieldStateType = "SPECIFIED"
	EMPTY FieldStateType = "EMPTY"
)
