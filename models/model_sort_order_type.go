package models
// SortOrderType : Направление сортировки.  Возможные значения: - `ASC` — сортировка по возрастанию. - `DESC` — сортировка по убыванию. 
type SortOrderType string

// List of SortOrderType
const (
	ASC SortOrderType = "ASC"
	DESC SortOrderType = "DESC"
)
