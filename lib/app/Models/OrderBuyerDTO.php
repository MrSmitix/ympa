<?php
/**
 * OrderBuyerDTO
 */
namespace app\Models;

/**
 * OrderBuyerDTO
 * @description Информация о покупателе.  Параметры `id`, `lastName`, `firstName` и `middleName` возвращаются, только если вы работаете по модели DBS.
 */
class OrderBuyerDTO {

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
