<?php
/**
 * GenerateCompetitorsPositionReportRequest
 */
namespace app\Models;

/**
 * GenerateCompetitorsPositionReportRequest
 * @description Данные, необходимые для генерации отчета.
 */
class GenerateCompetitorsPositionReportRequest {

    /** @var int $businessId Идентификатор бизнеса.*/
    public $businessId = 0;

    /** @var int $categoryId Идентификатор категории.*/
    public $categoryId = 0;

    /** @var \DateTime $dateFrom Начало периода, включительно.*/
    public $dateFrom;

    /** @var \DateTime $dateTo Конец периода, включительно.*/
    public $dateTo;

}
