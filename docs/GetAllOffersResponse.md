
# Table `GetAllOffersResponse`
(mapped from: GetAllOffersResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offers** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OfferDTO&gt;**](OfferDTO.md) | Список предложений магазина. | 


# **Table `GetAllOffersResponseOfferDTO`**
(mapped from: GetAllOffersResponseOfferDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getAllOffersResponse | getAllOffersResponse | long | | kotlin.Long | Primary Key | *one*
offerDTO | offerDTO | long | | kotlin.Long | Foreign Key | *many*



