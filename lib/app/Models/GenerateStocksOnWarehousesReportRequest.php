<?php
/**
 * GenerateStocksOnWarehousesReportRequest
 */
namespace app\Models;

/**
 * GenerateStocksOnWarehousesReportRequest
 * @description Данные, необходимые для генерации отчета.
 */
class GenerateStocksOnWarehousesReportRequest {

    /** @var int $campaignId Идентификатор магазина.*/
    public $campaignId = 0;

    /** @var int[]|null $warehouseIds Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).*/
    public $warehouseIds = null;

    /** @var \DateTime $reportDate Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.*/
    public $reportDate;

    /** @var int[]|null $categoryIds Фильтр по категориям на Маркете (кроме модели FBY).*/
    public $categoryIds = null;

    /** @var bool $hasStocks Фильтр по наличию остатков (кроме модели FBY).*/
    public $hasStocks = false;

}
