<?php
/**
 * OrderBusinessBuyerDTO
 */
namespace app\Models;

/**
 * OrderBusinessBuyerDTO
 * @description Информация о покупателе.
 */
class OrderBusinessBuyerDTO {

    /** @var string $inn ИНН.*/
    public $inn = "";

    /** @var string $kpp КПП.*/
    public $kpp = "";

    /** @var string $organizationName Наименование юридического лица.*/
    public $organizationName = "";

    /** @var string $organizationJurAddress Юридический адрес.*/
    public $organizationJurAddress = "";

}
