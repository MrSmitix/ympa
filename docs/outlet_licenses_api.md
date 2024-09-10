# outlet_licenses_api

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteOutletLicenses**](outlet_licenses_api.md#DeleteOutletLicenses) | **DELETE** /campaigns/{campaignId}/outlets/licenses | Удаление лицензий для точек продаж
[**GetOutletLicenses**](outlet_licenses_api.md#GetOutletLicenses) | **GET** /campaigns/{campaignId}/outlets/licenses | Информация о лицензиях для точек продаж
[**UpdateOutletLicenses**](outlet_licenses_api.md#UpdateOutletLicenses) | **POST** /campaigns/{campaignId}/outlets/licenses | Создание и изменение лицензий для точек продаж


<a name="DeleteOutletLicenses"></a>
# **DeleteOutletLicenses**
> EmptyApiResponse DeleteOutletLicenses(campaignId, ids)

Удаление лицензий для точек продаж

Удаляет информацию о лицензиях для точек продаж.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
<a name="GetOutletLicenses"></a>
# **GetOutletLicenses**
> GetOutletLicensesResponse GetOutletLicenses(campaignId, outletIds, ids)

Информация о лицензиях для точек продаж

Возвращает информацию о лицензиях для точек продаж.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
<a name="UpdateOutletLicenses"></a>
# **UpdateOutletLicenses**
> EmptyApiResponse UpdateOutletLicenses(campaignId, updateOutletLicenseRequest)

Создание и изменение лицензий для точек продаж

Передает информацию о новых и существующих лицензиях для точек продаж. Поддерживаются только лицензии на розничную продажу алкоголя.  Чтобы размещать алкогольную продукцию на Маркете, надо также прислать гарантийное письмо (если вы еще не делали этого раньше) и правильно оформить предложения в прайс-листе. Далее информация о лицензиях проходит проверку.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
