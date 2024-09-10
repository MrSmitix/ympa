# WWW::OpenAPIClient::Object::FeedContentDTO

## Load the model package
```perl
use WWW::OpenAPIClient::Object::FeedContentDTO;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rejected_offers_count** | **int** | Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;.  | [optional] 
**status** | [**FeedStatusType**](FeedStatusType.md) |  | [optional] 
**total_offers_count** | **int** | Количество предложений в прайс-листе. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;.  | [optional] 
**error** | [**FeedContentErrorDTO**](FeedContentErrorDTO.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


