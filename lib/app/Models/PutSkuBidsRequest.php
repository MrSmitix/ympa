<?php
/**
 * PutSkuBidsRequest
 */
namespace app\Models;

/**
 * PutSkuBidsRequest
 * @description description.
 */
class PutSkuBidsRequest {

    /** @var \app\Models\SkuBidItemDTO[] $bids Список товаров и ставки для продвижения, которые на них нужно установить.*/
    public $bids = [];

}
