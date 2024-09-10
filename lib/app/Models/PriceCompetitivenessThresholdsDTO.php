<?php
/**
 * PriceCompetitivenessThresholdsDTO
 */
namespace app\Models;

/**
 * PriceCompetitivenessThresholdsDTO
 * @description Максимальные значения цены, при которых она является привлекательной или умеренной.
 */
class PriceCompetitivenessThresholdsDTO {

    /** @var \app\Models\BasePriceDTO $optimalPrice */
    public $optimalPrice;

    /** @var \app\Models\BasePriceDTO $averagePrice */
    public $averagePrice;

}
