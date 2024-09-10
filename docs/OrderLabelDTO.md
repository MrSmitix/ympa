
# Table `OrderLabelDTO`
(mapped from: OrderLabelDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**orderId** | orderId | long NOT NULL |  | **kotlin.Long** | Идентификатор заказа. | 
**placesNumber** | placesNumber | int NOT NULL |  | **kotlin.Int** | Количество коробок в заказе. | 
**url** | url | text NOT NULL |  | **kotlin.String** | URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md).  | 
**parcelBoxLabels** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ParcelBoxLabelDTO&gt;**](ParcelBoxLabelDTO.md) | Информация на ярлыке. | 





# **Table `OrderLabelDTOParcelBoxLabelDTO`**
(mapped from: OrderLabelDTOParcelBoxLabelDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
orderLabelDTO | orderLabelDTO | long | | kotlin.Long | Primary Key | *one*
parcelBoxLabelDTO | parcelBoxLabelDTO | long | | kotlin.Long | Foreign Key | *many*



