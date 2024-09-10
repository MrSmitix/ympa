<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for getOutletLicenses
 */
class GetOutletLicensesQueryData
{
    /**
     * Список идентификаторов точек продаж, для которых нужно получить информацию о лицензиях. Идентификаторы указываются через запятую.  В запросе должен быть либо параметр &#x60;outletIds&#x60;, либо параметр &#x60;ids&#x60;. Запрос с обоими параметрами или без них приведет к ошибке.
     * @DTA\Data(field="outletIds", nullable=true)
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"int", "format":"csv"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"int", "format":"csv"})
     * @var int[]|null
     */
    public $outlet_ids;

    /**
     * Список идентификаторов лицензий.
     * @DTA\Data(field="ids", nullable=true)
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"int", "format":"csv"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"int", "format":"csv"})
     * @var int[]|null
     */
    public $ids;

}
