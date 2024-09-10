<?php
/**
 * PagedReturnsDTO
 */
namespace app\Models;

/**
 * PagedReturnsDTO
 * @description Возвраты.
 */
class PagedReturnsDTO {

    /** @var \app\Models\ForwardScrollingPagerDTO $paging */
    public $paging;

    /** @var \app\Models\ReturnDTO[] $returns Список возвратов.*/
    public $returns = [];

}
