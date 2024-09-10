# OpenapiClient::FeedDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | Идентификатор прайс-листа. | [optional] |
| **login** | **String** | Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  | [optional] |
| **name** | **String** | Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета.  | [optional] |
| **password** | **String** | Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  | [optional] |
| **upload_date** | **Time** | Дата загрузки прайс-листа на Маркет.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Параметр выводится при размещении прайс-листа на сервере Маркета.  | [optional] |
| **url** | **String** | URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина.  | [optional] |
| **content** | [**FeedContentDTO**](FeedContentDTO.md) |  | [optional] |
| **download** | [**FeedDownloadDTO**](FeedDownloadDTO.md) |  | [optional] |
| **placement** | [**FeedPlacementDTO**](FeedPlacementDTO.md) |  | [optional] |
| **publication** | [**FeedPublicationDTO**](FeedPublicationDTO.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::FeedDTO.new(
  id: null,
  login: null,
  name: null,
  password: null,
  upload_date: null,
  url: null,
  content: null,
  download: null,
  placement: null,
  publication: null
)
```

