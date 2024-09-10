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
     */
    public ?string $inn = null;

    /**
     * КПП.
     * @DTA\Data(field="kpp", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $kpp = null;

    /**
     * Наименование юридического лица.
     * @DTA\Data(field="organizationName", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $organization_name = null;

    /**
     * Юридический адрес.
     * @DTA\Data(field="organizationJurAddress", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $organization_jur_address = null;

}
