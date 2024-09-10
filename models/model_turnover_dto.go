package models

// TurnoverDto - Информация об оборачиваемости товара.
type TurnoverDto struct {

	Turnover TurnoverType `json:"turnover"`

	// Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html)
	TurnoverDays float64 `json:"turnoverDays,omitempty"`
}
