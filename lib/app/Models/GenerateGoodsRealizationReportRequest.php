<?php
/**
 * GenerateGoodsRealizationReportRequest
 */
namespace app\Models;

/**
 * GenerateGoodsRealizationReportRequest
 * @description Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет.
 */
class GenerateGoodsRealizationReportRequest {

    /** @var int $campaignId Идентификатор кампании.*/
    public $campaignId = 0;

    /** @var int $year Год.*/
    public $year = 0;

    /** @var int $month Номер месяца.*/
    public $month = 0;

}
