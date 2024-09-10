<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Список посылок.  В параметре может указываться несколько посылок.
 */
class OrderShipmentDTO
{
    /**
     * Идентификатор посылки, присвоенный Маркетом.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.
     * @DTA\Data(field="shipmentDate", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $shipment_date;

    /**
     * **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус &#x60;READY_TO_SHIP&#x60;. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки.
     * @DTA\Data(field="shipmentTime", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $shipment_time;

    /**
     * **Только для модели DBS**  Информация для отслеживания перемещений посылки.
     * @DTA\Data(field="tracks", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection15::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection15::class})
     * @var \App\DTO\Collection15|null
     */
    public $tracks;

    /**
     * Список грузовых мест.
     * @DTA\Data(field="boxes", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection16::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection16::class})
     * @var \App\DTO\Collection16|null
     */
    public $boxes;

}
