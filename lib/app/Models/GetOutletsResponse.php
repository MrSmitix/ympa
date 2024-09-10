<?php
/**
 * GetOutletsResponse
 */
namespace app\Models;

/**
 * GetOutletsResponse
 * @description Ответ на запрос информации о точках продаж.
 */
class GetOutletsResponse {

    /** @var \app\Models\FullOutletDTO[] $outlets Информация о точках продаж.*/
    public $outlets = [];

    /** @var \app\Models\ScrollingPagerDTO $paging */
    public $paging;

    /** @var \app\Models\FlippingPagerDTO $pager */
    public $pager;

}
