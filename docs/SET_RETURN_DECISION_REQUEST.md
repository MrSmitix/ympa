# SET_RETURN_DECISION_REQUEST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**return_item_id** | **INTEGER_64** | Идентификатор товара в возврате. | [default to null]
**decision_type** | [**RETURN_REQUEST_DECISION_TYPE**](ReturnRequestDecisionType.md) |  | [default to null]
**comment** | [**STRING_32**](STRING_32.md) | Комментарий к решению. Укажите:  * для &#x60;REFUND_MONEY_INCLUDING_SHIPMENT&#x60;— стоимость обратной пересылки;  * для &#x60;REPAIR&#x60; — когда вы устраните недостатки товара;  * для &#x60;DECLINE_REFUND&#x60; — причину отказа;  * для &#x60;OTHER_DECISION&#x60; — какое решение вы предлагаете.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


