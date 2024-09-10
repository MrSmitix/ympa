package models

// ParcelBoxDto - Элемент отображает одно грузовое место. Вложенные поля больше не используются, передавайте элемент пустым в запросах и не обращайте внимание на содержимое в ответах.
type ParcelBoxDto struct {

	// {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
	Id int64 `json:"id,omitempty"`

	// {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
	FulfilmentId string `json:"fulfilmentId,omitempty" validate:"regexp=^[\\\\p{Alnum}- ]*$"`
}
