<?php
/**
 * UpdateOfferContentResponse
 */
namespace app\Models;

/**
 * UpdateOfferContentResponse
 * @description Описывает проблемы, которые появились при сохранении товара.
 */
class UpdateOfferContentResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\UpdateOfferContentResultDTO[]|null $results Ошибки и предупреждения, которые появились при обработке переданных значений. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается.*/
    public $results = null;

}
