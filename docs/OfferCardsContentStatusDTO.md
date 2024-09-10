
# Table `OfferCardsContentStatusDTO`
(mapped from: OfferCardsContentStatusDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offerCards** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OfferCardDTO&gt;**](OfferCardDTO.md) | Страница списка товаров с информацией о состоянии карточек. | 
**paging** | paging | long |  | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  |  [optional] [foreignkey]


# **Table `OfferCardsContentStatusDTOOfferCardDTO`**
(mapped from: OfferCardsContentStatusDTOOfferCardDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
offerCardsContentStatusDTO | offerCardsContentStatusDTO | long | | kotlin.Long | Primary Key | *one*
offerCardDTO | offerCardDTO | long | | kotlin.Long | Foreign Key | *many*




