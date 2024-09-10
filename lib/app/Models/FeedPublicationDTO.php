<?php
/**
 * FeedPublicationDTO
 */
namespace app\Models;

/**
 * FeedPublicationDTO
 * @description Информация о последней публикации предложений из прайс-листа на Маркете.
 */
class FeedPublicationDTO {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\FeedPublicationFullDTO $full */
    public $full;

    /** @var \app\Models\FeedPublicationPriceAndStockUpdateDTO $priceAndStockUpdate */
    public $priceAndStockUpdate;

}
