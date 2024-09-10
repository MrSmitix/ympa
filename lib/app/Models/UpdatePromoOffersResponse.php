<?php
/**
 * UpdatePromoOffersResponse
 */
namespace app\Models;

/**
 * UpdatePromoOffersResponse
 * @description Результат добавления товаров в акцию.
 */
class UpdatePromoOffersResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\UpdatePromoOffersResultDTO $result */
    public $result;

}
