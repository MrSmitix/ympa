package models

type GetOutletLicensesResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result OutletLicensesResponseDto `json:"result,omitempty"`
}
