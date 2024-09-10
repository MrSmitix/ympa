<?php
/**
 * GenerateBoostConsolidatedRequest
 */
namespace app\Models;

/**
 * GenerateBoostConsolidatedRequest
 * @description Данные, необходимые для генерации отчета.
 */
class GenerateBoostConsolidatedRequest {

    /** @var int $businessId Идентификатор бизнеса.*/
    public $businessId = 0;

    /** @var \DateTime $dateFrom Начало периода, включительно.*/
    public $dateFrom;

    /** @var \DateTime $dateTo Конец периода, включительно.*/
    public $dateTo;

}
