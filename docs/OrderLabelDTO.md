# ympa_r_client::OrderLabelDTO

Данные для печати ярлыка.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **integer** | Идентификатор заказа. | 
**placesNumber** | **integer** | Количество коробок в заказе. | 
**url** | **character** | URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md).  | 
**parcelBoxLabels** | [**array[ParcelBoxLabelDTO]**](ParcelBoxLabelDTO.md) | Информация на ярлыке. | 


