<?php
/**
 * OrderBoxLayoutPartialCountDTO
 */
namespace app\Models;

/**
 * OrderBoxLayoutPartialCountDTO
 * @description Информация о части товара в коробке.
 */
class OrderBoxLayoutPartialCountDTO {

    /** @var int $current Номер части, начиная с 1.*/
    public $current = 0;

    /** @var int $total На сколько всего частей разделен товар.*/
    public $total = 0;

}
