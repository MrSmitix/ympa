require 'json'


MyApp.add_route('GET', '/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label', {
  "resourcePath" => "/OrderLabels",
  "summary" => "Готовый ярлык‑наклейка для коробки в заказе",
  "nickname" => "generate_order_label",
  "responseClass" => "File",
  "endpoint" => "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label",
  "notes" => "Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "format",
      "description" => "Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.",
      "dataType" => "PageFormatType",
      "allowableValues" => "[A7, A4]",
      "paramType" => "query",
    },
    {
      "name" => "campaign_id",
      "description" => "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "order_id",
      "description" => "Идентификатор заказа.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "shipment_id",
      "description" => "Идентификатор грузоместа.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "box_id",
      "description" => "Идентификатор коробки.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/campaigns/{campaignId}/orders/{orderId}/delivery/labels', {
  "resourcePath" => "/OrderLabels",
  "summary" => "Готовые ярлыки‑наклейки на все коробки в одном заказе",
  "nickname" => "generate_order_labels",
  "responseClass" => "File",
  "endpoint" => "/campaigns/{campaignId}/orders/{orderId}/delivery/labels",
  "notes" => "Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "format",
      "description" => "Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.",
      "dataType" => "PageFormatType",
      "allowableValues" => "[A7, A4]",
      "paramType" => "query",
    },
    {
      "name" => "campaign_id",
      "description" => "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "order_id",
      "description" => "Идентификатор заказа.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data', {
  "resourcePath" => "/OrderLabels",
  "summary" => "Данные для самостоятельного изготовления ярлыков",
  "nickname" => "get_order_labels_data",
  "responseClass" => "GetOrderLabelsDataResponse",
  "endpoint" => "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data",
  "notes" => "Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "campaign_id",
      "description" => "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "order_id",
      "description" => "Идентификатор заказа.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

