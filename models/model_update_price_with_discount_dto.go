package models

// UpdatePriceWithDiscountDto - Цена с указанием скидки.
type UpdatePriceWithDiscountDto struct {

	// Значение.
	Value float32 `json:"value"`

	CurrencyId CurrencyType `json:"currencyId"`

	// Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
	DiscountBase float32 `json:"discountBase,omitempty"`
}
