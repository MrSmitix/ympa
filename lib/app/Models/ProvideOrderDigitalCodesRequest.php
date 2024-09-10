<?php
/**
 * ProvideOrderDigitalCodesRequest
 */
namespace app\Models;

/**
 * ProvideOrderDigitalCodesRequest
 * @description Запрос на передачу ключей цифровых товаров.
 */
class ProvideOrderDigitalCodesRequest {

    /** @var \app\Models\OrderDigitalItemDTO[] $items Список проданных ключей.  Если в заказе есть несколько **одинаковых** товаров (например, несколько ключей к одной и той же подписке), передайте каждый в виде отдельного элемента массива. &#x60;id&#x60; у этих элементов должен быть один и тот же.*/
    public $items = [];

}
