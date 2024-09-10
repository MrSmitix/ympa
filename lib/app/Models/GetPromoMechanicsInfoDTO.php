<?php
/**
 * GetPromoMechanicsInfoDTO
 */
namespace app\Models;

/**
 * GetPromoMechanicsInfoDTO
 * @description Информация о типе акции.
 */
class GetPromoMechanicsInfoDTO {

    /** @var string $type */
    public $type = "";

    /** @var \app\Models\GetPromoPromocodeInfoDTO $promocodeInfo */
    public $promocodeInfo;

}
