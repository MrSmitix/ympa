<?php
/**
 * GetCampaignOffersRequest
 */
namespace app\Models;

/**
 * GetCampaignOffersRequest
 * @description Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке.
 */
class GetCampaignOffersRequest {

    /** @var string[]|null $offerIds Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60;  {% endnote %}   */
    public $offerIds = null;

    /** @var \app\Models\OfferCampaignStatusType[]|null $statuses Фильтр по статусам товаров.*/
    public $statuses = null;

    /** @var int[]|null $categoryIds Фильтр по категориям на Маркете.*/
    public $categoryIds = null;

    /** @var string[]|null $vendorNames Фильтр по брендам.*/
    public $vendorNames = null;

    /** @var string[]|null $tags Фильтр по тегам.*/
    public $tags = null;

}
