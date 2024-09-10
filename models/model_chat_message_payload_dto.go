package models

// ChatMessagePayloadDto - Информация о приложенных к сообщению файлах.
type ChatMessagePayloadDto struct {

	// Имя файла.
	Name string `json:"name"`

	// Ссылка для скачивания файла.
	Url string `json:"url"`

	// Размер файла в байтах.
	Size int32 `json:"size"`
}
