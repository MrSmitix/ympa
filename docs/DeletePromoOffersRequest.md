
# Table `DeletePromoOffersRequest`
(mapped from: DeletePromoOffersRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**promoId** | promoId | text NOT NULL |  | **kotlin.String** | Идентификатор акции. | 
**deleteAllOffers** | deleteAllOffers | boolean |  | **kotlin.Boolean** | Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение &#x60;true&#x60; и не передавайте параметр &#x60;offerIds&#x60;. |  [optional]
**offerIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Товары, которые нужно убрать из акции. |  [optional]




# **Table `DeletePromoOffersRequestOfferIds`**
(mapped from: DeletePromoOffersRequestOfferIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
deletePromoOffersRequest | deletePromoOffersRequest | long | | kotlin.Long | Primary Key | *one*
offerIds | offerIds | text | | kotlin.String | Foreign Key | *many*



