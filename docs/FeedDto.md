# FeedDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | Option<**i64**> | Идентификатор прайс-листа. | [optional]
**login** | Option<**String**> | Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  | [optional]
**name** | Option<**String**> | Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета.  | [optional]
**password** | Option<**String**> | Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  | [optional]
**upload_date** | Option<**String**> | Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета.  | [optional]
**url** | Option<**String**> | URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина.  | [optional]
**content** | Option<[**models::FeedContentDto**](FeedContentDTO.md)> |  | [optional]
**download** | Option<[**models::FeedDownloadDto**](FeedDownloadDTO.md)> |  | [optional]
**placement** | Option<[**models::FeedPlacementDto**](FeedPlacementDTO.md)> |  | [optional]
**publication** | Option<[**models::FeedPublicationDto**](FeedPublicationDTO.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


