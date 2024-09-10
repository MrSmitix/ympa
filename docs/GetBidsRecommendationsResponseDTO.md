
# Table `GetBidsRecommendationsResponseDTO`
(mapped from: GetBidsRecommendationsResponseDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**recommendations** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;SkuBidRecommendationItemDTO&gt;**](SkuBidRecommendationItemDTO.md) | Список товаров с рекомендованными ставками. | 


# **Table `GetBidsRecommendationsResponseDTOSkuBidRecommendationItemDTO`**
(mapped from: GetBidsRecommendationsResponseDTOSkuBidRecommendationItemDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getBidsRecommendationsResponseDTO | getBidsRecommendationsResponseDTO | long | | kotlin.Long | Primary Key | *one*
skuBidRecommendationItemDTO | skuBidRecommendationItemDTO | long | | kotlin.Long | Foreign Key | *many*



