
# Table `WarningPromoOfferUpdateDTO`
(mapped from: WarningPromoOfferUpdateDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offerId** | offerId | text NOT NULL |  | **kotlin.String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**warnings** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PromoOfferUpdateWarningDTO&gt;**](PromoOfferUpdateWarningDTO.md) | Предупреждения, которые появились при добавлении товара в акцию или изменении его цен. | 



# **Table `WarningPromoOfferUpdateDTOPromoOfferUpdateWarningDTO`**
(mapped from: WarningPromoOfferUpdateDTOPromoOfferUpdateWarningDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
warningPromoOfferUpdateDTO | warningPromoOfferUpdateDTO | long | | kotlin.Long | Primary Key | *one*
promoOfferUpdateWarningDTO | promoOfferUpdateWarningDTO | long | | kotlin.Long | Foreign Key | *many*



