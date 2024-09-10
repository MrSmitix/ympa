<?php
/**
 * GetOfferCardsContentStatusRequest
 */
namespace app\Models;

/**
 * GetOfferCardsContentStatusRequest
 */
class GetOfferCardsContentStatusRequest {

    /** @var string[]|null $offerIds Идентификаторы товаров, информация о которых нужна. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.*/
    public $offerIds = null;

    /** @var \app\Models\OfferCardStatusType[]|null $cardStatuses Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)*/
    public $cardStatuses = null;

    /** @var int[]|null $categoryIds Фильтр по категориям на Маркете.*/
    public $categoryIds = null;

}
