<?php
/**
 * GetQuarantineOffersRequest
 */
namespace app\Models;

/**
 * GetQuarantineOffersRequest
 * @description Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке.
 */
class GetQuarantineOffersRequest {

    /** @var string[]|null $offerIds Идентификаторы товаров, информация о которых нужна. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.*/
    public $offerIds = null;

    /** @var \app\Models\OfferCardStatusType[]|null $cardStatuses Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)*/
    public $cardStatuses = null;

    /** @var int[]|null $categoryIds Фильтр по категориям на Маркете.*/
    public $categoryIds = null;

    /** @var string[]|null $vendorNames Фильтр по брендам.*/
    public $vendorNames = null;

    /** @var string[]|null $tags Фильтр по тегам.*/
    public $tags = null;

}
