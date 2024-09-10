package models

// GetOutletResponse - Ответ на запрос информации о точке продаж.
type GetOutletResponse struct {

	Outlet FullOutletDto `json:"outlet,omitempty"`
}
