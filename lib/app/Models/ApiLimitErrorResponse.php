<?php
/**
 * ApiLimitErrorResponse
 */
namespace app\Models;

/**
 * ApiLimitErrorResponse
 * @description Превышено ограничение на доступ к ресурсу.
 */
class ApiLimitErrorResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\ApiErrorDTO[]|null $errors Список ошибок.*/
    public $errors = null;

}
