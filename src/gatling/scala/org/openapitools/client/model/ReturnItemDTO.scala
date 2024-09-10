
package org.openapitools.client.model


case class ReturnItemDTO (
    /* SKU на Маркете. */
    _marketSku: Option[Long],
    /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    _shopSku: String,
    /* Количество единиц товара. */
    _count: Long,
    /* Список решений по возврату. */
    _decisions: Option[List[ReturnDecisionDTO]],
    /* Список логистических позиций возврата. */
    _instances: Option[List[ReturnInstanceDTO]],
    /* Список трек-кодов для почтовых отправлений. */
    _tracks: Option[List[TrackDTO]]
)
object ReturnItemDTO {
    def toStringBody(var_marketSku: Object, var_shopSku: Object, var_count: Object, var_decisions: Object, var_instances: Object, var_tracks: Object) =
        s"""
        | {
        | "marketSku":$var_marketSku,"shopSku":$var_shopSku,"count":$var_count,"decisions":$var_decisions,"instances":$var_instances,"tracks":$var_tracks
        | }
        """.stripMargin
}
