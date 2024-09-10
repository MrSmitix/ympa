
package org.openapitools.client.model


case class UpdateOfferMappingsResponse (
    _status: Option[ApiResponseStatusType],
    /* Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается.  */
    _results: Option[List[UpdateOfferMappingResultDTO]]
)
object UpdateOfferMappingsResponse {
    def toStringBody(var_status: Object, var_results: Object) =
        s"""
        | {
        | "status":$var_status,"results":$var_results
        | }
        """.stripMargin
}
