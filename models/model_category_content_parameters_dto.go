package models

// CategoryContentParametersDto - Информация о параметрах категории.
type CategoryContentParametersDto struct {

	// Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).
	CategoryId int32 `json:"categoryId"`

	// Список характеристик.
	Parameters *[]CategoryParameterDto `json:"parameters,omitempty"`
}
