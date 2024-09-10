package models

// RegionDto - Регион доставки.
type RegionDto struct {

	// Идентификатор региона.
	Id int64 `json:"id,omitempty"`

	// Название региона.
	Name string `json:"name"`

	Type RegionType `json:"type"`

	Parent RegionDto `json:"parent,omitempty"`

	// Дочерние регионы.
	Children *[]RegionDto `json:"children,omitempty"`
}
