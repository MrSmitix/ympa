# FeedDTO

Информация о прайс-листе.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор прайс-листа. | [optional] 
**login** | **str** | Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  | [optional] 
**name** | **str** | Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета.  | [optional] 
**password** | **str** | Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  | [optional] 
**upload_date** | **datetime** | Дата загрузки прайс-листа на Маркет.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Параметр выводится при размещении прайс-листа на сервере Маркета.  | [optional] 
**url** | **str** | URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина.  | [optional] 
**content** | [**FeedContentDTO**](FeedContentDTO.md) |  | [optional] 
**download** | [**FeedDownloadDTO**](FeedDownloadDTO.md) |  | [optional] 
**placement** | [**FeedPlacementDTO**](FeedPlacementDTO.md) |  | [optional] 
**publication** | [**FeedPublicationDTO**](FeedPublicationDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.feed_dto import FeedDTO

# TODO update the JSON string below
json = "{}"
# create an instance of FeedDTO from a JSON string
feed_dto_instance = FeedDTO.from_json(json)
# print the JSON string representation of the object
print(FeedDTO.to_json())

# convert the object into a dict
feed_dto_dict = feed_dto_instance.to_dict()
# create an instance of FeedDTO from a dict
feed_dto_from_dict = FeedDTO.from_dict(feed_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


