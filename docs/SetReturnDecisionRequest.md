# ympa_r_client::SetReturnDecisionRequest

Решения по позиции в возврате.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**returnItemId** | **integer** | Идентификатор товара в возврате. | 
**decisionType** | [**ReturnRequestDecisionType**](ReturnRequestDecisionType.md) |  | [Enum: ] 
**comment** | **character** | Комментарий к решению. Укажите:  * для &#x60;REFUND_MONEY_INCLUDING_SHIPMENT&#x60;— стоимость обратной пересылки;  * для &#x60;REPAIR&#x60; — когда вы устраните недостатки товара;  * для &#x60;DECLINE_REFUND&#x60; — причину отказа;  * для &#x60;OTHER_DECISION&#x60; — какое решение вы предлагаете.  | [optional] 


