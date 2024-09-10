<?php
/**
 * OfferProcessingStateDTO
 */
namespace app\Models;

/**
 * OfferProcessingStateDTO
 * @description Информация о статусе публикации товара на Маркете.
 */
class OfferProcessingStateDTO {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\OfferProcessingNoteDTO[]|null $notes Причины, по которым товар не прошел модерацию.*/
    public $notes = null;

}
