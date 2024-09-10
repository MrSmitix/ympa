package models

import (
	"time"
)

// GetPromoBestsellerInfoDto - Информация об акции «Бестселлеры Маркета».
type GetPromoBestsellerInfoDto struct {

	// Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers).
	Bestseller bool `json:"bestseller"`

	// До какой даты можно добавить товар в акцию «Бестселлеры Маркета».  Параметр возвращается только для текущих и будущих акций «Бестселлеры Маркета». 
	EntryDeadline time.Time `json:"entryDeadline,omitempty"`
}
