package models

import (
	"time"
)

// GetPriceWithVatDto - Цена с указанием ставки НДС и времени последнего обновления.
type GetPriceWithVatDto struct {

	// Цена на товар.
	Value float32 `json:"value,omitempty"`

	// Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
	DiscountBase float32 `json:"discountBase,omitempty"`

	CurrencyId CurrencyType `json:"currencyId,omitempty"`

	// Идентификатор ставки НДС, применяемой для товара:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете. 
	Vat int32 `json:"vat,omitempty"`

	// Время последнего обновления.
	UpdatedAt time.Time `json:"updatedAt"`
}
