<?php
/**
 * CalculatedTariffDTO
 */
namespace app\Models;

/**
 * CalculatedTariffDTO
 * @description Информация об услугах Маркета.
 */
class CalculatedTariffDTO {

    /** @var string $type */
    public $type = "";

    /** @var float $amount Стоимость услуги в рублях.*/
    public $amount = 0;

    /** @var \app\Models\TariffParameterDTO[] $parameters Параметры расчета тарифа.*/
    public $parameters = [];

}
