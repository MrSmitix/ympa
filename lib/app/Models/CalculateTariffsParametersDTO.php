<?php
/**
 * CalculateTariffsParametersDTO
 */
namespace app\Models;

/**
 * CalculateTariffsParametersDTO
 * @description Параметры для расчета стоимости услуг.
 */
class CalculateTariffsParametersDTO {

    /** @var int $campaignId Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр &#x60;campaignId&#x60;, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке.*/
    public $campaignId = 0;

    /** @var string $sellingProgram */
    public $sellingProgram = "";

    /** @var string $frequency */
    public $frequency = "";

}
