# ympa_r_client::GenerateUnitedOrdersRequest

Данные, необходимые для генерации отчета. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**businessId** | **integer** | Идентификатор бизнеса. | 
**dateFrom** | **character** | Начало периода, включительно. | 
**dateTo** | **character** | Конец периода, включительно. Максимальный период — 1 год. | 
**campaignIds** | **array[integer]** | Список магазинов, которые нужны в отчете. | [optional] 
**promoId** | **character** | Идентификатор акции, товары из которой нужны в отчете. | [optional] 


