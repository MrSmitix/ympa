# Api.OrderLabelDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **Number** | Идентификатор заказа. | 
**placesNumber** | **Number** | Количество коробок в заказе. | 
**url** | **String** | URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md).  | 
**parcelBoxLabels** | [**[ParcelBoxLabelDTO]**](ParcelBoxLabelDTO.md) | Информация на ярлыке. | 


