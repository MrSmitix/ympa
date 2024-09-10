<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Данные, необходимые для генерации отчета.
 */
class GenerateStocksOnWarehousesReportRequest
{
    /**
     * Идентификатор магазина.
     * @DTA\Data(field="campaignId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $campaign_id;

    /**
     * Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).
     * @DTA\Data(field="warehouseIds", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection84::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection84::class})
     * @var \App\DTO\Collection84|null
     */
    public $warehouse_ids;

    /**
     * Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.
     * @DTA\Data(field="reportDate", nullable=true)
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     * @var \DateTime|null
     */
    public $report_date;

    /**
     * Фильтр по категориям на Маркете (кроме модели FBY).
     * @DTA\Data(field="categoryIds", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection85::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection85::class})
     * @var \App\DTO\Collection85|null
     */
    public $category_ids;

    /**
     * Фильтр по наличию остатков (кроме модели FBY).
     * @DTA\Data(field="hasStocks", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $has_stocks;

}
