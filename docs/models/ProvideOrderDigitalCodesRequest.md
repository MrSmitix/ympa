

# ProvideOrderDigitalCodesRequest

Запрос на передачу ключей цифровых товаров.

The class is defined in **[ProvideOrderDigitalCodesRequest.java](../../src/main/java/org/openapitools/model/ProvideOrderDigitalCodesRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [`List&lt;OrderDigitalItemDTO&gt;`](OrderDigitalItemDTO.md) | Список проданных ключей.  Если в заказе есть несколько **одинаковых** товаров (например, несколько ключей к одной и той же подписке), передайте каждый в виде отдельного элемента массива. &#x60;id&#x60; у этих элементов должен быть один и тот же.  | 



