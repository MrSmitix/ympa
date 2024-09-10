
# Table `AddHiddenOffersRequest`
(mapped from: AddHiddenOffersRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**hiddenOffers** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;HiddenOfferDTO&gt;**](HiddenOfferDTO.md) | Список скрытых товаров.  | 


# **Table `AddHiddenOffersRequestHiddenOfferDTO`**
(mapped from: AddHiddenOffersRequestHiddenOfferDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
addHiddenOffersRequest | addHiddenOffersRequest | long | | kotlin.Long | Primary Key | *one*
hiddenOfferDTO | hiddenOfferDTO | long | | kotlin.Long | Foreign Key | *many*



