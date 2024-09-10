package models

// PalletsCountDto - Количество палет в отгрузке.
type PalletsCountDto struct {

	// Количество палет, которое заявил продавец.
	Planned int32 `json:"planned,omitempty"`

	// Количество палет, которое приняли в сортировочном центре.
	Fact int32 `json:"fact,omitempty"`
}
