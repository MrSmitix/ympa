# OrderLabelDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **Int!** | Идентификатор заказа. | [default to null]
**placesNumber** | **Int!** | Количество коробок в заказе. | [default to null]
**url** | **String!** | URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md).  | [default to null]
**parcelBoxLabels** | [**ParcelBoxLabelDto**](ParcelBoxLabelDTO.md) | Информация на ярлыке. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


