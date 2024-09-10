# ympa_csharp_client.Model.OrderItemPromoDTO
Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **OrderPromoType** |  | 
**Discount** | **decimal** | Размер пользовательской скидки в валюте покупателя.  | [optional] 
**Subsidy** | **decimal** | Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа.  | [optional] 
**ShopPromoId** | **string** | Идентификатор акции поставщика.  | [optional] 
**MarketPromoId** | **string** | Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр &#x60;type&#x3D;MARKET_DEAL&#x60;.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

