<?php
/**
 * GenerateShelfsStatisticsRequest
 */
namespace app\Models;

/**
 * GenerateShelfsStatisticsRequest
 * @description Данные, необходимые для генерации отчета.
 */
class GenerateShelfsStatisticsRequest {

    /** @var int $businessId Идентификатор бизнеса.*/
    public $businessId = 0;

    /** @var \DateTime $dateFrom Начало периода, включительно.*/
    public $dateFrom;

    /** @var \DateTime $dateTo Конец периода, включительно.*/
    public $dateTo;

    /** @var string $attributionType */
    public $attributionType = "";

}
