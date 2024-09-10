<?php
/**
 * TariffDTO
 */
namespace app\Models;

/**
 * TariffDTO
 * @description Информация о тарифах, по которым нужно заплатить за услуги Маркета.
 */
class TariffDTO {

    /** @var string $type */
    public $type = "";

    /** @var float $percent {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах.*/
    /** @deprecated */
    public $percent = 0;

    /** @var float $amount Значение тарифа в рублях.*/
    public $amount = 0;

    /** @var \app\Models\TariffParameterDTO[] $parameters Параметры расчета тарифа.*/
    public $parameters = [];

}
