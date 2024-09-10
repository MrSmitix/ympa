<?php
/**
 * GetPricesResponse
 */
namespace app\Models;

/**
 * GetPricesResponse
 * @description Ответ на запрос списка цен.
 */
class GetPricesResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\OfferPriceListResponseDTO $result */
    public $result;

}
