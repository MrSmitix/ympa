package models

// BusinessDto - Информация о кабинете.
type BusinessDto struct {

	// Идентификатор кабинета.
	Id int64 `json:"id,omitempty"`

	// Название бизнеса.
	Name string `json:"name,omitempty"`
}
