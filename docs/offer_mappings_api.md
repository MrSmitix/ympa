# offer_mappings_api

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetOfferMappingEntries**](offer_mappings_api.md#GetOfferMappingEntries) | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге
[**GetSuggestedOfferMappingEntries**](offer_mappings_api.md#GetSuggestedOfferMappingEntries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров
[**UpdateOfferMappingEntries**](offer_mappings_api.md#UpdateOfferMappingEntries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге


<a name="GetOfferMappingEntries"></a>
# **GetOfferMappingEntries**
> GetOfferMappingEntriesResponse GetOfferMappingEntries(campaignId, offerId, shopSku, mappingKind, status, availability, categoryId, vendor, pageToken, limit)

Список товаров в каталоге

{% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  Для каждого товара, который вы размещаете на Маркете, возвращается информация о карточках Маркета, к которым привязан этот товар:  * Идентификатор текущей карточки (marketSku), карточки, которая проходит модерацию и последней отклоненной карточки. * Описание товара, которое указано на карточке Маркета. Например, размер упаковки и вес товара.  Результаты возвращаются постранично. Выходные данные содержат идентификатор следующей страницы.  {% note info %}  Количество товаров в каталоге магазина считается по данным за последние семь дней (не включая сегодня).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лимит товаров — количество товаров в каталоге магазина * 25) 
<a name="GetSuggestedOfferMappingEntries"></a>
# **GetSuggestedOfferMappingEntries**
> GetSuggestedOfferMappingEntriesResponse GetSuggestedOfferMappingEntries(campaignId, getSuggestedOfferMappingEntriesRequest)

Рекомендованные карточки для товаров

{% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/suggestions](../../reference/business-assortment/getSuggestedOfferMappings.md).  {% endnote %}  Возвращает идентификаторы карточек товаров на Маркете, рекомендованных для ваших товаров.  Каждому товару, который вы размещаете, должна соответствовать карточка товара на Маркете со своим идентификатором — SKU на Маркете. Он указывается в URL карточки товара, после «...sku&#x3D;», например:  ##https://market.yandex.ru/product--yandex-kniga/484830016?sku&#x3D;484830016…##  Чтобы получить для товаров рекомендованные SKU на Маркете, передайте в теле POST-запроса как можно больше информации о них: названия, производителей, штрихкоды, цены и т. д.  Полученные SKU можно передать вместе с информацией о ваших товарах с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md).  В одном запросе можно получить не более 500 рекомендаций.  |**⚙️ Лимит:** 100 000 рекомендаций в час| |-| 
<a name="UpdateOfferMappingEntries"></a>
# **UpdateOfferMappingEntries**
> EmptyApiResponse UpdateOfferMappingEntries(campaignId, updateOfferMappingEntryRequest)

Добавление и редактирование товаров в каталоге

{% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Добавляет товары, указанные в запросе, в ваш каталог товаров и редактирует уже имеющиеся товары.  Информацию о товарах нужно передать в теле POST-запроса.  У каждого товара должен быть ваш SKU — уникальный код, который вы используете для идентификации товара:  * Чтобы добавить в каталог новый товар, укажите в параметре &#x60;shopSku&#x60; ваш SKU, которого еще нет в каталоге. * Чтобы отредактировать товар из каталога, укажите в параметре &#x60;shopSku&#x60; ваш SKU этого товара в каталоге.  В обоих случаях в запросе нужно передать полное описание товара, даже если вы хотите изменить только несколько характеристик.  Если вы знаете, какой карточке товара на Маркете соответствует ваш товар, укажите ее идентификатор (SKU на Маркете) во входном параметре mapping. Получить SKU на Маркете рекомендованной карточки товара можно с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/suggestions](../../reference/offer-mappings/getSuggestedOfferMappingEntries.md) или через кабинет. Если SKU на Маркете не указан, сотрудники Маркета сами подберут или создадут подходящую карточку товара, либо у него появится статус &#x60;NEED_CONTENT&#x60; (нужно найти карточку или создать ее самостоятельно) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).  Перед публикацией товары проходят модерацию. Если в одном из отправленных товаров найдена ошибка, ответ на запрос будет иметь HTTP-код 400 Bad Request, и ни один из товаров не отправится на модерацию. При этом если вы не передадите все обязательные параметры для какого‑либо товара, после модерации у него появится статус &#x60;NEED_INFO&#x60; (в описании товара не хватает информации) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).  В одном запросе можно добавить не более 500 товаров.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5 000 товаров в минуту| |-| 
