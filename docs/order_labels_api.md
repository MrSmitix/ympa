# order_labels_api

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GenerateOrderLabel**](order_labels_api.md#GenerateOrderLabel) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе
[**GenerateOrderLabels**](order_labels_api.md#GenerateOrderLabels) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе
[**GetOrderLabelsData**](order_labels_api.md#GetOrderLabelsData) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков


<a name="GenerateOrderLabel"></a>
# **GenerateOrderLabel**
> String! GenerateOrderLabel(campaignId, orderId, shipmentId, boxId, format)

Готовый ярлык‑наклейка для коробки в заказе

Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
<a name="GenerateOrderLabels"></a>
# **GenerateOrderLabels**
> String! GenerateOrderLabels(campaignId, orderId, format)

Готовые ярлыки‑наклейки на все коробки в одном заказе

Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
<a name="GetOrderLabelsData"></a>
# **GetOrderLabelsData**
> GetOrderLabelsDataResponse GetOrderLabelsData(campaignId, orderId)

Данные для самостоятельного изготовления ярлыков

Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
