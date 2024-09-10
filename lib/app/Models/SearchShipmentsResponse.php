<?php
/**
 * SearchShipmentsResponse
 */
namespace app\Models;

/**
 * SearchShipmentsResponse
 * @description Ответ на запрос информации об отгрузках.
 */
class SearchShipmentsResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\SearchShipmentsResponseDTO $result */
    public $result;

}
