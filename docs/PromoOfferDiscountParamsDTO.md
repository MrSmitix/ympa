
# Table `PromoOfferDiscountParamsDTO`
(mapped from: PromoOfferDiscountParamsDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**maxPromoPrice** | maxPromoPrice | long NOT NULL |  | **kotlin.Long** | Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров.  | 
**price** | price | long |  | **kotlin.Long** | Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции.  |  [optional]
**promoPrice** | promoPrice | long |  | **kotlin.Long** | Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции.  |  [optional]





