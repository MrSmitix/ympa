# SetReturnDecisionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**return_item_id** | **i64** | Идентификатор товара в возврате. | 
**decision_type** | [***models::ReturnRequestDecisionType**](ReturnRequestDecisionType.md) |  | 
**comment** | **String** | Комментарий к решению. Укажите:  * для `REFUND_MONEY_INCLUDING_SHIPMENT`— стоимость обратной пересылки;  * для `REPAIR` — когда вы устраните недостатки товара;  * для `DECLINE_REFUND` — причину отказа;  * для `OTHER_DECISION` — какое решение вы предлагаете.  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


