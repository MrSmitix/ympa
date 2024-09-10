<?php
/**
 * UpdateOfferMappingsResponse
 */
namespace app\Models;

/**
 * UpdateOfferMappingsResponse
 * @description Описывает проблемы, возникшие при сохранении товара.
 */
class UpdateOfferMappingsResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\UpdateOfferMappingResultDTO[]|null $results Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается.*/
    public $results = null;

}
