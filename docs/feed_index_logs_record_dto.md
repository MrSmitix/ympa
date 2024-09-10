# feed_index_logs_record_dto_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**download_time** | **char \*** | Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] 
**file_time** | **char \*** | Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] 
**generation_id** | **long** | Идентификатор индексации. | [optional] 
**index_type** | **feed_index_logs_index_type_t \*** |  | [optional] 
**published_time** | **char \*** | Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] 
**status** | **feed_index_logs_status_type_t \*** |  | [optional] 
**error** | [**feed_index_logs_error_dto_t**](feed_index_logs_error_dto.md) \* |  | [optional] 
**offers** | [**feed_index_logs_offers_dto_t**](feed_index_logs_offers_dto.md) \* |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


