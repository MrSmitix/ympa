# OrderItemPromoDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**r#type** | [**models::OrderPromoType**](OrderPromoType.md) |  | 
**discount** | Option<**f64**> | Размер пользовательской скидки в валюте покупателя.  | [optional]
**subsidy** | Option<**f64**> | Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа.  | [optional]
**shop_promo_id** | Option<**String**> | Идентификатор акции поставщика.  | [optional]
**market_promo_id** | Option<**String**> | Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр `type=MARKET_DEAL`.  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


