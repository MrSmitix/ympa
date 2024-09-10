# outlets_api

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateOutlet**](outlets_api.md#CreateOutlet) | **POST** /campaigns/{campaignId}/outlets | Создание точки продаж
[**DeleteOutlet**](outlets_api.md#DeleteOutlet) | **DELETE** /campaigns/{campaignId}/outlets/{outletId} | Удаление точки продаж
[**GetOutlet**](outlets_api.md#GetOutlet) | **GET** /campaigns/{campaignId}/outlets/{outletId} | Информация об одной точке продаж
[**GetOutlets**](outlets_api.md#GetOutlets) | **GET** /campaigns/{campaignId}/outlets | Информация о нескольких точках продаж
[**UpdateOutlet**](outlets_api.md#UpdateOutlet) | **PUT** /campaigns/{campaignId}/outlets/{outletId} | Изменение информации о точке продаж


<a name="CreateOutlet"></a>
# **CreateOutlet**
> CreateOutletResponse CreateOutlet(campaignId, changeOutletRequest)

Создание точки продаж

Создает точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
<a name="DeleteOutlet"></a>
# **DeleteOutlet**
> EmptyApiResponse DeleteOutlet(campaignId, outletId)

Удаление точки продаж

Удаляет точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
<a name="GetOutlet"></a>
# **GetOutlet**
> GetOutletResponse GetOutlet(campaignId, outletId)

Информация об одной точке продаж

Возвращает информацию о точках продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
<a name="GetOutlets"></a>
# **GetOutlets**
> GetOutletsResponse GetOutlets(campaignId, pageToken, regionId, shopOutletCode, regionId2)

Информация о нескольких точках продаж

Возвращает список точек продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
<a name="UpdateOutlet"></a>
# **UpdateOutlet**
> EmptyApiResponse UpdateOutlet(campaignId, outletId, changeOutletRequest)

Изменение информации о точке продаж

Изменяет информацию о точке продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
