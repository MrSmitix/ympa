<?php
/**
 * OfferProcessingNoteDTO
 */
namespace app\Models;

/**
 * OfferProcessingNoteDTO
 * @description Причины, по которым товар не прошел модерацию.
 */
class OfferProcessingNoteDTO {

    /** @var string $type */
    public $type = "";

    /** @var string $payload Дополнительная информация о причине отклонения товара.*/
    public $payload = "";

}
