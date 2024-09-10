

# OrderItemPromoDTO

Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.

The class is defined in **[OrderItemPromoDTO.java](../../src/main/java/org/openapitools/model/OrderItemPromoDTO.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | `OrderPromoType` |  | 
**discount** | `BigDecimal` | Размер пользовательской скидки в валюте покупателя.  |  [optional property]
**subsidy** | `BigDecimal` | Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа.  |  [optional property]
**shopPromoId** | `String` | Идентификатор акции поставщика.  |  [optional property]
**marketPromoId** | `String` | Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр &#x60;type&#x3D;MARKET_DEAL&#x60;.  |  [optional property]







