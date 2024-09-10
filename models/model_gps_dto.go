package models

// GpsDto - GPS-координаты широты и долготы. 
type GpsDto struct {

	// Широта.
	Latitude float32 `json:"latitude"`

	// Долгота.
	Longitude float32 `json:"longitude"`
}
