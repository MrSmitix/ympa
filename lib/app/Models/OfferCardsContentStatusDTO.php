<?php
/**
 * OfferCardsContentStatusDTO
 */
namespace app\Models;

/**
 * OfferCardsContentStatusDTO
 * @description Список товаров с информацией о состоянии карточек.
 */
class OfferCardsContentStatusDTO {

    /** @var \app\Models\OfferCardDTO[] $offerCards Страница списка товаров с информацией о состоянии карточек.*/
    public $offerCards = [];

    /** @var \app\Models\ForwardScrollingPagerDTO $paging */
    public $paging;

}
