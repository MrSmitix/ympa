<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация об услугах Маркета.
 */
class CalculatedTariffDTO
{
    /**
     * @DTA\Data(field="type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CalculatedTariffType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CalculatedTariffType::class})
     * @var \App\DTO\CalculatedTariffType|null
     */
    public $type;

    /**
     * Стоимость услуги в рублях.
     * @DTA\Data(field="amount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $amount;

    /**
     * Параметры расчета тарифа.
     * @DTA\Data(field="parameters")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\TariffParameterDTO[]|null
     */
    public $parameters;

}
