# ympa_csharp_client.Model.FeedDownloadErrorDTO
Информация об ошибке при загрузке прайс-листа. Выводится, если параметр `download status=ERROR`. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**HttpStatusCode** | **int** | HTTP-код ошибки индексации прайс-листа. Выводится, если &#x60;type&#x3D;DOWNLOAD_HTTP_ERROR&#x60;.  | [optional] 
**Type** | **FeedDownloadErrorType** |  | [optional] 
**Description** | **string** | Описание ошибки. Выводится, если &#x60;type&#x3D;DOWNLOAD_ERROR&#x60;.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

