<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Данные, необходимые для генерации документа.
 */
class GenerateShipmentListDocumentReportRequest
{
    /**
     * Идентификатор кампании.
     * @DTA\Data(field="campaignId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $campaign_id = null;

    /**
     * Идентификатор отгрузки.
     * @DTA\Data(field="shipmentId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $shipment_id = null;

    /**
     * Фильтр по идентификаторам заказа в отгрузке.
     * @DTA\Data(field="orderIds", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection86::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection86::class})
     */
    public ?\App\DTO\Collection86 $order_ids = null;

}
