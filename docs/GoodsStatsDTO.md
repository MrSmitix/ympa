
# Table `GoodsStatsDTO`
(mapped from: GoodsStatsDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**shopSkus** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;GoodsStatsGoodsDTO&gt;**](GoodsStatsGoodsDTO.md) | Список товаров. | 


# **Table `GoodsStatsDTOGoodsStatsGoodsDTO`**
(mapped from: GoodsStatsDTOGoodsStatsGoodsDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
goodsStatsDTO | goodsStatsDTO | long | | kotlin.Long | Primary Key | *one*
goodsStatsGoodsDTO | goodsStatsGoodsDTO | long | | kotlin.Long | Foreign Key | *many*



