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

import ympa_kotlin_client.models.OfferCardDTO
import ympa_kotlin_client.models.GetMappingDTO
import ympa_kotlin_client.models.OfferCardRecommendationDTO
import ympa_kotlin_client.models.OfferCardStatusType
import ympa_kotlin_client.models.OfferErrorDTO
import ympa_kotlin_client.models.ParameterValueDTO

class OfferCardDTOTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of OfferCardDTO
        //val modelInstance = OfferCardDTO()

        // to test the property `offerId` - Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
        should("test offerId") {
            // uncomment below to test the property
            //modelInstance.offerId shouldBe ("TODO")
        }

        // to test the property `mapping`
        should("test mapping") {
            // uncomment below to test the property
            //modelInstance.mapping shouldBe ("TODO")
        }

        // to test the property `parameterValues` - Список характеристик с их значениями. 
        should("test parameterValues") {
            // uncomment below to test the property
            //modelInstance.parameterValues shouldBe ("TODO")
        }

        // to test the property `cardStatus`
        should("test cardStatus") {
            // uncomment below to test the property
            //modelInstance.cardStatus shouldBe ("TODO")
        }

        // to test the property `contentRating` - Процент заполненности карточки.
        should("test contentRating") {
            // uncomment below to test the property
            //modelInstance.contentRating shouldBe ("TODO")
        }

        // to test the property `recommendations` - Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку. 
        should("test recommendations") {
            // uncomment below to test the property
            //modelInstance.recommendations shouldBe ("TODO")
        }

        // to test the property `errors` - Ошибки в контенте, препятствующие размещению товара на витрине.
        should("test errors") {
            // uncomment below to test the property
            //modelInstance.errors shouldBe ("TODO")
        }

        // to test the property `warnings` - Связанные с контентом предупреждения, не препятствующие размещению товара на витрине.
        should("test warnings") {
            // uncomment below to test the property
            //modelInstance.warnings shouldBe ("TODO")
        }

    }
}
