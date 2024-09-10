<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for deleteOutletLicenses
 */
class DeleteOutletLicensesQueryData
{
    /**
     * Список идентификаторов лицензий.
     * @DTA\Data(field="ids", nullable=true)
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"int", "format":"csv"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"int", "format":"csv"})
     * @var int[]|null
     */
    public $ids;

}
