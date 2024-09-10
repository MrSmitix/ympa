<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке.
 */
class GetQuarantineOffersRequest
{
    /**
     * Идентификаторы товаров, информация о которых нужна. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.
     * @DTA\Data(field="offerIds", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection60::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection60::class})
     * @var \App\DTO\Collection60|null
     */
    public $offer_ids;

    /**
     * Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)
     * @DTA\Data(field="cardStatuses", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection61::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection61::class})
     * @var \App\DTO\Collection61|null
     */
    public $card_statuses;

    /**
     * Фильтр по категориям на Маркете.
     * @DTA\Data(field="categoryIds", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection62::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection62::class})
     * @var \App\DTO\Collection62|null
     */
    public $category_ids;

    /**
     * Фильтр по брендам.
     * @DTA\Data(field="vendorNames", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection63::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection63::class})
     * @var \App\DTO\Collection63|null
     */
    public $vendor_names;

    /**
     * Фильтр по тегам.
     * @DTA\Data(field="tags", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection64::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection64::class})
     * @var \App\DTO\Collection64|null
     */
    public $tags;

}
