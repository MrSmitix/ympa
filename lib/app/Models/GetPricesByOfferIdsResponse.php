<?php
/**
 * GetPricesByOfferIdsResponse
 */
namespace app\Models;

/**
 * GetPricesByOfferIdsResponse
 * @description Ответ на запрос списка цен.
 */
class GetPricesByOfferIdsResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\OfferPriceByOfferIdsListResponseDTO $result */
    public $result;

}
