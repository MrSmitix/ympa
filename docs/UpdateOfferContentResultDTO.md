
# Table `UpdateOfferContentResultDTO`
(mapped from: UpdateOfferContentResultDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offerId** | offerId | text NOT NULL |  | **kotlin.String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**errors** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OfferContentErrorDTO&gt;**](OfferContentErrorDTO.md) | Ошибки — информация в каталоге не обновится. |  [optional]
**warnings** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OfferContentErrorDTO&gt;**](OfferContentErrorDTO.md) | Предупреждения — информация в каталоге обновится. |  [optional]



# **Table `UpdateOfferContentResultDTOOfferContentErrorDTO`**
(mapped from: UpdateOfferContentResultDTOOfferContentErrorDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updateOfferContentResultDTO | updateOfferContentResultDTO | long | | kotlin.Long | Primary Key | *one*
offerContentErrorDTO | offerContentErrorDTO | long | | kotlin.Long | Foreign Key | *many*



# **Table `UpdateOfferContentResultDTOOfferContentErrorDTO`**
(mapped from: UpdateOfferContentResultDTOOfferContentErrorDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updateOfferContentResultDTO | updateOfferContentResultDTO | long | | kotlin.Long | Primary Key | *one*
offerContentErrorDTO | offerContentErrorDTO | long | | kotlin.Long | Foreign Key | *many*



