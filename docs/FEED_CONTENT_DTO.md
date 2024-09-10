# FEED_CONTENT_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rejected_offers_count** | **INTEGER_64** | Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;.  | [optional] [default to null]
**status** | [**FEED_STATUS_TYPE**](FeedStatusType.md) |  | [optional] [default to null]
**total_offers_count** | **INTEGER_64** | Количество предложений в прайс-листе. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;.  | [optional] [default to null]
**error** | [**FEED_CONTENT_ERROR_DTO**](FeedContentErrorDTO.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


