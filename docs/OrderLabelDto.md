# OrderLabelDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**order_id** | **i64** | Идентификатор заказа. | 
**places_number** | **i32** | Количество коробок в заказе. | 
**url** | **String** | URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md).  | 
**parcel_box_labels** | [**Vec<models::ParcelBoxLabelDto>**](ParcelBoxLabelDTO.md) | Информация на ярлыке. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


