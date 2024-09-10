
package org.openapitools.client.model


case class UpdateOfferMappingsRequest (
    /* Перечень товаров, которые нужно добавить или обновить. */
    _offerMappings: List[UpdateOfferMappingDTO],
    /* Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — `false`. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение `true`.  */
    _onlyPartnerMediaContent: Option[Boolean]
)
object UpdateOfferMappingsRequest {
    def toStringBody(var_offerMappings: Object, var_onlyPartnerMediaContent: Object) =
        s"""
        | {
        | "offerMappings":$var_offerMappings,"onlyPartnerMediaContent":$var_onlyPartnerMediaContent
        | }
        """.stripMargin
}
