# DeletePromoOffersRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**promo_id** | **String** | Идентификатор акции. | 
**delete_all_offers** | **bool** | Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение `true` и не передавайте параметр `offerIds`. | [optional] [default to None]
**offer_ids** | **Vec<models::ShopSku>** | Товары, которые нужно убрать из акции. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


