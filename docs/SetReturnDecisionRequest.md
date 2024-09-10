
# Table `SetReturnDecisionRequest`
(mapped from: SetReturnDecisionRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**returnItemId** | returnItemId | long NOT NULL |  | **kotlin.Long** | Идентификатор товара в возврате. | 
**decisionType** | decisionType | long NOT NULL |  | [**ReturnRequestDecisionType**](ReturnRequestDecisionType.md) |  |  [foreignkey]
**comment** | comment | text |  | **kotlin.String** | Комментарий к решению. Укажите:  * для &#x60;REFUND_MONEY_INCLUDING_SHIPMENT&#x60;— стоимость обратной пересылки;  * для &#x60;REPAIR&#x60; — когда вы устраните недостатки товара;  * для &#x60;DECLINE_REFUND&#x60; — причину отказа;  * для &#x60;OTHER_DECISION&#x60; — какое решение вы предлагаете.  |  [optional]





