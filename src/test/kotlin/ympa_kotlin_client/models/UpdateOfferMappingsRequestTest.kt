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

import ympa_kotlin_client.models.UpdateOfferMappingsRequest
import ympa_kotlin_client.models.UpdateOfferMappingDTO

class UpdateOfferMappingsRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of UpdateOfferMappingsRequest
        //val modelInstance = UpdateOfferMappingsRequest()

        // to test the property `offerMappings` - Перечень товаров, которые нужно добавить или обновить.
        should("test offerMappings") {
            // uncomment below to test the property
            //modelInstance.offerMappings shouldBe ("TODO")
        }

        // to test the property `onlyPartnerMediaContent` - Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — `false`. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение `true`. 
        should("test onlyPartnerMediaContent") {
            // uncomment below to test the property
            //modelInstance.onlyPartnerMediaContent shouldBe ("TODO")
        }

    }
}
