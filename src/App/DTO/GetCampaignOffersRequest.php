<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке.
 */
class GetCampaignOffersRequest
{
    /**
     * Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60;  {% endnote %}   
     * @DTA\Data(field="offerIds", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection96::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection96::class})
     * @var \App\DTO\Collection96|null
     */
    public $offer_ids;

    /**
     * Фильтр по статусам товаров.
     * @DTA\Data(field="statuses", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection97::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection97::class})
     * @var \App\DTO\Collection97|null
     */
    public $statuses;

    /**
     * Фильтр по категориям на Маркете.
     * @DTA\Data(field="categoryIds", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection98::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection98::class})
     * @var \App\DTO\Collection98|null
     */
    public $category_ids;

    /**
     * Фильтр по брендам.
     * @DTA\Data(field="vendorNames", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection99::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection99::class})
     * @var \App\DTO\Collection99|null
     */
    public $vendor_names;

    /**
     * Фильтр по тегам.
     * @DTA\Data(field="tags", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection100::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection100::class})
     * @var \App\DTO\Collection100|null
     */
    public $tags;

}
