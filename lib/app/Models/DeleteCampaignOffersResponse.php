<?php
/**
 * DeleteCampaignOffersResponse
 */
namespace app\Models;

/**
 * DeleteCampaignOffersResponse
 * @description Результат удаления товаров.
 */
class DeleteCampaignOffersResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\DeleteCampaignOffersDTO $result */
    public $result;

}
