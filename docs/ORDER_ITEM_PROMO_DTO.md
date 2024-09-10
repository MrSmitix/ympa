# ORDER_ITEM_PROMO_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**ORDER_PROMO_TYPE**](OrderPromoType.md) |  | [default to null]
**discount** | **REAL_32** | Размер пользовательской скидки в валюте покупателя.  | [optional] [default to null]
**subsidy** | **REAL_32** | Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа.  | [optional] [default to null]
**shop_promo_id** | [**STRING_32**](STRING_32.md) | Идентификатор акции поставщика.  | [optional] [default to null]
**market_promo_id** | [**STRING_32**](STRING_32.md) | Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр &#x60;type&#x3D;MARKET_DEAL&#x60;.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


