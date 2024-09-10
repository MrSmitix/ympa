
# Table `GetCategoriesMaxSaleQuantumRequest`
(mapped from: GetCategoriesMaxSaleQuantumRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**marketCategoryIds** | `One-To-Many` | `----` | `----`  | **kotlin.collections.Set&lt;kotlin.Long&gt;** | Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий. | 


# **Table `GetCategoriesMaxSaleQuantumRequestMarketCategoryIds`**
(mapped from: GetCategoriesMaxSaleQuantumRequestMarketCategoryIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getCategoriesMaxSaleQuantumRequest | getCategoriesMaxSaleQuantumRequest | long | | kotlin.Long | Primary Key | *one*
marketCategoryIds | marketCategoryIds | long | | kotlin.Long | Foreign Key | *many*



