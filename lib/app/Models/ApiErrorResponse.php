<?php
/**
 * ApiErrorResponse
 */
namespace app\Models;

/**
 * ApiErrorResponse
 * @description Стандартная обертка для ошибок сервера.
 */
class ApiErrorResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\ApiErrorDTO[]|null $errors Список ошибок.*/
    public $errors = null;

}
