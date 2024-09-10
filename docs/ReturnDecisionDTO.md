# WWW::OpenAPIClient::Object::ReturnDecisionDTO

## Load the model package
```perl
use WWW::OpenAPIClient::Object::ReturnDecisionDTO;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**return_item_id** | **int** | Идентификатор товара в возврате. | [optional] 
**count** | **int** | Количество единиц товара. | [optional] 
**comment** | **string** | Комментарий. | [optional] 
**reason_type** | [**ReturnDecisionReasonType**](ReturnDecisionReasonType.md) |  | [optional] 
**subreason_type** | [**ReturnDecisionSubreasonType**](ReturnDecisionSubreasonType.md) |  | [optional] 
**decision_type** | [**ReturnDecisionType**](ReturnDecisionType.md) |  | [optional] 
**refund_amount** | **int** | Сумма возврата. | [optional] 
**partner_compensation** | **int** | Компенсация за обратную доставку. | [optional] 
**images** | **ARRAY[string]** | Список хеш-кодов фотографий товара от покупателя. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


