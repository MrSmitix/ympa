# tariffs_api

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CalculateTariffs**](tariffs_api.md#CalculateTariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг


<a name="CalculateTariffs"></a>
# **CalculateTariffs**
> CalculateTariffsResponse CalculateTariffs(calculateTariffsRequest)

Калькулятор стоимости услуг

Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр &#x60;campaignId&#x60;, либо &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
