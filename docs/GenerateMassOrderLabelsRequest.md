
# Table `GenerateMassOrderLabelsRequest`
(mapped from: GenerateMassOrderLabelsRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**businessId** | businessId | long NOT NULL |  | **kotlin.Long** | Идентификатор кабинета. | 
**orderIds** | `One-To-Many` | `----` | `----`  | **kotlin.collections.Set&lt;kotlin.Long&gt;** | Список идентификаторов заказов. | 



# **Table `GenerateMassOrderLabelsRequestOrderIds`**
(mapped from: GenerateMassOrderLabelsRequestOrderIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
generateMassOrderLabelsRequest | generateMassOrderLabelsRequest | long | | kotlin.Long | Primary Key | *one*
orderIds | orderIds | long | | kotlin.Long | Foreign Key | *many*



