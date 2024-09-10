package models

// OrderDeliveryDatesDto - Диапазон дат доставки.
type OrderDeliveryDatesDto struct {

	// Формат даты: `ДД-ММ-ГГГГ`. 
	FromDate string `json:"fromDate,omitempty"`

	// Формат даты: `ДД-ММ-ГГГГ`. 
	ToDate string `json:"toDate,omitempty"`

	// Начало интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Минимальное значение: `00:00`. 
	FromTime string `json:"fromTime,omitempty"`

	// Конец интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Максимальное значение: `23:59`. 
	ToTime string `json:"toTime,omitempty"`

	// Формат даты: `ДД-ММ-ГГГГ`. 
	RealDeliveryDate string `json:"realDeliveryDate,omitempty"`
}
