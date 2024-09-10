<?php
/**
 * GetHiddenOffersResponse
 */
namespace app\Models;

/**
 * GetHiddenOffersResponse
 * @description Ответ на запрос списка скрытий.
 */
class GetHiddenOffersResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\GetHiddenOffersResultDTO $result */
    public $result;

}
