<?php
/**
 * GetOfferMappingsRequest
 */
namespace app\Models;

/**
 * GetOfferMappingsRequest
 */
class GetOfferMappingsRequest {

    /** @var string[]|null $offerIds Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * &#x60;page_token&#x60;; * &#x60;limit&#x60;; * &#x60;cardStatuses&#x60;; * &#x60;categoryIds&#x60;; * &#x60;vendorNames&#x60;; * &#x60;tags&#x60;; * &#x60;archived&#x60;.  {% endnote %}   */
    public $offerIds = null;

    /** @var \app\Models\OfferCardStatusType[]|null $cardStatuses Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)*/
    public $cardStatuses = null;

    /** @var int[]|null $categoryIds Фильтр по категориям на Маркете.*/
    public $categoryIds = null;

    /** @var string[]|null $vendorNames Фильтр по брендам.*/
    public $vendorNames = null;

    /** @var string[]|null $tags Фильтр по тегам.*/
    public $tags = null;

    /** @var bool $archived Фильтр по нахождению в архиве.  Передайте &#x60;true&#x60;, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано &#x60;false&#x60;, в ответе возвращаются товары, не находящиеся в архиве.*/
    public $archived = false;

}
