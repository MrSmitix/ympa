

# OrderLabelDTO

Данные для печати ярлыка.

The class is defined in **[OrderLabelDTO.java](../../src/main/java/org/openapitools/model/OrderLabelDTO.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | `Long` | Идентификатор заказа. | 
**placesNumber** | `Integer` | Количество коробок в заказе. | 
**url** | `String` | URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md).  | 
**parcelBoxLabels** | [`List&lt;ParcelBoxLabelDTO&gt;`](ParcelBoxLabelDTO.md) | Информация на ярлыке. | 






