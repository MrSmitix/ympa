# promos_api

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeletePromoOffers**](promos_api.md#DeletePromoOffers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
[**GetPromoOffers**](promos_api.md#GetPromoOffers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
[**GetPromos**](promos_api.md#GetPromos) | **POST** /businesses/{businessId}/promos | Получение списка акций
[**UpdatePromoOffers**](promos_api.md#UpdatePromoOffers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен


<a name="DeletePromoOffers"></a>
# **DeletePromoOffers**
> DeletePromoOffersResponse DeletePromoOffers(businessId, deletePromoOffersRequest)

Удаление товаров из акции

Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
<a name="GetPromoOffers"></a>
# **GetPromoOffers**
> GetPromoOffersResponse GetPromoOffers(businessId, getPromoOffersRequest, pageToken, limit)

Получение списка товаров, которые участвуют или могут участвовать в акции

Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре &#x60;limit&#x60; не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-| 
<a name="GetPromos"></a>
# **GetPromos**
> GetPromosResponse GetPromos(businessId, getPromosRequest)

Получение списка акций

Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр &#x60;participation&#x60;.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
<a name="UpdatePromoOffers"></a>
# **UpdatePromoOffers**
> UpdatePromoOffersResponse UpdatePromoOffers(businessId, updatePromoOffersRequest)

Добавление товаров в акцию или изменение их цен

Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
