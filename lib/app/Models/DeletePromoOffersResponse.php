<?php
/**
 * DeletePromoOffersResponse
 */
namespace app\Models;

/**
 * DeletePromoOffersResponse
 * @description Результат удаления товаров из акции.
 */
class DeletePromoOffersResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\DeletePromoOffersResultDTO $result */
    public $result;

}
