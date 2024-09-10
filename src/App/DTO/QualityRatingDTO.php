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
     * @DTA\Validator(name="Range", options={"min":0, "max":100})
     */
    public ?int $rating = null;

    /**
     * Дата вычисления.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.
     * @DTA\Data(field="calculationDate")
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     */
    public ?\DateTimeInterface $calculation_date = null;

    /**
     * Составляющие индекса качества.
     * @DTA\Data(field="components")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $components = null;

}
