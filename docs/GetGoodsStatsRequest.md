
# Table `GetGoodsStatsRequest`
(mapped from: GetGoodsStatsRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**shopSkus** | `One-To-Many` | `----` | `----`  | **kotlin.collections.Set&lt;kotlin.String&gt;** | Список ваших идентификаторов SKU.  | 


# **Table `GetGoodsStatsRequestShopSkus`**
(mapped from: GetGoodsStatsRequestShopSkus)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getGoodsStatsRequest | getGoodsStatsRequest | long | | kotlin.Long | Primary Key | *one*
shopSkus | shopSkus | text | | kotlin.String | Foreign Key | *many*



