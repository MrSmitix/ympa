

# PromoOfferDiscountParamsDTO

Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.

The class is defined in **[PromoOfferDiscountParamsDTO.java](../../src/main/java/org/openapitools/model/PromoOfferDiscountParamsDTO.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**price** | `Long` | Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции.  |  [optional property]
**promoPrice** | `Long` | Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции.  |  [optional property]
**maxPromoPrice** | `Long` | Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров.  | 





