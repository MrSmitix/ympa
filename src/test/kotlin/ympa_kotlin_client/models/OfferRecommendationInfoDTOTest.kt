/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package ympa_kotlin_client.models

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import ympa_kotlin_client.models.OfferRecommendationInfoDTO
import ympa_kotlin_client.models.BasePriceDTO
import ympa_kotlin_client.models.PriceCompetitivenessThresholdsDTO

class OfferRecommendationInfoDTOTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of OfferRecommendationInfoDTO
        //val modelInstance = OfferRecommendationInfoDTO()

        // to test the property `offerId` - Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
        should("test offerId") {
            // uncomment below to test the property
            //modelInstance.offerId shouldBe ("TODO")
        }

        // to test the property `recommendedCofinancePrice`
        should("test recommendedCofinancePrice") {
            // uncomment below to test the property
            //modelInstance.recommendedCofinancePrice shouldBe ("TODO")
        }

        // to test the property `competitivenessThresholds`
        should("test competitivenessThresholds") {
            // uncomment below to test the property
            //modelInstance.competitivenessThresholds shouldBe ("TODO")
        }

    }
}
