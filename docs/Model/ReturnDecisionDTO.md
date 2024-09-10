# ReturnDecisionDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**returnItemId** | **int** | Идентификатор товара в возврате. | [optional] 
**count** | **int** | Количество единиц товара. | [optional] 
**comment** | **string** | Комментарий. | [optional] 
**reasonType** | [**OpenAPI\Server\Model\ReturnDecisionReasonType**](ReturnDecisionReasonType.md) |  | [optional] 
**subreasonType** | [**OpenAPI\Server\Model\ReturnDecisionSubreasonType**](ReturnDecisionSubreasonType.md) |  | [optional] 
**decisionType** | [**OpenAPI\Server\Model\ReturnDecisionType**](ReturnDecisionType.md) |  | [optional] 
**refundAmount** | **int** | Сумма возврата. | [optional] 
**partnerCompensation** | **int** | Компенсация за обратную доставку. | [optional] 
**images** | **string** | Список хеш-кодов фотографий товара от покупателя. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


