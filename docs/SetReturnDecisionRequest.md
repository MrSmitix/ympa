# SetReturnDecisionRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**returnItemId** | **Int64** | Идентификатор товара в возврате. | [default to nothing]
**decisionType** | [***ReturnRequestDecisionType**](ReturnRequestDecisionType.md) |  | [default to nothing]
**comment** | **String** | Комментарий к решению. Укажите:  * для &#x60;REFUND_MONEY_INCLUDING_SHIPMENT&#x60;— стоимость обратной пересылки;  * для &#x60;REPAIR&#x60; — когда вы устраните недостатки товара;  * для &#x60;DECLINE_REFUND&#x60; — причину отказа;  * для &#x60;OTHER_DECISION&#x60; — какое решение вы предлагаете.  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


