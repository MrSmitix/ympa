<?php
/**
 * SearchShipmentsResponseDTO
 */
namespace app\Models;

/**
 * SearchShipmentsResponseDTO
 * @description Информация об отгрузках.
 */
class SearchShipmentsResponseDTO {

    /** @var \app\Models\ShipmentInfoDTO[] $shipments Список с информацией об отгрузках.*/
    public $shipments = [];

    /** @var \app\Models\ForwardScrollingPagerDTO $paging */
    public $paging;

}
