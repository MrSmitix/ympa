package models

// FlippingPagerDto - Модель для пагинации.
type FlippingPagerDto struct {

	// Сколько всего найдено элементов.
	Total int32 `json:"total,omitempty"`

	// Начальный номер найденного элемента на странице.
	From int32 `json:"from,omitempty"`

	// Конечный номер найденного элемента на странице.
	To int32 `json:"to,omitempty"`

	// Текущая страница.
	CurrentPage int32 `json:"currentPage,omitempty"`

	// Общее количество страниц.
	PagesCount int32 `json:"pagesCount,omitempty"`

	// Размер страницы.
	PageSize int32 `json:"pageSize,omitempty"`
}
