package models

import (
	"time"
)

// FeedDto - Информация о прайс-листе.
type FeedDto struct {

	// Идентификатор прайс-листа.
	Id int64 `json:"id,omitempty"`

	// Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
	Login string `json:"login,omitempty"`

	// Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета. 
	Name string `json:"name,omitempty"`

	// Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
	Password string `json:"password,omitempty"`

	// Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета. 
	UploadDate time.Time `json:"uploadDate,omitempty"`

	// URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина. 
	Url string `json:"url,omitempty"`

	Content FeedContentDto `json:"content,omitempty"`

	Download FeedDownloadDto `json:"download,omitempty"`

	Placement FeedPlacementDto `json:"placement,omitempty"`

	Publication FeedPublicationDto `json:"publication,omitempty"`
}
