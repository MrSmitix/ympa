
# Table `OrderItemPromoDTO`
(mapped from: OrderItemPromoDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**type** | type | long NOT NULL |  | [**OrderPromoType**](OrderPromoType.md) |  |  [foreignkey]
**discount** | discount | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Размер пользовательской скидки в валюте покупателя.  |  [optional]
**subsidy** | subsidy | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа.  |  [optional]
**shopPromoId** | shopPromoId | text |  | **kotlin.String** | Идентификатор акции поставщика.  |  [optional]
**marketPromoId** | marketPromoId | text |  | **kotlin.String** | Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр &#x60;type&#x3D;MARKET_DEAL&#x60;.  |  [optional]







