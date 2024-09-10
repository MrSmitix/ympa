<?php
/**
 * ApiUnauthorizedErrorResponse
 */
namespace app\Models;

/**
 * ApiUnauthorizedErrorResponse
 * @description В запросе не указаны авторизационные данные.
 */
class ApiUnauthorizedErrorResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\ApiErrorDTO[]|null $errors Список ошибок.*/
    public $errors = null;

}
