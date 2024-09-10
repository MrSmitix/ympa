
# Table `UpdateOrderStorageLimitRequest`
(mapped from: UpdateOrderStorageLimitRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**newDate** | newDate | date NOT NULL |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Новая дата, до которой заказ будет храниться в пункте выдачи.  Срок хранения можно увеличить не больше, чем на 30 дней.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | 



