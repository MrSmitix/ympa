<?php
/**
 * CreateOutletResponse
 */
namespace app\Models;

/**
 * CreateOutletResponse
 * @description Ответ на запрос о создании точки продаж.
 */
class CreateOutletResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\OutletResponseDTO $result */
    public $result;

}
