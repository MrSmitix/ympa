<?php
/**
 * ReturnDTO
 */
namespace app\Models;

/**
 * ReturnDTO
 * @description Возврат заказа.
 */
class ReturnDTO {

    /** @var int $id Идентификатор возврата.*/
    public $id = 0;

    /** @var int $orderId Номер заказа.*/
    public $orderId = 0;

    /** @var \DateTime $creationDate Дата создания возврата клиентом.*/
    public $creationDate;

    /** @var \DateTime $updateDate Дата обновления возврата.*/
    public $updateDate;

    /** @var string $refundStatus */
    public $refundStatus = "";

    /** @var \app\Models\LogisticPickupPointDTO $logisticPickupPoint */
    public $logisticPickupPoint;

    /** @var string $shipmentRecipientType */
    public $shipmentRecipientType = "";

    /** @var string $shipmentStatus */
    public $shipmentStatus = "";

    /** @var int $refundAmount Сумма возврата.*/
    public $refundAmount = 0;

    /** @var \app\Models\ReturnItemDTO[] $items Список товаров в возврате.*/
    public $items = [];

    /** @var string $returnType */
    public $returnType = "";

    /** @var bool $fastReturn Используется ли опция **Быстрый возврат денег за дешевый брак**.*/
    public $fastReturn = false;

}
