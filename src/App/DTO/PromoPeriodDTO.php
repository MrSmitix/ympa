<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Время проведения акции.
 */
class PromoPeriodDTO
{
    /**
     * Дата и время начала акции.
     * @DTA\Data(field="dateTimeFrom")
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $date_time_from;

    /**
     * Дата и время окончания акции.
     * @DTA\Data(field="dateTimeTo")
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $date_time_to;

}
