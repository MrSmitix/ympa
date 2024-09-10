
package org.openapitools.client.model


case class OrderShipmentDTO (
    /* Идентификатор посылки, присвоенный Маркетом. */
    _id: Option[Long],
    /* Формат даты: `ДД-ММ-ГГГГ`.  */
    _shipmentDate: Option[String],
    /* **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки.  */
    _shipmentTime: Option[String],
    /* **Только для модели DBS**  Информация для отслеживания перемещений посылки.  */
    _tracks: Option[List[OrderTrackDTO]],
    /* Список грузовых мест. */
    _boxes: Option[List[OrderParcelBoxDTO]]
)
object OrderShipmentDTO {
    def toStringBody(var_id: Object, var_shipmentDate: Object, var_shipmentTime: Object, var_tracks: Object, var_boxes: Object) =
        s"""
        | {
        | "id":$var_id,"shipmentDate":$var_shipmentDate,"shipmentTime":$var_shipmentTime,"tracks":$var_tracks,"boxes":$var_boxes
        | }
        """.stripMargin
}
