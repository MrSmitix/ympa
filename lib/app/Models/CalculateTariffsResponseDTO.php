<?php
/**
 * CalculateTariffsResponseDTO
 */
namespace app\Models;

/**
 * CalculateTariffsResponseDTO
 * @description Расчет стоимости услуг.
 */
class CalculateTariffsResponseDTO {

    /** @var \app\Models\CalculateTariffsOfferInfoDTO[] $offers Стоимость услуг.*/
    public $offers = [];

}
