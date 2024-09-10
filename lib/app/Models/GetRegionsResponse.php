<?php
/**
 * GetRegionsResponse
 */
namespace app\Models;

/**
 * GetRegionsResponse
 */
class GetRegionsResponse {

    /** @var \app\Models\RegionDTO[] $regions Регион доставки.*/
    public $regions = [];

    /** @var \app\Models\ForwardScrollingPagerDTO $paging */
    public $paging;

}
