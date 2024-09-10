
package org.openapitools.client.model


case class CalculateTariffsOfferInfoDTO (
    _offer: CalculateTariffsOfferDTO,
    /* Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/).  */
    _tariffs: List[CalculatedTariffDTO]
)
object CalculateTariffsOfferInfoDTO {
    def toStringBody(var_offer: Object, var_tariffs: Object) =
        s"""
        | {
        | "offer":$var_offer,"tariffs":$var_tariffs
        | }
        """.stripMargin
}
