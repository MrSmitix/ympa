package models

// OutletLicensesResponseDto - Ответ на запрос информации о лицензиях для точек продаж.
type OutletLicensesResponseDto struct {

	// Список лицензий.
	Licenses []FullOutletLicenseDto `json:"licenses"`
}
