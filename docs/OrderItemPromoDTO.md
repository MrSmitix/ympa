# OrderItemPromoDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [***OrderPromoType**](OrderPromoType.md) |  | [default to nothing]
**discount** | **Float64** | Размер пользовательской скидки в валюте покупателя.  | [optional] [default to nothing]
**subsidy** | **Float64** | Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа.  | [optional] [default to nothing]
**shopPromoId** | **String** | Идентификатор акции поставщика.  | [optional] [default to nothing]
**marketPromoId** | **String** | Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр &#x60;type&#x3D;MARKET_DEAL&#x60;.  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


