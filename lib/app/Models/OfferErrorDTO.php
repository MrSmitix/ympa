<?php
/**
 * OfferErrorDTO
 */
namespace app\Models;

/**
 * OfferErrorDTO
 * @description Сообщение об ошибке, связанной с размещением товара.
 */
class OfferErrorDTO {

    /** @var string $message Тип ошибки.*/
    public $message = "";

    /** @var string $comment Пояснение.*/
    public $comment = "";

}
