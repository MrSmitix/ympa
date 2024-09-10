<?php
/**
 * PalletsCountDTO
 */
namespace app\Models;

/**
 * PalletsCountDTO
 * @description Количество палет в отгрузке.
 */
class PalletsCountDTO {

    /** @var int $planned Количество палет, которое заявил продавец.*/
    public $planned = 0;

    /** @var int $fact Количество палет, которое приняли в сортировочном центре.*/
    public $fact = 0;

}
