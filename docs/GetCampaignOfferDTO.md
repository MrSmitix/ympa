
# Table `GetCampaignOfferDTO`
(mapped from: GetCampaignOfferDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offerId** | offerId | text NOT NULL |  | **kotlin.String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**quantum** | quantum | long |  | [**QuantumDTO**](QuantumDTO.md) |  |  [optional] [foreignkey]
**available** | available | boolean |  | **kotlin.Boolean** | Есть ли товар в продаже.  |  [optional]
**basicPrice** | basicPrice | long |  | [**GetPriceWithDiscountDTO**](GetPriceWithDiscountDTO.md) |  |  [optional] [foreignkey]
**campaignPrice** | campaignPrice | long |  | [**GetPriceWithVatDTO**](GetPriceWithVatDTO.md) |  |  [optional] [foreignkey]
**status** | status | long |  | [**OfferCampaignStatusType**](OfferCampaignStatusType.md) |  |  [optional] [foreignkey]
**errors** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OfferErrorDTO&gt;**](OfferErrorDTO.md) | Ошибки, препятствующие размещению товара на витрине.  |  [optional]
**warnings** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OfferErrorDTO&gt;**](OfferErrorDTO.md) | Предупреждения, не препятствующие размещению товара на витрине.  |  [optional]








# **Table `GetCampaignOfferDTOOfferErrorDTO`**
(mapped from: GetCampaignOfferDTOOfferErrorDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getCampaignOfferDTO | getCampaignOfferDTO | long | | kotlin.Long | Primary Key | *one*
offerErrorDTO | offerErrorDTO | long | | kotlin.Long | Foreign Key | *many*



# **Table `GetCampaignOfferDTOOfferErrorDTO`**
(mapped from: GetCampaignOfferDTOOfferErrorDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getCampaignOfferDTO | getCampaignOfferDTO | long | | kotlin.Long | Primary Key | *one*
offerErrorDTO | offerErrorDTO | long | | kotlin.Long | Foreign Key | *many*



