# FeedDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор прайс-листа. | [optional] 
**Login** | **String** | Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  | [optional] 
**Name** | **String** | Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета.  | [optional] 
**Password** | **String** | Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  | [optional] 
**UploadDate** | **System.DateTime** | Дата загрузки прайс-листа на Маркет.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Параметр выводится при размещении прайс-листа на сервере Маркета.  | [optional] 
**Url** | **String** | URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина.  | [optional] 
**Content** | [**FeedContentDTO**](FeedContentDTO.md) |  | [optional] 
**Download** | [**FeedDownloadDTO**](FeedDownloadDTO.md) |  | [optional] 
**Placement** | [**FeedPlacementDTO**](FeedPlacementDTO.md) |  | [optional] 
**Publication** | [**FeedPublicationDTO**](FeedPublicationDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$FeedDTO = Initialize-ympa_powershell_clientFeedDTO  -Id null `
 -Login null `
 -Name null `
 -Password null `
 -UploadDate null `
 -Url null `
 -Content null `
 -Download null `
 -Placement null `
 -Publication null
```

- Convert the resource to JSON
```powershell
$FeedDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

