<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for downloadShipmentReceptionTransferAct
 */
class DownloadShipmentReceptionTransferActQueryData
{
    /**
     * Идентификатор склада.
     * @DTA\Data(field="warehouse_id", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"int"})
     * @var int|null
     */
    public $warehouse_id;

}
