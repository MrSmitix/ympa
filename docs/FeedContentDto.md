# FeedContentDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rejected_offers_count** | Option<**i64**> | Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр `content status=OK`.  | [optional]
**status** | Option<[**models::FeedStatusType**](FeedStatusType.md)> |  | [optional]
**total_offers_count** | Option<**i64**> | Количество предложений в прайс-листе. Выводится, если параметр `content status=OK`.  | [optional]
**error** | Option<[**models::FeedContentErrorDto**](FeedContentErrorDTO.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


