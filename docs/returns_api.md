# returns_api

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetReturn**](returns_api.md#GetReturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате
[**GetReturnApplication**](returns_api.md#GetReturnApplication) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат
[**GetReturnPhoto**](returns_api.md#GetReturnPhoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата
[**GetReturns**](returns_api.md#GetReturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов
[**SetReturnDecision**](returns_api.md#SetReturnDecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision | Принятие или изменение решения по возврату
[**SubmitReturnDecision**](returns_api.md#SubmitReturnDecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit | Подтверждение решения по возврату


<a name="GetReturn"></a>
# **GetReturn**
> GetReturnResponse GetReturn(campaignId, orderId, returnId)

Информация о невыкупе или возврате

Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
<a name="GetReturnApplication"></a>
# **GetReturnApplication**
> String! GetReturnApplication(campaignId, orderId, returnId)

Получение заявления на возврат

Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
<a name="GetReturnPhoto"></a>
# **GetReturnPhoto**
> String! GetReturnPhoto(campaignId, orderId, returnId, itemId, imageHash)

Получение фотографии возврата

Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
<a name="GetReturns"></a>
# **GetReturns**
> GetReturnsResponse GetReturns(campaignId, pageToken, limit, orderIds, statuses, Type_, fromDate, toDate, fromDate2, toDate2)

Список невыкупов и возвратов

Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
<a name="SetReturnDecision"></a>
# **SetReturnDecision**
> EmptyApiResponse SetReturnDecision(campaignId, orderId, returnId, setReturnDecisionRequest)

Принятие или изменение решения по возврату

Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
<a name="SubmitReturnDecision"></a>
# **SubmitReturnDecision**
> EmptyApiResponse SubmitReturnDecision(campaignId, orderId, returnId)

Подтверждение решения по возврату

Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
