# DELETE_PROMO_OFFERS_REQUEST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**promo_id** | [**STRING_32**](STRING_32.md) | Идентификатор акции. | [default to null]
**delete_all_offers** | **BOOLEAN** | Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение &#x60;true&#x60; и не передавайте параметр &#x60;offerIds&#x60;. | [optional] [default to null]
**offer_ids** | [**LIST [STRING_32]**](STRING_32.md) | Товары, которые нужно убрать из акции. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


