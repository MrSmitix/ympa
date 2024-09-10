# feed_content_dto_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rejected_offers_count** | **long** | Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;.  | [optional] 
**status** | **feed_status_type_t \*** |  | [optional] 
**total_offers_count** | **long** | Количество предложений в прайс-листе. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;.  | [optional] 
**error** | [**feed_content_error_dto_t**](feed_content_error_dto.md) \* |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


