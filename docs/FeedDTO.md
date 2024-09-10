# WWW::OpenAPIClient::Object::FeedDTO

## Load the model package
```perl
use WWW::OpenAPIClient::Object::FeedDTO;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор прайс-листа. | [optional] 
**login** | **string** | Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  | [optional] 
**name** | **string** | Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета.  | [optional] 
**password** | **string** | Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  | [optional] 
**upload_date** | **DATE_TIME** | Дата загрузки прайс-листа на Маркет.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Параметр выводится при размещении прайс-листа на сервере Маркета.  | [optional] 
**url** | **string** | URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина.  | [optional] 
**content** | [**FeedContentDTO**](FeedContentDTO.md) |  | [optional] 
**download** | [**FeedDownloadDTO**](FeedDownloadDTO.md) |  | [optional] 
**placement** | [**FeedPlacementDTO**](FeedPlacementDTO.md) |  | [optional] 
**publication** | [**FeedPublicationDTO**](FeedPublicationDTO.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


