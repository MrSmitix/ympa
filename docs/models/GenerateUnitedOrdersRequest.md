

# GenerateUnitedOrdersRequest

Данные, необходимые для генерации отчета. 

The class is defined in **[GenerateUnitedOrdersRequest.java](../../src/main/java/org/openapitools/model/GenerateUnitedOrdersRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**businessId** | `Long` | Идентификатор бизнеса. | 
**dateFrom** | `LocalDate` | Начало периода, включительно. | 
**dateTo** | `LocalDate` | Конец периода, включительно. Максимальный период — 1 год. | 
**campaignIds** | `List&lt;Long&gt;` | Список магазинов, которые нужны в отчете. |  [optional property]
**promoId** | `String` | Идентификатор акции, товары из которой нужны в отчете. |  [optional property]







