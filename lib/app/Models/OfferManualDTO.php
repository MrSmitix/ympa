<?php
/**
 * OfferManualDTO
 */
namespace app\Models;

/**
 * OfferManualDTO
 * @description Инструкция по использованию товара.
 */
class OfferManualDTO {

    /** @var string $url Ссылка на инструкцию.*/
    public $url = "";

    /** @var string $title Название инструкции, которое будет отображаться на карточке товара.*/
    public $title = "";

}
