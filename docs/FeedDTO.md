
# Table `FeedDTO`
(mapped from: FeedDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | long PRIMARY KEY AUTOINCREMENT |  | **kotlin.Long** | Идентификатор прайс-листа. |  [optional]
**login** | login | text |  | **kotlin.String** | Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  |  [optional]
**name** | name | text |  | **kotlin.String** | Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета.  |  [optional]
**password** | password | text |  | **kotlin.String** | Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  |  [optional]
**uploadDate** | uploadDate | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Дата загрузки прайс-листа на Маркет.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Параметр выводится при размещении прайс-листа на сервере Маркета.  |  [optional]
**url** | url | text |  | **kotlin.String** | URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина.  |  [optional]
**content** | content | long |  | [**FeedContentDTO**](FeedContentDTO.md) |  |  [optional] [foreignkey]
**download** | download | long |  | [**FeedDownloadDTO**](FeedDownloadDTO.md) |  |  [optional] [foreignkey]
**placement** | placement | long |  | [**FeedPlacementDTO**](FeedPlacementDTO.md) |  |  [optional] [foreignkey]
**publication** | publication | long |  | [**FeedPublicationDTO**](FeedPublicationDTO.md) |  |  [optional] [foreignkey]












