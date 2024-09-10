# content_api

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCategoryContentParameters**](content_api.md#GetCategoryContentParameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
[**GetOfferCardsContentStatus**](content_api.md#GetOfferCardsContentStatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
[**UpdateOfferContent**](content_api.md#UpdateOfferContent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара


<a name="GetCategoryContentParameters"></a>
# **GetCategoryContentParameters**
> GetCategoryContentParametersResponse GetCategoryContentParameters(categoryId)

Списки характеристик товаров по категориям

Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-| 
<a name="GetOfferCardsContentStatus"></a>
# **GetOfferCardsContentStatus**
> GetOfferCardsContentStatusResponse GetOfferCardsContentStatus(businessId, pageToken, limit, getOfferCardsContentStatusRequest)

Получение информации о заполненности карточек магазина

Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-| 
<a name="UpdateOfferContent"></a>
# **UpdateOfferContent**
> UpdateOfferContentResponse UpdateOfferContent(businessId, updateOfferContentRequest)

Редактирование категорийных характеристик товара

Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \&quot;Здесь только то, что относится к конкретной категории\&quot; %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом &#x60;string&#x60;, передайте пустое значение.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
