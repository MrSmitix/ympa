
# Table `GetChatsRequest`
(mapped from: GetChatsRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**orderIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Long&gt;** | Фильтр по идентификаторам заказов на Маркете. |  [optional]
**types** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ChatType&gt;**](ChatType.md) | Фильтр по типам чатов. |  [optional]
**statuses** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ChatStatusType&gt;**](ChatStatusType.md) | Фильтр по статусам чатов. |  [optional]


# **Table `GetChatsRequestOrderIds`**
(mapped from: GetChatsRequestOrderIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getChatsRequest | getChatsRequest | long | | kotlin.Long | Primary Key | *one*
orderIds | orderIds | long | | kotlin.Long | Foreign Key | *many*



# **Table `GetChatsRequestChatType`**
(mapped from: GetChatsRequestChatType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getChatsRequest | getChatsRequest | long | | kotlin.Long | Primary Key | *one*
chatType | chatType | long | | kotlin.Long | Foreign Key | *many*



# **Table `GetChatsRequestChatStatusType`**
(mapped from: GetChatsRequestChatStatusType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getChatsRequest | getChatsRequest | long | | kotlin.Long | Primary Key | *one*
chatStatusType | chatStatusType | long | | kotlin.Long | Foreign Key | *many*



