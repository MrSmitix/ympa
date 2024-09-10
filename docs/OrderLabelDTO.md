
# OrderLabelDTO

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **orderId** | **kotlin.Long** | Идентификатор заказа. |  |
| **placesNumber** | **kotlin.Int** | Количество коробок в заказе. |  |
| **url** | **kotlin.String** | URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md).  |  |
| **parcelBoxLabels** | [**kotlin.collections.List&lt;ParcelBoxLabelDTO&gt;**](ParcelBoxLabelDTO.md) | Информация на ярлыке. |  |



