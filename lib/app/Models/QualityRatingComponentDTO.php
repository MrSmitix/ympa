<?php
/**
 * QualityRatingComponentDTO
 */
namespace app\Models;

/**
 * QualityRatingComponentDTO
 * @description Составляющая индекса качества.
 */
class QualityRatingComponentDTO {

    /** @var float $value Значение составляющей в процентах.*/
    public $value = 0;

    /** @var string $componentType */
    public $componentType = "";

}
