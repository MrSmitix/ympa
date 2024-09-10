
# Table `GetChatInfoDTO`
(mapped from: GetChatInfoDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**chatId** | chatId | long NOT NULL |  | **kotlin.Long** | Идентификатор чата. | 
**orderId** | orderId | long NOT NULL |  | **kotlin.Long** | Идентификатор заказа. | 
**type** | type | long NOT NULL |  | [**ChatType**](ChatType.md) |  |  [foreignkey]
**status** | status | long NOT NULL |  | [**ChatStatusType**](ChatStatusType.md) |  |  [foreignkey]
**createdAt** | createdAt | datetime NOT NULL |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | 
**updatedAt** | updatedAt | datetime NOT NULL |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Дата и время последнего сообщения в чате. | 








