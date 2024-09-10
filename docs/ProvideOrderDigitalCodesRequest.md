# ProvideOrderDigitalCodesRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**Vec<models::OrderDigitalItemDto>**](OrderDigitalItemDTO.md) | Список проданных ключей.  Если в заказе есть несколько **одинаковых** товаров (например, несколько ключей к одной и той же подписке), передайте каждый в виде отдельного элемента массива. `id` у этих элементов должен быть один и тот же.  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


