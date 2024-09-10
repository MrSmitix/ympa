
package org.openapitools.client.model


case class OrderItemPromoDTO (
    _type: OrderPromoType,
    /* Размер пользовательской скидки в валюте покупателя.  */
    _discount: Option[Number],
    /* Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа.  */
    _subsidy: Option[Number],
    /* Идентификатор акции поставщика.  */
    _shopPromoId: Option[String],
    /* Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр `type=MARKET_DEAL`.  */
    _marketPromoId: Option[String]
)
object OrderItemPromoDTO {
    def toStringBody(var_type: Object, var_discount: Object, var_subsidy: Object, var_shopPromoId: Object, var_marketPromoId: Object) =
        s"""
        | {
        | "type":$var_type,"discount":$var_discount,"subsidy":$var_subsidy,"shopPromoId":$var_shopPromoId,"marketPromoId":$var_marketPromoId
        | }
        """.stripMargin
}
