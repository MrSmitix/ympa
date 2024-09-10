
# Table `ReturnDTO`
(mapped from: ReturnDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ReturnItemDTO&gt;**](ReturnItemDTO.md) | Список товаров в возврате. | 
**id** | id | long PRIMARY KEY AUTOINCREMENT |  | **kotlin.Long** | Идентификатор возврата. |  [optional]
**orderId** | orderId | long |  | **kotlin.Long** | Номер заказа. |  [optional]
**creationDate** | creationDate | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Дата создания возврата клиентом. |  [optional]
**updateDate** | updateDate | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Дата обновления возврата. |  [optional]
**refundStatus** | refundStatus | long |  | [**RefundStatusType**](RefundStatusType.md) |  |  [optional] [foreignkey]
**logisticPickupPoint** | logisticPickupPoint | long |  | [**LogisticPickupPointDTO**](LogisticPickupPointDTO.md) |  |  [optional] [foreignkey]
**shipmentRecipientType** | shipmentRecipientType | long |  | [**RecipientType**](RecipientType.md) |  |  [optional] [foreignkey]
**shipmentStatus** | shipmentStatus | long |  | [**ReturnShipmentStatusType**](ReturnShipmentStatusType.md) |  |  [optional] [foreignkey]
**refundAmount** | refundAmount | long |  | **kotlin.Long** | Сумма возврата. |  [optional]
**returnType** | returnType | long |  | [**ReturnType**](ReturnType.md) |  |  [optional] [foreignkey]
**fastReturn** | fastReturn | boolean |  | **kotlin.Boolean** | Используется ли опция **Быстрый возврат денег за дешевый брак**.  |  [optional]


# **Table `ReturnDTOReturnItemDTO`**
(mapped from: ReturnDTOReturnItemDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
returnDTO | returnDTO | long | | kotlin.Long | Primary Key | *one*
returnItemDTO | returnItemDTO | long | | kotlin.Long | Foreign Key | *many*














