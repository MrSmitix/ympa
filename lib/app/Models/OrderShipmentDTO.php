<?php
/**
 * OrderShipmentDTO
 */
namespace app\Models;

/**
 * OrderShipmentDTO
 * @description Список посылок.  В параметре может указываться несколько посылок.
 */
class OrderShipmentDTO {

    /** @var int $id Идентификатор посылки, присвоенный Маркетом.*/
    public $id = 0;

    /** @var string $shipmentDate Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.*/
    public $shipmentDate = "";

    /** @var string $shipmentTime **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус &#x60;READY_TO_SHIP&#x60;. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки.*/
    public $shipmentTime = "";

    /** @var \app\Models\OrderTrackDTO[]|null $tracks **Только для модели DBS**  Информация для отслеживания перемещений посылки.*/
    public $tracks = null;

    /** @var \app\Models\OrderParcelBoxDTO[]|null $boxes Список грузовых мест.*/
    public $boxes = null;

}
