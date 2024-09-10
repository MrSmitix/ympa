
package org.openapitools.client.model

import java.time.OffsetDateTime

case class GetPromoBestsellerInfoDTO (
    /* Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers). */
    _bestseller: Boolean,
    /* До какой даты можно добавить товар в акцию «Бестселлеры Маркета».  Параметр возвращается только для текущих и будущих акций «Бестселлеры Маркета».  */
    _entryDeadline: Option[OffsetDateTime]
)
object GetPromoBestsellerInfoDTO {
    def toStringBody(var_bestseller: Object, var_entryDeadline: Object) =
        s"""
        | {
        | "bestseller":$var_bestseller,"entryDeadline":$var_entryDeadline
        | }
        """.stripMargin
}
