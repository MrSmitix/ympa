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

import ympa_kotlin_client.models.ChatMessageDTO
import ympa_kotlin_client.models.ChatMessagePayloadDTO
import ympa_kotlin_client.models.ChatMessageSenderType

class ChatMessageDTOTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ChatMessageDTO
        //val modelInstance = ChatMessageDTO()

        // to test the property `messageId` - Идентификатор сообщения.
        should("test messageId") {
            // uncomment below to test the property
            //modelInstance.messageId shouldBe ("TODO")
        }

        // to test the property `createdAt` - Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
        should("test createdAt") {
            // uncomment below to test the property
            //modelInstance.createdAt shouldBe ("TODO")
        }

        // to test the property `sender`
        should("test sender") {
            // uncomment below to test the property
            //modelInstance.sender shouldBe ("TODO")
        }

        // to test the property `message` - Текст сообщения.  Необязательный параметр, если возвращается параметр `payload`. 
        should("test message") {
            // uncomment below to test the property
            //modelInstance.message shouldBe ("TODO")
        }

        // to test the property `payload` - Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр `message`. 
        should("test payload") {
            // uncomment below to test the property
            //modelInstance.payload shouldBe ("TODO")
        }

    }
}
