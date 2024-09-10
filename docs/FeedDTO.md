# FeedDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Int64** | Идентификатор прайс-листа. | [optional] [default to nothing]
**login** | **String** | Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  | [optional] [default to nothing]
**name** | **String** | Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета.  | [optional] [default to nothing]
**password** | **String** | Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  | [optional] [default to nothing]
**uploadDate** | **ZonedDateTime** | Дата загрузки прайс-листа на Маркет.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Параметр выводится при размещении прайс-листа на сервере Маркета.  | [optional] [default to nothing]
**url** | **String** | URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина.  | [optional] [default to nothing]
**content** | [***FeedContentDTO**](FeedContentDTO.md) |  | [optional] [default to nothing]
**download** | [***FeedDownloadDTO**](FeedDownloadDTO.md) |  | [optional] [default to nothing]
**placement** | [***FeedPlacementDTO**](FeedPlacementDTO.md) |  | [optional] [default to nothing]
**publication** | [***FeedPublicationDTO**](FeedPublicationDTO.md) |  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


