package models

// GetOrdersStatsRequest - Запрос информации по заказам.
type GetOrdersStatsRequest struct {

	// Начальная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. 
	DateFrom string `json:"dateFrom,omitempty"`

	// Конечная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. 
	DateTo string `json:"dateTo,omitempty"`

	// Начальная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. 
	UpdateFrom string `json:"updateFrom,omitempty"`

	// Конечная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. 
	UpdateTo string `json:"updateTo,omitempty"`

	// Список идентификаторов заказов.
	Orders *[]int64 `json:"orders,omitempty"`

	// Список статусов заказов.
	Statuses *[]OrderStatsStatusType `json:"statuses,omitempty"`

	// Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да. * `false` — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. 
	HasCis bool `json:"hasCis,omitempty"`
}
