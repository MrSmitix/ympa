<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация об индексе качества.
 */
class QualityRatingDTO
{
    /**
     * Значение индекса качества.
     * @DTA\Data(field="rating")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":100, "inclusive":true})
     * @var int|null
     */
    public $rating;

    /**
     * Дата вычисления.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.
     * @DTA\Data(field="calculationDate")
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     * @var \DateTime|null
     */
    public $calculation_date;

    /**
     * Составляющие индекса качества.
     * @DTA\Data(field="components")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\QualityRatingComponentDTO[]|null
     */
    public $components;

}
