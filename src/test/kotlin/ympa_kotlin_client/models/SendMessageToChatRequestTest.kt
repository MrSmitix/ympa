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

import ympa_kotlin_client.models.SendMessageToChatRequest

class SendMessageToChatRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of SendMessageToChatRequest
        //val modelInstance = SendMessageToChatRequest()

        // to test the property `message` - Текст сообщения. Максимальная длина — 4096 символа.
        should("test message") {
            // uncomment below to test the property
            //modelInstance.message shouldBe ("TODO")
        }

    }
}
