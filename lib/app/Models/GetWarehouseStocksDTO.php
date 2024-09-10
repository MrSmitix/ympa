<?php
/**
 * GetWarehouseStocksDTO
 */
namespace app\Models;

/**
 * GetWarehouseStocksDTO
 * @description Список складов с информацией об остатках на каждом из них.
 */
class GetWarehouseStocksDTO {

    /** @var \app\Models\ScrollingPagerDTO $paging */
    public $paging;

    /** @var \app\Models\WarehouseOffersDTO[] $warehouses Страница списка складов.*/
    public $warehouses = [];

}
