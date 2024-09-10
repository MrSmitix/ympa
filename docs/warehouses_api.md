# warehouses_api

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetFulfillmentWarehouses**](warehouses_api.md#GetFulfillmentWarehouses) | **GET** /warehouses | Идентификаторы складов Маркета (FBY)
[**GetWarehouses**](warehouses_api.md#GetWarehouses) | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов


<a name="GetFulfillmentWarehouses"></a>
# **GetFulfillmentWarehouses**
> GetFulfillmentWarehousesResponse GetFulfillmentWarehouses()

Идентификаторы складов Маркета (FBY)

Возвращает список складов Маркета с их идентификаторами.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
<a name="GetWarehouses"></a>
# **GetWarehouses**
> GetWarehousesResponse GetWarehouses(businessId)

Список складов и групп складов

Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)  Среди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
