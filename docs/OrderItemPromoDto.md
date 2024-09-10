# OrderItemPromoDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type_** | [***OrderPromoType**](OrderPromoType.md) |  | [default to null]
**discount** | **Float!** | Размер пользовательской скидки в валюте покупателя.  | [optional] [default to null]
**subsidy** | **Float!** | Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа.  | [optional] [default to null]
**shopPromoId** | **String!** | Идентификатор акции поставщика.  | [optional] [default to null]
**marketPromoId** | **String!** | Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр &#x60;type&#x3D;MARKET_DEAL&#x60;.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


