# ympa_csharp_client.Model.FeedDTO
Информация о прайс-листе.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **long** | Идентификатор прайс-листа. | [optional] 
**Login** | **string** | Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  | [optional] 
**Name** | **string** | Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета.  | [optional] 
**Password** | **string** | Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  | [optional] 
**UploadDate** | **DateTime** | Дата загрузки прайс-листа на Маркет.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Параметр выводится при размещении прайс-листа на сервере Маркета.  | [optional] 
**Url** | **string** | URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина.  | [optional] 
**Content** | [**FeedContentDTO**](FeedContentDTO.md) |  | [optional] 
**Download** | [**FeedDownloadDTO**](FeedDownloadDTO.md) |  | [optional] 
**Placement** | [**FeedPlacementDTO**](FeedPlacementDTO.md) |  | [optional] 
**Publication** | [**FeedPublicationDTO**](FeedPublicationDTO.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

