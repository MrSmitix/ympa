<?php
/**
 * OrderParcelBoxDTO
 */
namespace app\Models;

/**
 * OrderParcelBoxDTO
 * @description Информация о грузоместе.
 */
class OrderParcelBoxDTO {

    /** @var int $id Идентификатор грузоместа.*/
    public $id = 0;

    /** @var string $fulfilmentId Идентификатор грузового места в информационной системе магазина.*/
    public $fulfilmentId = "";

}
