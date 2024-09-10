# ympa_r_client::FeedDTO

Информация о прайс-листе.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | Идентификатор прайс-листа. | [optional] 
**login** | **character** | Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  | [optional] 
**name** | **character** | Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета.  | [optional] 
**password** | **character** | Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  | [optional] 
**uploadDate** | **character** | Дата загрузки прайс-листа на Маркет.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Параметр выводится при размещении прайс-листа на сервере Маркета.  | [optional] 
**url** | **character** | URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина.  | [optional] 
**content** | [**FeedContentDTO**](FeedContentDTO.md) |  | [optional] 
**download** | [**FeedDownloadDTO**](FeedDownloadDTO.md) |  | [optional] 
**placement** | [**FeedPlacementDTO**](FeedPlacementDTO.md) |  | [optional] 
**publication** | [**FeedPublicationDTO**](FeedPublicationDTO.md) |  | [optional] 


