<?php
/**
 * ApiLockedErrorResponse
 */
namespace app\Models;

/**
 * ApiLockedErrorResponse
 * @description Ресурс из запроса заблокирован от применения к нему указанного метода.
 */
class ApiLockedErrorResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\ApiErrorDTO[]|null $errors Список ошибок.*/
    public $errors = null;

}
