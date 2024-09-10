<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет.
 */
class GenerateGoodsRealizationReportRequest
{
    /**
     * Идентификатор кампании.
     * @DTA\Data(field="campaignId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $campaign_id;

    /**
     * Год.
     * @DTA\Data(field="year")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $year;

    /**
     * Номер месяца.
     * @DTA\Data(field="month")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":1, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":12, "inclusive":true})
     * @var int|null
     */
    public $month;

}
