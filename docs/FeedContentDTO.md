# ympa_csharp_client.Model.FeedContentDTO
Информация о проверке содержимого прайс-листа, загруженного на Маркет.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RejectedOffersCount** | **long** | Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;.  | [optional] 
**Status** | **FeedStatusType** |  | [optional] 
**TotalOffersCount** | **long** | Количество предложений в прайс-листе. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;.  | [optional] 
**Error** | [**FeedContentErrorDTO**](FeedContentErrorDTO.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

