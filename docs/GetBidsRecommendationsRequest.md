
# Table `GetBidsRecommendationsRequest`
(mapped from: GetBidsRecommendationsRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**skus** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Список товаров, для которых нужно получить рекомендации по ставкам.  | 


# **Table `GetBidsRecommendationsRequestSkus`**
(mapped from: GetBidsRecommendationsRequestSkus)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getBidsRecommendationsRequest | getBidsRecommendationsRequest | long | | kotlin.Long | Primary Key | *one*
skus | skus | text | | kotlin.String | Foreign Key | *many*



