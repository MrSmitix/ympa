# feed_dto_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **long** | Идентификатор прайс-листа. | [optional] 
**login** | **char \*** | Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  | [optional] 
**name** | **char \*** | Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета.  | [optional] 
**password** | **char \*** | Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  | [optional] 
**upload_date** | **char \*** | Дата загрузки прайс-листа на Маркет.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Параметр выводится при размещении прайс-листа на сервере Маркета.  | [optional] 
**url** | **char \*** | URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина.  | [optional] 
**content** | [**feed_content_dto_t**](feed_content_dto.md) \* |  | [optional] 
**download** | [**feed_download_dto_t**](feed_download_dto.md) \* |  | [optional] 
**placement** | [**feed_placement_dto_t**](feed_placement_dto.md) \* |  | [optional] 
**publication** | [**feed_publication_dto_t**](feed_publication_dto.md) \* |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


