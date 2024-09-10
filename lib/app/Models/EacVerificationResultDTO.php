<?php
/**
 * EacVerificationResultDTO
 */
namespace app\Models;

/**
 * EacVerificationResultDTO
 * @description Результат выполнения запроса.
 */
class EacVerificationResultDTO {

    /** @var string $verificationResult */
    public $verificationResult = "";

    /** @var int $attemptsLeft Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится.*/
    public $attemptsLeft = 0;

}
