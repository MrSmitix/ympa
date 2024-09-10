<?php
/**
 * TurnoverDTO
 */
namespace app\Models;

/**
 * TurnoverDTO
 * @description Информация об оборачиваемости товара.
 */
class TurnoverDTO {

    /** @var string $turnover */
    public $turnover = "";

    /** @var float $turnoverDays Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html)*/
    public $turnoverDays = 0;

}
