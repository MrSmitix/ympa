
# Table `GenerateUnitedOrdersRequest`
(mapped from: GenerateUnitedOrdersRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**businessId** | businessId | long NOT NULL |  | **kotlin.Long** | Идентификатор бизнеса. | 
**dateFrom** | dateFrom | date NOT NULL |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Начало периода, включительно. | 
**dateTo** | dateTo | date NOT NULL |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Конец периода, включительно. Максимальный период — 1 год. | 
**campaignIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Long&gt;** | Список магазинов, которые нужны в отчете. |  [optional]
**promoId** | promoId | text |  | **kotlin.String** | Идентификатор акции, товары из которой нужны в отчете. |  [optional]





# **Table `GenerateUnitedOrdersRequestCampaignIds`**
(mapped from: GenerateUnitedOrdersRequestCampaignIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
generateUnitedOrdersRequest | generateUnitedOrdersRequest | long | | kotlin.Long | Primary Key | *one*
campaignIds | campaignIds | long | | kotlin.Long | Foreign Key | *many*




