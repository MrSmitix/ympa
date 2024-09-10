<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Параметры для расчета стоимости услуг.
 */
class CalculateTariffsParametersDTO
{
    /**
     * Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр &#x60;campaignId&#x60;, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке.
     * @DTA\Data(field="campaignId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $campaign_id;

    /**
     * @DTA\Data(field="sellingProgram", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SellingProgramType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SellingProgramType::class})
     * @var \App\DTO\SellingProgramType|null
     */
    public $selling_program;

    /**
     * @DTA\Data(field="frequency", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PaymentFrequencyType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PaymentFrequencyType::class})
     * @var \App\DTO\PaymentFrequencyType|null
     */
    public $frequency;

}
