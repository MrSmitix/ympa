<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class GetOfferMappingsRequest
{
    /**
     * Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * &#x60;page_token&#x60;; * &#x60;limit&#x60;; * &#x60;cardStatuses&#x60;; * &#x60;categoryIds&#x60;; * &#x60;vendorNames&#x60;; * &#x60;tags&#x60;; * &#x60;archived&#x60;.  {% endnote %}   
     * @DTA\Data(field="offerIds", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection38::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection38::class})
     * @var \App\DTO\Collection38|null
     */
    public $offer_ids;

    /**
     * Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)
     * @DTA\Data(field="cardStatuses", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection39::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection39::class})
     * @var \App\DTO\Collection39|null
     */
    public $card_statuses;

    /**
     * Фильтр по категориям на Маркете.
     * @DTA\Data(field="categoryIds", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection40::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection40::class})
     * @var \App\DTO\Collection40|null
     */
    public $category_ids;

    /**
     * Фильтр по брендам.
     * @DTA\Data(field="vendorNames", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection41::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection41::class})
     * @var \App\DTO\Collection41|null
     */
    public $vendor_names;

    /**
     * Фильтр по тегам.
     * @DTA\Data(field="tags", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection42::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection42::class})
     * @var \App\DTO\Collection42|null
     */
    public $tags;

    /**
     * Фильтр по нахождению в архиве.  Передайте &#x60;true&#x60;, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано &#x60;false&#x60;, в ответе возвращаются товары, не находящиеся в архиве.
     * @DTA\Data(field="archived", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $archived;

}
