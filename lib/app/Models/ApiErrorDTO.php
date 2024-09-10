<?php
/**
 * ApiErrorDTO
 */
namespace app\Models;

/**
 * ApiErrorDTO
 * @description Общий формат ошибки.
 */
class ApiErrorDTO {

    /** @var string $code Код ошибки.*/
    public $code = "";

    /** @var string $message Описание ошибки.*/
    public $message = "";

}
