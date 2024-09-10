<?php
/**
 * GenerateReportResponse
 */
namespace app\Models;

/**
 * GenerateReportResponse
 * @description Ответ на запрос генерации отчета.
 */
class GenerateReportResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\GenerateReportDTO $result */
    public $result;

}
