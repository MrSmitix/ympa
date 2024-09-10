<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Период, за который рассчитывается итоговый список нерабочих дней службы доставки.
 */
class CampaignSettingsTimePeriodDTO
{
    /**
     * Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.
     * @DTA\Data(field="fromDate", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $from_date;

    /**
     * Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.
     * @DTA\Data(field="toDate", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $to_date;

}
