# categories_api

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCategoriesMaxSaleQuantum**](categories_api.md#GetCategoriesMaxSaleQuantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
[**GetCategoriesTree**](categories_api.md#GetCategoriesTree) | **POST** /categories/tree | Дерево категорий


<a name="GetCategoriesMaxSaleQuantum"></a>
# **GetCategoriesMaxSaleQuantum**
> GetCategoriesMaxSaleQuantumResponse GetCategoriesMaxSaleQuantum(getCategoriesMaxSaleQuantumRequest)

Лимит на установку кванта продажи и минимального количества товаров в заказе

Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
<a name="GetCategoriesTree"></a>
# **GetCategoriesTree**
> GetCategoriesResponse GetCategoriesTree(getCategoriesRequest)

Дерево категорий

Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
