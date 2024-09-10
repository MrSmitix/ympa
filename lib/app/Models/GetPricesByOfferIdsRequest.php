<?php
/**
 * GetPricesByOfferIdsRequest
 */
namespace app\Models;

/**
 * GetPricesByOfferIdsRequest
 * @description Запрос списка цен.
 */
class GetPricesByOfferIdsRequest {

    /** @var string[]|null $offerIds Список SKU.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60;  {% endnote %}   */
    public $offerIds = null;

}
