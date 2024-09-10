
# Table `UpdatePromoOffersRequest`
(mapped from: UpdatePromoOffersRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**promoId** | promoId | text NOT NULL |  | **kotlin.String** | Идентификатор акции. | 
**offers** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;UpdatePromoOfferDTO&gt;**](UpdatePromoOfferDTO.md) | Товары, которые необходимо добавить в акцию или цены которых нужно изменить. | 



# **Table `UpdatePromoOffersRequestUpdatePromoOfferDTO`**
(mapped from: UpdatePromoOffersRequestUpdatePromoOfferDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updatePromoOffersRequest | updatePromoOffersRequest | long | | kotlin.Long | Primary Key | *one*
updatePromoOfferDTO | updatePromoOfferDTO | long | | kotlin.Long | Foreign Key | *many*



