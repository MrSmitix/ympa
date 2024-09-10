package models

import (
	"time"
)

// UpdateStockItemDto - Информация об остатках товара. 
type UpdateStockItemDto struct {

	// Количество доступного товара. 
	Count int64 `json:"count"`

	// Дата и время последнего обновления информации об остатках. <br><br> Если вы не передали параметр `updatedAt`, используется текущее время. <br><br> Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
	UpdatedAt time.Time `json:"updatedAt,omitempty"`
}
