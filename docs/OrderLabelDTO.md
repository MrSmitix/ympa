# OrderLabelDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **Int64** | Идентификатор заказа. | [default to nothing]
**placesNumber** | **Int64** | Количество коробок в заказе. | [default to nothing]
**url** | **String** | URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md).  | [default to nothing]
**parcelBoxLabels** | [**Vector{ParcelBoxLabelDTO}**](ParcelBoxLabelDTO.md) | Информация на ярлыке. | [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


