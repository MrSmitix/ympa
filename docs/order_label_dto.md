# order_label_dto_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**order_id** | **long** | Идентификатор заказа. | 
**places_number** | **int** | Количество коробок в заказе. | 
**url** | **char \*** | URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md).  | 
**parcel_box_labels** | [**list_t**](parcel_box_label_dto.md) \* | Информация на ярлыке. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


