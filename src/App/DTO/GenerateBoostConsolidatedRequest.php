<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Данные, необходимые для генерации отчета.
 */
class GenerateBoostConsolidatedRequest
{
    /**
     * Идентификатор бизнеса.
     * @DTA\Data(field="businessId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $business_id;

    /**
     * Начало периода, включительно.
     * @DTA\Data(field="dateFrom")
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     * @var \DateTime|null
     */
    public $date_from;

    /**
     * Конец периода, включительно.
     * @DTA\Data(field="dateTo")
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     * @var \DateTime|null
     */
    public $date_to;

}
