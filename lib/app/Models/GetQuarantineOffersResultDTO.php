<?php
/**
 * GetQuarantineOffersResultDTO
 */
namespace app\Models;

/**
 * GetQuarantineOffersResultDTO
 * @description Список товаров в карантине.
 */
class GetQuarantineOffersResultDTO {

    /** @var \app\Models\ScrollingPagerDTO $paging */
    public $paging;

    /** @var \app\Models\QuarantineOfferDTO[] $offers Страница списка товаров в карантине.*/
    public $offers = [];

}
