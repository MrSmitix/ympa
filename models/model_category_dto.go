package models

// CategoryDto - Информация о категории.  Категория считается листовой, если у нее нет дочерних категорий. 
type CategoryDto struct {

	// Идентификатор категории.
	Id int64 `json:"id"`

	// Название категории.
	Name string `json:"name"`

	// Дочерние категории.
	Children *[]CategoryDto `json:"children,omitempty"`
}
