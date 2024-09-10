#
# Партнерский API Маркета
# 
# API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
# The version of the OpenAPI document: LATEST
# 
# Generated by: https://openapi-generator.tech
#

import json
import tables

import model_logistic_pickup_point_dto
import model_recipient_type
import model_refund_status_type
import model_return_item_dto
import model_return_shipment_status_type
import model_return_type

type ReturnDTO* = object
  ## Возврат заказа.
  id*: int64 ## Идентификатор возврата.
  orderId*: int64 ## Номер заказа.
  creationDate*: string ## Дата создания возврата клиентом.
  updateDate*: string ## Дата обновления возврата.
  refundStatus*: RefundStatusType
  logisticPickupPoint*: LogisticPickupPointDTO
  shipmentRecipientType*: RecipientType
  shipmentStatus*: ReturnShipmentStatusType
  refundAmount*: int64 ## Сумма возврата.
  items*: seq[ReturnItemDTO] ## Список товаров в возврате.
  returnType*: ReturnType
  fastReturn*: bool ## Используется ли опция **Быстрый возврат денег за дешевый брак**. 