<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Составляющие индекса качества.  **Для модели DBS:** * &#x60;DBS_CANCELLATION_RATE&#x60; — доля отмененных товаров. * &#x60;DBS_LATE_DELIVERY_RATE&#x60; — доля заказов, доставленных после плановой даты.  **Для моделей FBS и Экспресс:** * &#x60;FBS_CANCELLATION_RATE&#x60; — доля отмененных товаров. * &#x60;FBS_LATE_SHIP_RATE&#x60; — доля не вовремя отгруженных заказов.  **Для модели FBY:** * &#x60;FBY_LATE_DELIVERY_RATE&#x60; — доля товаров, которые приехали на склад с опозданием. * &#x60;FBY_CANCELLATION_RATE&#x60; — доля отмененных или недоставленных товаров. * &#x60;FBY_DELIVERY_DIFF_RATE&#x60; — доля товаров, которые не прибыли вместе с поставкой или которые не приняли. * &#x60;FBY_LATE_EDITING_RATE&#x60; — доля товаров, которые поздно убрали из заявки.
 */
class QualityRatingComponentType
{
}