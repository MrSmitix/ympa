<?php
/**
 * LogisticPickupPointDTO
 */
namespace app\Models;

/**
 * LogisticPickupPointDTO
 * @description Описание пункта вывоза для возврата.
 */
class LogisticPickupPointDTO {

    /** @var int $id Идентификатор пункта вывоза.*/
    public $id = 0;

    /** @var string $name Название пункта вывоза.*/
    public $name = "";

    /** @var \app\Models\PickupAddressDTO $address */
    public $address;

    /** @var string $instruction Дополнительные инструкции к вывозу.*/
    public $instruction = "";

    /** @var string $type */
    public $type = "";

    /** @var int $logisticPartnerId Идентификатор логистического партнера, к которому относится логистическая точка.*/
    public $logisticPartnerId = 0;

}
