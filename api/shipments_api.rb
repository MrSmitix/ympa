require 'json'


MyApp.add_route('POST', '/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm', {
  "resourcePath" => "/Shipments",
  "summary" => "Подтверждение отгрузки",
  "nickname" => "confirm_shipment",
  "responseClass" => "EmptyApiResponse",
  "endpoint" => "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm",
  "notes" => "Подтверждает отгрузку товаров в сортировочный центр или пункт приема заказов. |**⚙️ Лимит:** 100 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "campaign_id",
      "description" => "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "shipment_id",
      "description" => "Идентификатор отгрузки.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "ConfirmShipmentRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act', {
  "resourcePath" => "/Shipments",
  "summary" => "Получение акта приема-передачи",
  "nickname" => "download_shipment_act",
  "responseClass" => "File",
  "endpoint" => "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act",
  "notes" => "{% note warning \"Экспресс‑доставка\" %}  Если ваш магазин подключен к экспресс‑доставке и вы отгружаете заказы курьерам Яндекс Go, подготавливать акт приема‑передачи не нужно.  {% endnote %}  Запрос формирует акт приема-передачи заказов, входящих в отгрузку, и возвращает акт в формате PDF. В акте содержатся собранные и готовые к отправке заказы.  При формировании акта Маркет автоматически находит и подставляет в шаблон следующие данные:  {% cut \"Данные, из которых Маркет формирует акт\" %}  | **Данные в акте**                                         | **Описание**                                                                                                                                                                                                                                                         | | --------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | | Дата                                                      | Дата запроса.                                                                                                                                                                                                                                                        | | Отправитель                                               | Название вашего юридического лица, указанное в кабинете продавца на Маркете.                                                                                                                                                                                         | | Исполнитель                                               | Название юридического лица сортировочного центра или службы доставки.                                                                                                                                                                                                | | № отправления в системе заказчика                         | Ваш идентификатор заказа, который вы указали в ответе на запрос [POST order/accept](../../pushapi/reference/orderAccept.md) от Маркета.                                                                                                                              | | № отправления в системе исполнителя (субподрядчика)       | Идентификатор заказа на Маркете, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md).                                                                                                                             | | Объявленная ценность                                      | Общая сумма заказа без учета стоимости доставки, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                       | | Вес                                                       | Масса брутто грузового места (суммарная масса упаковки и содержимого), как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md). | | Количество мест                                           | Количество грузовых мест в заказе, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                                     |  {% endcut %}  Остальные поля нужно заполнить самостоятельно в распечатанном акте. |**⚙️ Лимит:** 100 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "campaign_id",
      "description" => "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "shipment_id",
      "description" => "Идентификатор отгрузки.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act', {
  "resourcePath" => "/Shipments",
  "summary" => "Получение акта расхождений",
  "nickname" => "download_shipment_discrepancy_act",
  "responseClass" => "File",
  "endpoint" => "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act",
  "notes" => "Возвращает акт расхождений для заданной отгрузки. |**⚙️ Лимит:** 200 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "campaign_id",
      "description" => "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "shipment_id",
      "description" => "Идентификатор отгрузки.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act', {
  "resourcePath" => "/Shipments",
  "summary" => "Получение фактического акта приема-передачи",
  "nickname" => "download_shipment_inbound_act",
  "responseClass" => "File",
  "endpoint" => "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act",
  "notes" => "Возвращает фактический акт приема-передачи для заданной отгрузки.  Такой акт становится доступен спустя несколько часов после завершения отгрузки. Он может понадобиться, если после отгрузки обнаружатся расхождения.  |**⚙️ Лимит:** 200 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "campaign_id",
      "description" => "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "shipment_id",
      "description" => "Идентификатор отгрузки.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels', {
  "resourcePath" => "/Shipments",
  "summary" => "Ярлыки для доверительной приемки (FBS)",
  "nickname" => "download_shipment_pallet_labels",
  "responseClass" => "File",
  "endpoint" => "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels",
  "notes" => "PDF-файл с ярлыками на каждый короб или палету в отгрузке для доверительной приемки. Подробнее про доверительную приемку написано в [Справке Маркета](https://yandex.ru/support/marketplace/orders/fbs/process.html#acceptance).  Распечатайте по несколько копий каждого ярлыка: на одну тару нужно наклеить минимум 2 ярлыка с разных сторон.  Количество упаковок в отгрузке задается в запросе [PUT campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets](../../reference/shipments/setShipmentPalletsCount.md). |**⚙️ Лимит:** 200 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "format",
      "description" => "Формат страниц PDF-файла с ярлыками:  * &#x60;A4&#x60; — по 16 ярлыков на странице. * &#x60;A8&#x60; — по одному ярлыку на странице. ",
      "dataType" => "ShipmentPalletLabelPageFormatType",
      "allowableValues" => "[A4, A8]",
      "defaultValue" => "'A8'",
      "paramType" => "query",
    },
    {
      "name" => "campaign_id",
      "description" => "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "shipment_id",
      "description" => "Идентификатор отгрузки.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/campaigns/{campaignId}/shipments/reception-transfer-act', {
  "resourcePath" => "/Shipments",
  "summary" => "Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее",
  "nickname" => "download_shipment_reception_transfer_act",
  "responseClass" => "File",
  "endpoint" => "/campaigns/{campaignId}/shipments/reception-transfer-act",
  "notes" => "Запрос подтверждает ближайшую отгрузку и возвращает акт приема-передачи в формате PDF.  {% note warning \"Экспресс‑доставка\" %}  Если ваш магазин подключен к экспресс‑доставке и вы отгружаете заказы курьерам [Яндекс Go](https://go.yandex/), подготавливать акт приема‑передачи не нужно.  {% endnote %}  В акт входят собранные и готовые к отправке заказы, которые отгружаются в сортировочный центр или пункт приема или курьерам Маркета.  При формировании акта Маркет автоматически находит и подставляет в шаблон следующие данные:  {% cut \"Данные, из которых Маркет формирует акт\" %}  | **Данные в акте**                                   | **Описание**                                                                                                                                                                                                                                                         | | --------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | | Отправитель                                         | Название вашего юридического лица, указанное в кабинете продавца на Маркете.                                                                                                                                                                                         | | Исполнитель                                         | Название юридического лица сортировочного центра или службы доставки.                                                                                                                                                                                                | | № отправления в системе заказчика                   | Ваш идентификатор заказа, который вы указали в ответе на запрос [POST order/accept](../../pushapi/reference/orderAccept.md) от Маркета.                                                                                                                              | | № отправления в системе исполнителя (субподрядчика) | Идентификатор заказа на Маркете, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md).                                                                                                                             | | Объявленная ценность                                | Общая сумма заказа без учета стоимости доставки, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                       | | Стоимость всех товаров в заказе                     | Стоимость всех заказанных товаров.                                                                                                                                                                                                                                   | | Вес                                                 | Масса брутто грузового места (суммарная масса упаковки и содержимого), как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md). | | Количество мест                                     | Количество грузовых мест в заказе, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                                     |  {% endcut %}  Остальные поля нужно заполнить самостоятельно в распечатанном акте. |**⚙️ Лимит:** 100 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "warehouse_id",
      "description" => "Идентификатор склада.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "campaign_id",
      "description" => "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill', {
  "resourcePath" => "/Shipments",
  "summary" => "Получение транспортной накладной",
  "nickname" => "download_shipment_transportation_waybill",
  "responseClass" => "File",
  "endpoint" => "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill",
  "notes" => "Возвращает транспортную накладную для заданной отгрузки.  Транспортная накладная понадобится, если вы отгружаете товары непосредственно со своего склада. [Подробно об этом способе отгрузки](https://yandex.ru/support/marketplace/orders/fbs/settings/shipment.html#at-your-warehouse)  |**⚙️ Лимит:** 200 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "campaign_id",
      "description" => "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "shipment_id",
      "description" => "Идентификатор отгрузки.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/campaigns/{campaignId}/first-mile/shipments/{shipmentId}', {
  "resourcePath" => "/Shipments",
  "summary" => "Получение информации об одной отгрузке",
  "nickname" => "get_shipment",
  "responseClass" => "GetShipmentResponse",
  "endpoint" => "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}",
  "notes" => "Возвращает информацию об отгрузке по ее идентификатору. |**⚙️ Лимит:** 100 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "cancelled_orders",
      "description" => "Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
      "paramType" => "query",
    },
    {
      "name" => "campaign_id",
      "description" => "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "shipment_id",
      "description" => "Идентификатор отгрузки.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info', {
  "resourcePath" => "/Shipments",
  "summary" => "Получение информации о возможности печати ярлыков (FBS)",
  "nickname" => "get_shipment_orders_info",
  "responseClass" => "GetShipmentOrdersInfoResponse",
  "endpoint" => "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info",
  "notes" => "Возвращает информацию о возможности печати ярлыков-наклеек для заказов в отгрузке. |**⚙️ Лимит:** 100 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "campaign_id",
      "description" => "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "shipment_id",
      "description" => "Идентификатор отгрузки.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/campaigns/{campaignId}/first-mile/shipments', {
  "resourcePath" => "/Shipments",
  "summary" => "Получение информации о нескольких отгрузках",
  "nickname" => "search_shipments",
  "responseClass" => "SearchShipmentsResponse",
  "endpoint" => "/campaigns/{campaignId}/first-mile/shipments",
  "notes" => "Возвращает информацию об отгрузках по заданным параметрам:  * дате; * статусу; * идентификаторам заказов.  Результаты возвращаются постранично. |**⚙️ Лимит:** 100 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "page_token",
      "description" => "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "Количество значений на одной странице. ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "campaign_id",
      "description" => "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "SearchShipmentsRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets', {
  "resourcePath" => "/Shipments",
  "summary" => "Передача количества упаковок в отгрузке",
  "nickname" => "set_shipment_pallets_count",
  "responseClass" => "EmptyApiResponse",
  "endpoint" => "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets",
  "notes" => "Передает Маркету количество коробов или палет в отгрузке для доверительной приемки. Подробнее про доверительную приемку написано в [Справке Маркета](https://yandex.ru/support/marketplace/orders/fbs/process.html#acceptance).  Получить PDF-файл с ярлыками для упаковок можно с помощью запроса [GET campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels](../../reference/shipments/downloadShipmentPalletLabels.md). |**⚙️ Лимит:** 200 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "campaign_id",
      "description" => "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "shipment_id",
      "description" => "Идентификатор отгрузки.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "SetShipmentPalletsCountRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer', {
  "resourcePath" => "/Shipments",
  "summary" => "Перенос заказов в следующую отгрузку",
  "nickname" => "transfer_orders_from_shipment",
  "responseClass" => "EmptyApiResponse",
  "endpoint" => "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer",
  "notes" => "Переносит указанные заказы из указанной отгрузки в следующую отгрузку. [Что такое отгрузка?](https://yandex.ru/support/marketplace/orders/fbs/process.html#ship)  Используйте этот запрос, если не успеваете собрать и упаковать заказы вовремя.  {% note warning \"Такие переносы снижают индекс качества магазина\" %}  Этот запрос предназначен для исключительных случаев. Если вы будете переносить заказы слишком часто, магазин столкнется с ограничениями. [Что за ограничения?](https://yandex.ru/support/marketplace/quality/score/fbs.html)  {% endnote %}  Переносить заказы можно, если до формирования отгрузки осталось больше получаса.  Перенос происходит не мгновенно, а занимает несколько минут.  |**⚙️ Лимит:** 200 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "campaign_id",
      "description" => "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "shipment_id",
      "description" => "Идентификатор отгрузки.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "TransferOrdersFromShipmentRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

