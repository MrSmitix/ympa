
package org.openapitools.client.model


case class PalletsCountDTO (
    /* Количество палет, которое заявил продавец. */
    _planned: Option[Integer],
    /* Количество палет, которое приняли в сортировочном центре. */
    _fact: Option[Integer]
)
object PalletsCountDTO {
    def toStringBody(var_planned: Object, var_fact: Object) =
        s"""
        | {
        | "planned":$var_planned,"fact":$var_fact
        | }
        """.stripMargin
}
