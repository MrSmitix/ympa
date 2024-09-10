

# OrderLabelDTO

Данные для печати ярлыка.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **Long** | Идентификатор заказа. | 
**placesNumber** | **Int** | Количество коробок в заказе. | 
**url** | **String** | URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md).  | 
**parcelBoxLabels** | [**Seq&lt;ParcelBoxLabelDTO&gt;**](ParcelBoxLabelDTO.md) | Информация на ярлыке. | 



