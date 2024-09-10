
# Table `GenerateGoodsMovementReportRequest`
(mapped from: GenerateGoodsMovementReportRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**campaignId** | campaignId | long NOT NULL |  | **kotlin.Long** | Идентификатор кампании. | 
**dateFrom** | dateFrom | date NOT NULL |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Начало периода, включительно. | 
**dateTo** | dateTo | date NOT NULL |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Конец периода, включительно. | 
**shopSku** | shopSku | text |  | **kotlin.String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  |  [optional]






