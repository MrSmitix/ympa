# ORDER_LABEL_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**order_id** | **INTEGER_64** | Идентификатор заказа. | [default to null]
**places_number** | **INTEGER_32** | Количество коробок в заказе. | [default to null]
**url** | [**STRING_32**](STRING_32.md) | URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md).  | [default to null]
**parcel_box_labels** | [**LIST [PARCEL_BOX_LABEL_DTO]**](ParcelBoxLabelDTO.md) | Информация на ярлыке. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


