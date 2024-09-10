
package org.openapitools.client.model


case class OfferManualDTO (
    /* Ссылка на инструкцию. */
    _url: String,
    /* Название инструкции, которое будет отображаться на карточке товара.  */
    _title: Option[String]
)
object OfferManualDTO {
    def toStringBody(var_url: Object, var_title: Object) =
        s"""
        | {
        | "url":$var_url,"title":$var_title
        | }
        """.stripMargin
}
