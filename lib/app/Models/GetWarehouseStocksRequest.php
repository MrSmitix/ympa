<?php
/**
 * GetWarehouseStocksRequest
 */
namespace app\Models;

/**
 * GetWarehouseStocksRequest
 * @description Фильтры для запроса остатков.
 */
class GetWarehouseStocksRequest {

    /** @var bool $withTurnover **Только для модели FBY**  Возвращать ли информацию по оборачиваемости.  Значение по умолчанию — &#x60;false&#x60;. Если информация нужна, передайте значение &#x60;true&#x60;.*/
    public $withTurnover = false;

    /** @var bool $archived Фильтр по нахождению в архиве.  Передайте &#x60;true&#x60;, чтобы получить информацию об остатках товаров, которые находятся в архиве. Если фильтр не заполнен или передано &#x60;false&#x60;, в ответе возвращается информация о товарах, которые не находятся в архиве.*/
    public $archived = false;

    /** @var string[]|null $offerIds Фильтр по вашим SKU товаров.  Возвращается информация об остатках всех переданных SKU, включая товары в архиве.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60; * &#x60;archived&#x60;  {% endnote %}   */
    public $offerIds = null;

}
