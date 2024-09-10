package models

// UpdateOutletLicenseRequest - Запрос на создание или изменение лицензий для точек продаж.
type UpdateOutletLicenseRequest struct {

	// Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии. 
	Licenses []OutletLicenseDto `json:"licenses"`
}
