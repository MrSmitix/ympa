# FeedDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i64** | Идентификатор прайс-листа. | [optional] [default to None]
**login** | **String** | Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  | [optional] [default to None]
**name** | **String** | Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета.  | [optional] [default to None]
**password** | **String** | Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  | [optional] [default to None]
**upload_date** | [**chrono::DateTime::<chrono::Utc>**](DateTime.md) | Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета.  | [optional] [default to None]
**url** | **String** | URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина.  | [optional] [default to None]
**content** | [***models::FeedContentDto**](FeedContentDTO.md) |  | [optional] [default to None]
**download** | [***models::FeedDownloadDto**](FeedDownloadDTO.md) |  | [optional] [default to None]
**placement** | [***models::FeedPlacementDto**](FeedPlacementDTO.md) |  | [optional] [default to None]
**publication** | [***models::FeedPublicationDto**](FeedPublicationDTO.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


