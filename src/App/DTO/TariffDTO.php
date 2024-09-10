<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о тарифах, по которым нужно заплатить за услуги Маркета.
 */
class TariffDTO
{
    /**
     * @DTA\Data(field="type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TariffType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TariffType::class})
     * @var \App\DTO\TariffType|null
     */
    public $type;

    /**
     * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах.
     * @DTA\Data(field="percent", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $percent;

    /**
     * Значение тарифа в рублях.
     * @DTA\Data(field="amount")
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
