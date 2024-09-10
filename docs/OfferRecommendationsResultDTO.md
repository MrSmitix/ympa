
# Table `OfferRecommendationsResultDTO`
(mapped from: OfferRecommendationsResultDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offerRecommendations** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OfferRecommendationDTO&gt;**](OfferRecommendationDTO.md) | Страница списка товаров. | 
**paging** | paging | long |  | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  |  [optional] [foreignkey]


# **Table `OfferRecommendationsResultDTOOfferRecommendationDTO`**
(mapped from: OfferRecommendationsResultDTOOfferRecommendationDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
offerRecommendationsResultDTO | offerRecommendationsResultDTO | long | | kotlin.Long | Primary Key | *one*
offerRecommendationDTO | offerRecommendationDTO | long | | kotlin.Long | Foreign Key | *many*




