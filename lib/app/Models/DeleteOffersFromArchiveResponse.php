<?php
/**
 * DeleteOffersFromArchiveResponse
 */
namespace app\Models;

/**
 * DeleteOffersFromArchiveResponse
 * @description Результат разархивации товаров.
 */
class DeleteOffersFromArchiveResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\DeleteOffersFromArchiveDTO $result */
    public $result;

}
