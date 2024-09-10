# FeedContentDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rejected_offers_count** | **i64** | Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр `content status=OK`.  | [optional] [default to None]
**status** | [***models::FeedStatusType**](FeedStatusType.md) |  | [optional] [default to None]
**total_offers_count** | **i64** | Количество предложений в прайс-листе. Выводится, если параметр `content status=OK`.  | [optional] [default to None]
**error** | [***models::FeedContentErrorDto**](FeedContentErrorDTO.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


