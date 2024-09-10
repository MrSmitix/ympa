<?php
/**
 * OfferPriceResponseDTO
 */
namespace app\Models;

/**
 * OfferPriceResponseDTO
 * @description Информация об установленной цене на товар.
 */
class OfferPriceResponseDTO {

    /** @var string $id Идентификатор предложения из прайс-листа.*/
    public $id = "";

    /** @var \app\Models\PriceDTO $price */
    public $price;

    /** @var int $marketSku SKU на Маркете.*/
    public $marketSku = 0;

    /** @var \DateTime $updatedAt Дата и время последнего обновления цены на товар.*/
    public $updatedAt;

}
