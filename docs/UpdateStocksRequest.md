
# Table `UpdateStocksRequest`
(mapped from: UpdateStocksRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**skus** | `One-To-Many` | `----` | `----`  | [**kotlin.collections.Set&lt;UpdateStockDTO&gt;**](UpdateStockDTO.md) | Данные об остатках товаров.  | 


# **Table `UpdateStocksRequestUpdateStockDTO`**
(mapped from: UpdateStocksRequestUpdateStockDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updateStocksRequest | updateStocksRequest | long | | kotlin.Long | Primary Key | *one*
updateStockDTO | updateStockDTO | long | | kotlin.Long | Foreign Key | *many*



