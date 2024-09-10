<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Результат выполнения запроса.
 */
class EacVerificationResultDTO
{
    /**
     * @DTA\Data(field="verificationResult", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EacVerificationStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EacVerificationStatusType::class})
     * @var \App\DTO\EacVerificationStatusType|null
     */
    public $verification_result;

    /**
     * Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится.
     * @DTA\Data(field="attemptsLeft", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $attempts_left;

}
