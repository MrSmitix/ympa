<?php
/**
 * SuggestPricesResponse
 */
namespace app\Models;

/**
 * SuggestPricesResponse
 * @description Ответ на запрос списка цен для продвижения.
 */
class SuggestPricesResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\SuggestPricesResultDTO $result */
    public $result;

}
