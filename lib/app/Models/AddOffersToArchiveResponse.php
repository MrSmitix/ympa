<?php
/**
 * AddOffersToArchiveResponse
 */
namespace app\Models;

/**
 * AddOffersToArchiveResponse
 * @description Результат архивации товаров.
 */
class AddOffersToArchiveResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\AddOffersToArchiveDTO $result */
    public $result;

}
