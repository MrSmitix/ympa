<?php
/**
 * DeleteOffersResponse
 */
namespace app\Models;

/**
 * DeleteOffersResponse
 * @description Результат удаления товаров.
 */
class DeleteOffersResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\DeleteOffersDTO $result */
    public $result;

}
