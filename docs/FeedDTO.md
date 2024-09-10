

# FeedDTO

Информация о прайс-листе.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Идентификатор прайс-листа. |  [optional]
**login** | **String** | Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  |  [optional]
**name** | **String** | Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета.  |  [optional]
**password** | **String** | Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  |  [optional]
**uploadDate** | **OffsetDateTime** | Дата загрузки прайс-листа на Маркет.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Параметр выводится при размещении прайс-листа на сервере Маркета.  |  [optional]
**url** | **String** | URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина.  |  [optional]
**content** | [**FeedContentDTO**](FeedContentDTO.md) |  |  [optional]
**download** | [**FeedDownloadDTO**](FeedDownloadDTO.md) |  |  [optional]
**placement** | [**FeedPlacementDTO**](FeedPlacementDTO.md) |  |  [optional]
**publication** | [**FeedPublicationDTO**](FeedPublicationDTO.md) |  |  [optional]



