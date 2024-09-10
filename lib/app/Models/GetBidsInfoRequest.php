<?php
/**
 * GetBidsInfoRequest
 */
namespace app\Models;

/**
 * GetBidsInfoRequest
 * @description description.
 */
class GetBidsInfoRequest {

    /** @var string[]|null $skus Список товаров, для которых нужно получить значения ставок.  Если список не задан, постранично возвращаются все товары со ставками.  Если список задан, результаты возвращаются одной страницей, а параметры &#x60;page_token&#x60; и &#x60;limit&#x60; игнорируются.*/
    public $skus = null;

}
