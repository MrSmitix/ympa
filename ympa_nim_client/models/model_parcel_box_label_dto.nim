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


type ParcelBoxLabelDTO* = object
  ## Информация о ярлыке для коробки.
  url*: string ## Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md). 
  supplierName*: string ## Юридическое название магазина.
  deliveryServiceName*: string ## Юридическое название службы доставки.
  orderId*: int64 ## Идентификатор заказа в системе Маркета.
  orderNum*: string ## Идентификатор заказа в информационной системе магазина.  Совпадает с `orderId`, если Маркету неизвестен номер заказа в системе магазина. 
  recipientName*: string ## Фамилия и инициалы получателя заказа.
  boxId*: int64 ## Идентификатор коробки.
  fulfilmentId*: string ## Идентификатор коробки в информационной системе магазина.  Возвращается в формате: `номер заказа на Маркете-номер коробки`. Например, `7206821‑1`, `7206821‑2` и т. д. 
  place*: string ## Номер коробки в заказе. Возвращается в формате: `номер места/общее количество мест`. 
  weight*: string ## {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: `weight кг`. 
  deliveryServiceId*: string ## Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
  deliveryAddress*: string ## Адрес получателя.
  shipmentDate*: string ## Дата отгрузки в формате `dd.MM.yyyy`.