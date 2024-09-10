<?php
/**
 * OfferMappingErrorDTO
 */
namespace app\Models;

/**
 * OfferMappingErrorDTO
 * @description Текст ошибки.
 */
class OfferMappingErrorDTO {

    /** @var string $type */
    public $type = "";

    /** @var int $parameterId Идентификатор характеристики, с которой связана ошибка.*/
    public $parameterId = 0;

    /** @var string $message Текст ошибки.*/
    public $message = "";

}
