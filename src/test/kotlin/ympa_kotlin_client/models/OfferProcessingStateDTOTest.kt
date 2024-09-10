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

import ympa_kotlin_client.models.OfferProcessingStateDTO
import ympa_kotlin_client.models.OfferProcessingNoteDTO
import ympa_kotlin_client.models.OfferProcessingStatusType

class OfferProcessingStateDTOTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of OfferProcessingStateDTO
        //val modelInstance = OfferProcessingStateDTO()

        // to test the property `status`
        should("test status") {
            // uncomment below to test the property
            //modelInstance.status shouldBe ("TODO")
        }

        // to test the property `notes` - Причины, по которым товар не прошел модерацию.
        should("test notes") {
            // uncomment below to test the property
            //modelInstance.notes shouldBe ("TODO")
        }

    }
}
