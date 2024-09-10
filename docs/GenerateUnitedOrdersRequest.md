

# GenerateUnitedOrdersRequest

Данные, необходимые для генерации отчета. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**businessId** | **Long** | Идентификатор бизнеса. | 
**dateFrom** | **LocalDate** | Начало периода, включительно. | 
**dateTo** | **LocalDate** | Конец периода, включительно. Максимальный период — 1 год. | 
**campaignIds** | **Seq&lt;Long&gt;** | Список магазинов, которые нужны в отчете. |  [optional]
**promoId** | **String** | Идентификатор акции, товары из которой нужны в отчете. |  [optional]



