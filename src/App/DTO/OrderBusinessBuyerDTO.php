<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о покупателе.
 */
class OrderBusinessBuyerDTO
{
    /**
     * ИНН.
     * @DTA\Data(field="inn", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $inn;

    /**
     * КПП.
     * @DTA\Data(field="kpp", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $kpp;

    /**
     * Наименование юридического лица.
     * @DTA\Data(field="organizationName", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $organization_name;

    /**
     * Юридический адрес.
     * @DTA\Data(field="organizationJurAddress", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $organization_jur_address;

}
