# FeedDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **Int!** | Идентификатор прайс-листа. | [optional] [default to null]
**login** | **String!** | Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  | [optional] [default to null]
**name** | **String!** | Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета.  | [optional] [default to null]
**password** | **String!** | Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  | [optional] [default to null]
**uploadDate** | **String!** | Дата загрузки прайс-листа на Маркет.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Параметр выводится при размещении прайс-листа на сервере Маркета.  | [optional] [default to null]
**url** | **String!** | URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина.  | [optional] [default to null]
**content** | [***FeedContentDto**](FeedContentDTO.md) |  | [optional] [default to null]
**download** | [***FeedDownloadDto**](FeedDownloadDTO.md) |  | [optional] [default to null]
**placement** | [***FeedPlacementDto**](FeedPlacementDTO.md) |  | [optional] [default to null]
**publication** | [***FeedPublicationDto**](FeedPublicationDTO.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


