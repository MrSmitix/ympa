<?php
/**
 * CalculateTariffsRequest
 */
namespace app\Models;

/**
 * CalculateTariffsRequest
 */
class CalculateTariffsRequest {

    /** @var \app\Models\CalculateTariffsParametersDTO $parameters */
    public $parameters;

    /** @var \app\Models\CalculateTariffsOfferDTO[] $offers Товары, для которых нужно рассчитать стоимость услуг.*/
    public $offers = [];

}
