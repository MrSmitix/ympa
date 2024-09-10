# FEED_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_64** | Идентификатор прайс-листа. | [optional] [default to null]
**login** | [**STRING_32**](STRING_32.md) | Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  | [optional] [default to null]
**name** | [**STRING_32**](STRING_32.md) | Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета.  | [optional] [default to null]
**password** | [**STRING_32**](STRING_32.md) | Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  | [optional] [default to null]
**upload_date** | [**DATE_TIME**](DATE_TIME.md) | Дата загрузки прайс-листа на Маркет.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Параметр выводится при размещении прайс-листа на сервере Маркета.  | [optional] [default to null]
**url** | [**STRING_32**](STRING_32.md) | URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина.  | [optional] [default to null]
**content** | [**FEED_CONTENT_DTO**](FeedContentDTO.md) |  | [optional] [default to null]
**download** | [**FEED_DOWNLOAD_DTO**](FeedDownloadDTO.md) |  | [optional] [default to null]
**placement** | [**FEED_PLACEMENT_DTO**](FeedPlacementDTO.md) |  | [optional] [default to null]
**publication** | [**FEED_PUBLICATION_DTO**](FeedPublicationDTO.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


