<?php
/**
 * GetOrderLabelsDataResponse
 */
namespace app\Models;

/**
 * GetOrderLabelsDataResponse
 * @description Ответ с информацией для печати ярлыков.
 */
class GetOrderLabelsDataResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\OrderLabelDTO $result */
    public $result;

}
