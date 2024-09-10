<?php
/**
 * OfferContentErrorDTO
 */
namespace app\Models;

/**
 * OfferContentErrorDTO
 * @description Текст ошибки.
 */
class OfferContentErrorDTO {

    /** @var string $type */
    public $type = "";

    /** @var int $parameterId Идентификатор характеристики, с которой связана ошибка.*/
    public $parameterId = 0;

    /** @var string $message Текст ошибки.*/
    public $message = "";

}
