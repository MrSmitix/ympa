

# FeedDTO

Информация о прайс-листе.

The class is defined in **[FeedDTO.java](../../src/main/java/org/openapitools/model/FeedDTO.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `Long` | Идентификатор прайс-листа. |  [optional property]
**login** | `String` | Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  |  [optional property]
**name** | `String` | Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета.  |  [optional property]
**password** | `String` | Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  |  [optional property]
**uploadDate** | `OffsetDateTime` | Дата загрузки прайс-листа на Маркет.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Параметр выводится при размещении прайс-листа на сервере Маркета.  |  [optional property]
**url** | `String` | URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина.  |  [optional property]
**content** | [`FeedContentDTO`](FeedContentDTO.md) |  |  [optional property]
**download** | [`FeedDownloadDTO`](FeedDownloadDTO.md) |  |  [optional property]
**placement** | [`FeedPlacementDTO`](FeedPlacementDTO.md) |  |  [optional property]
**publication** | [`FeedPublicationDTO`](FeedPublicationDTO.md) |  |  [optional property]












