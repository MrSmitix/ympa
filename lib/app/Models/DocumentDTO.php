<?php
/**
 * DocumentDTO
 */
namespace app\Models;

/**
 * DocumentDTO
 * @description Информация о документе.
 */
class DocumentDTO {

    /** @var string $status */
    public $status = "";

    /** @var string $number Номер документа.*/
    public $number = "";

    /** @var \DateTime $date Дата создания документа.*/
    public $date;

}
