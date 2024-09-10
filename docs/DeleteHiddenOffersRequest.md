
# Table `DeleteHiddenOffersRequest`
(mapped from: DeleteHiddenOffersRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**hiddenOffers** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;HiddenOfferDTO&gt;**](HiddenOfferDTO.md) | Список скрытых товаров.  | 


# **Table `DeleteHiddenOffersRequestHiddenOfferDTO`**
(mapped from: DeleteHiddenOffersRequestHiddenOfferDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
deleteHiddenOffersRequest | deleteHiddenOffersRequest | long | | kotlin.Long | Primary Key | *one*
hiddenOfferDTO | hiddenOfferDTO | long | | kotlin.Long | Foreign Key | *many*



