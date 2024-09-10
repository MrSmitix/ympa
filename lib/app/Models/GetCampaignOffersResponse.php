<?php
/**
 * GetCampaignOffersResponse
 */
namespace app\Models;

/**
 * GetCampaignOffersResponse
 * @description Ответ на запрос списка товаров в магазине.
 */
class GetCampaignOffersResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\GetCampaignOffersResultDTO $result */
    public $result;

}
