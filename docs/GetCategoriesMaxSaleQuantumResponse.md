
# Table `GetCategoriesMaxSaleQuantumResponse`
(mapped from: GetCategoriesMaxSaleQuantumResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MaxSaleQuantumDTO&gt;**](MaxSaleQuantumDTO.md) | Категории и лимит на установку кванта и минимального количества товаров. | 
**status** | status | long |  | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  |  [optional] [foreignkey]
**errors** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CategoryErrorDTO&gt;**](CategoryErrorDTO.md) | Ошибки, которые появились из-за переданных категорий. |  [optional]


# **Table `GetCategoriesMaxSaleQuantumResponseMaxSaleQuantumDTO`**
(mapped from: GetCategoriesMaxSaleQuantumResponseMaxSaleQuantumDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getCategoriesMaxSaleQuantumResponse | getCategoriesMaxSaleQuantumResponse | long | | kotlin.Long | Primary Key | *one*
maxSaleQuantumDTO | maxSaleQuantumDTO | long | | kotlin.Long | Foreign Key | *many*




# **Table `GetCategoriesMaxSaleQuantumResponseCategoryErrorDTO`**
(mapped from: GetCategoriesMaxSaleQuantumResponseCategoryErrorDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getCategoriesMaxSaleQuantumResponse | getCategoriesMaxSaleQuantumResponse | long | | kotlin.Long | Primary Key | *one*
categoryErrorDTO | categoryErrorDTO | long | | kotlin.Long | Foreign Key | *many*



