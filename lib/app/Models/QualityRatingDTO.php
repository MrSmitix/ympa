<?php
/**
 * QualityRatingDTO
 */
namespace app\Models;

/**
 * QualityRatingDTO
 * @description Информация об индексе качества.
 */
class QualityRatingDTO {

    /** @var int $rating Значение индекса качества.*/
    public $rating = 0;

    /** @var \DateTime $calculationDate Дата вычисления.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.*/
    public $calculationDate;

    /** @var \app\Models\QualityRatingComponentDTO[] $components Составляющие индекса качества.*/
    public $components = [];

}
