<?php
/**
 * OrderBusinessDocumentsDTO
 */
namespace app\Models;

/**
 * OrderBusinessDocumentsDTO
 * @description Информация о документах.
 */
class OrderBusinessDocumentsDTO {

    /** @var \app\Models\DocumentDTO $upd */
    public $upd;

    /** @var \app\Models\DocumentDTO $ukd */
    public $ukd;

    /** @var \app\Models\DocumentDTO $torgTwelve */
    public $torgTwelve;

    /** @var \app\Models\DocumentDTO $sf */
    public $sf;

    /** @var \app\Models\DocumentDTO $ksf */
    public $ksf;

}
