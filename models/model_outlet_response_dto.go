package models

// OutletResponseDto - Результат выполнения запроса. Выводится, если `status=\"OK\"`. 
type OutletResponseDto struct {

	// Идентификатор точки продаж, присвоенный Маркетом.
	Id int64 `json:"id,omitempty"`
}
