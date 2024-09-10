package models

// GoodsFeedbackMediaDto - Фото и видео.
type GoodsFeedbackMediaDto struct {

	// Ссылки на фото.
	Photos *[]string `json:"photos,omitempty"`

	// Ссылки на видео.
	Videos *[]string `json:"videos,omitempty"`
}
