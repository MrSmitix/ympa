# FeedContentDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rejectedOffersCount** | **Int!** | Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;.  | [optional] [default to null]
**status** | [***FeedStatusType**](FeedStatusType.md) |  | [optional] [default to null]
**totalOffersCount** | **Int!** | Количество предложений в прайс-листе. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;.  | [optional] [default to null]
**error** | [***FeedContentErrorDto**](FeedContentErrorDTO.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


