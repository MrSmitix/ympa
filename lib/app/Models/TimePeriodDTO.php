<?php
/**
 * TimePeriodDTO
 */
namespace app\Models;

/**
 * TimePeriodDTO
 * @description Временной отрезок с комментарием. Требования к содержанию комментария зависят от контекста использования параметра и указаны в описании поля, которое его содержит.
 */
class TimePeriodDTO {

    /** @var int $timePeriod Продолжительность в указанных единицах.*/
    public $timePeriod = 0;

    /** @var string $timeUnit */
    public $timeUnit = "";

    /** @var string $comment Комментарий.*/
    public $comment = "";

}
