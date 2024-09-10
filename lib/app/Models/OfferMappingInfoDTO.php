<?php
/**
 * OfferMappingInfoDTO
 */
namespace app\Models;

/**
 * OfferMappingInfoDTO
 * @description Информация о карточке товара.
 */
class OfferMappingInfoDTO {

    /** @var \app\Models\OfferMappingDTO $mapping */
    public $mapping;

    /** @var \app\Models\OfferMappingDTO $awaitingModerationMapping */
    public $awaitingModerationMapping;

    /** @var \app\Models\OfferMappingDTO $rejectedMapping */
    public $rejectedMapping;

}
