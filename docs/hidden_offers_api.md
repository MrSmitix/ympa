# hidden_offers_api

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddHiddenOffers**](hidden_offers_api.md#AddHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия
[**DeleteHiddenOffers**](hidden_offers_api.md#DeleteHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров
[**GetHiddenOffers**](hidden_offers_api.md#GetHiddenOffers) | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах


<a name="AddHiddenOffers"></a>
# **AddHiddenOffers**
> EmptyApiResponse AddHiddenOffers(campaignId, addHiddenOffersRequest)

Скрытие товаров и настройки скрытия

Скрывает товары магазина на Маркете.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
<a name="DeleteHiddenOffers"></a>
# **DeleteHiddenOffers**
> EmptyApiResponse DeleteHiddenOffers(campaignId, deleteHiddenOffersRequest)

Возобновление показа товаров

Возобновляет показ скрытых вами товаров магазина на Маркете.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
<a name="GetHiddenOffers"></a>
# **GetHiddenOffers**
> GetHiddenOffersResponse GetHiddenOffers(campaignId, offerId, pageToken, limit, offset, page, pageSize)

Информация о скрытых вами товарах

Возвращает список скрытых вами товаров для заданного магазина.  В списке будут товары, скрытые любым способом — по API, с помощью YML-фида, в кабинете и так далее.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
