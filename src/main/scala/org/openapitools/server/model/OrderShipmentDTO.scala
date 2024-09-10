package org.openapitools.server.model


/**
 * Список посылок.  В параметре может указываться несколько посылок. 
 *
 * @param id Идентификатор посылки, присвоенный Маркетом. for example: ''null''
 * @param shipmentDate Формат даты: `ДД-ММ-ГГГГ`.  for example: ''23-09-2022''
 * @param shipmentTime **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки.  for example: ''null''
 * @param tracks **Только для модели DBS**  Информация для отслеживания перемещений посылки.  for example: ''null''
 * @param boxes Список грузовых мест. for example: ''null''
*/
final case class OrderShipmentDTO (
  id: Option[Long] = None,
  shipmentDate: Option[String] = None,
  shipmentTime: Option[String] = None,
  tracks: Option[Seq[OrderTrackDTO]] = None,
  boxes: Option[Seq[OrderParcelBoxDTO]] = None
)

