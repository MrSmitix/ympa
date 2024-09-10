<?php
/**
 * PromoPeriodDTO
 */
namespace app\Models;

/**
 * PromoPeriodDTO
 * @description Время проведения акции.
 */
class PromoPeriodDTO {

    /** @var \DateTime $dateTimeFrom Дата и время начала акции.*/
    public $dateTimeFrom;

    /** @var \DateTime $dateTimeTo Дата и время окончания акции.*/
    public $dateTimeTo;

}
