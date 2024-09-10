<?php
/**
 * GetBidsInfoResponseDTO
 */
namespace app\Models;

/**
 * GetBidsInfoResponseDTO
 * @description Список товаров с указанными ставками.
 */
class GetBidsInfoResponseDTO {

    /** @var \app\Models\SkuBidItemDTO[] $bids Страница списка товаров.*/
    public $bids = [];

    /** @var \app\Models\ForwardScrollingPagerDTO $paging */
    public $paging;

}
