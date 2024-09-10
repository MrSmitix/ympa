# OrderItemPromoDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**r#type** | [***models::OrderPromoType**](OrderPromoType.md) |  | 
**discount** | **f64** | Размер пользовательской скидки в валюте покупателя.  | [optional] [default to None]
**subsidy** | **f64** | Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа.  | [optional] [default to None]
**shop_promo_id** | **String** | Идентификатор акции поставщика.  | [optional] [default to None]
**market_promo_id** | **String** | Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр `type=MARKET_DEAL`.  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


