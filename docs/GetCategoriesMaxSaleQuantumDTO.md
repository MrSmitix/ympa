
# Table `GetCategoriesMaxSaleQuantumDTO`
(mapped from: GetCategoriesMaxSaleQuantumDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MaxSaleQuantumDTO&gt;**](MaxSaleQuantumDTO.md) | Категории и лимит на установку кванта и минимального количества товаров. | 
**errors** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CategoryErrorDTO&gt;**](CategoryErrorDTO.md) | Ошибки, которые появились из-за переданных категорий. |  [optional]


# **Table `GetCategoriesMaxSaleQuantumDTOMaxSaleQuantumDTO`**
(mapped from: GetCategoriesMaxSaleQuantumDTOMaxSaleQuantumDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getCategoriesMaxSaleQuantumDTO | getCategoriesMaxSaleQuantumDTO | long | | kotlin.Long | Primary Key | *one*
maxSaleQuantumDTO | maxSaleQuantumDTO | long | | kotlin.Long | Foreign Key | *many*



# **Table `GetCategoriesMaxSaleQuantumDTOCategoryErrorDTO`**
(mapped from: GetCategoriesMaxSaleQuantumDTOCategoryErrorDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getCategoriesMaxSaleQuantumDTO | getCategoriesMaxSaleQuantumDTO | long | | kotlin.Long | Primary Key | *one*
categoryErrorDTO | categoryErrorDTO | long | | kotlin.Long | Foreign Key | *many*



