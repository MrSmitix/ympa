<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class GetOfferCardsContentStatusRequest
{
    /**
     * Идентификаторы товаров, информация о которых нужна. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.
     * @DTA\Data(field="offerIds", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection111::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection111::class})
     * @var \App\DTO\Collection111|null
     */
    public $offer_ids;

    /**
     * Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)
     * @DTA\Data(field="cardStatuses", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection112::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection112::class})
     * @var \App\DTO\Collection112|null
     */
    public $card_statuses;

    /**
     * Фильтр по категориям на Маркете.
     * @DTA\Data(field="categoryIds", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection113::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection113::class})
     * @var \App\DTO\Collection113|null
     */
    public $category_ids;

}
