
# Table `UpdateStockItemDTO`
(mapped from: UpdateStockItemDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | long UNSIGNED NOT NULL |  | **kotlin.Long** | Количество доступного товара.  | 
**updatedAt** | updatedAt | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Дата и время последнего обновления информации об остатках. &lt;br&gt;&lt;br&gt; Если вы не передали параметр &#x60;updatedAt&#x60;, используется текущее время. &lt;br&gt;&lt;br&gt; Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  |  [optional]




