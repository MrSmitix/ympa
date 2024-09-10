<?php
/**
 * OrderBuyerBasicInfoDTO
 */
namespace app\Models;

/**
 * OrderBuyerBasicInfoDTO
 * @description Информация о покупателе с базовыми полями.
 */
class OrderBuyerBasicInfoDTO {

    /** @var string $id Идентификатор покупателя.*/
    public $id = "";

    /** @var string $lastName Фамилия покупателя.*/
    public $lastName = "";

    /** @var string $firstName Имя покупателя.*/
    public $firstName = "";

    /** @var string $middleName Отчество покупателя.*/
    public $middleName = "";

    /** @var string $type */
    public $type = "";

}
