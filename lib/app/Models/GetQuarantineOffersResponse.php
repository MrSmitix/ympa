<?php
/**
 * GetQuarantineOffersResponse
 */
namespace app\Models;

/**
 * GetQuarantineOffersResponse
 * @description Ответ на запрос списка товаров в карантине.
 */
class GetQuarantineOffersResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\GetQuarantineOffersResultDTO $result */
    public $result;

}
