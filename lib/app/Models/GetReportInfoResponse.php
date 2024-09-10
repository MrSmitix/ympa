<?php
/**
 * GetReportInfoResponse
 */
namespace app\Models;

/**
 * GetReportInfoResponse
 * @description Ответ на запрос информации об отчете.
 */
class GetReportInfoResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\ReportInfoDTO $result */
    public $result;

}
