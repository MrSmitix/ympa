# OAIFeedDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSNumber*** | Идентификатор прайс-листа. | [optional] 
**login** | **NSString*** | Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  | [optional] 
**name** | **NSString*** | Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета.  | [optional] 
**password** | **NSString*** | Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  | [optional] 
**uploadDate** | **NSDate*** | Дата загрузки прайс-листа на Маркет.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Параметр выводится при размещении прайс-листа на сервере Маркета.  | [optional] 
**url** | **NSString*** | URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина.  | [optional] 
**content** | [**OAIFeedContentDTO***](OAIFeedContentDTO.md) |  | [optional] 
**download** | [**OAIFeedDownloadDTO***](OAIFeedDownloadDTO.md) |  | [optional] 
**placement** | [**OAIFeedPlacementDTO***](OAIFeedPlacementDTO.md) |  | [optional] 
**publication** | [**OAIFeedPublicationDTO***](OAIFeedPublicationDTO.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


