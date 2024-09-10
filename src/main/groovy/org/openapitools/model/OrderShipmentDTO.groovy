package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OrderParcelBoxDTO;
import org.openapitools.model.OrderTrackDTO;

@Canonical
class OrderShipmentDTO {
    /* Идентификатор посылки, присвоенный Маркетом. */
    Long id
    /* Формат даты: `ДД-ММ-ГГГГ`.  */
    String shipmentDate
    /* **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки.  */
    String shipmentTime
    /* **Только для модели DBS**  Информация для отслеживания перемещений посылки.  */
    List<OrderTrackDTO> tracks
    /* Список грузовых мест. */
    List<OrderParcelBoxDTO> boxes
}
