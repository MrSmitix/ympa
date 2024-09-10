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

package ympa_kotlin_client.apis

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import ympa_kotlin_client.apis.PriceQuarantineApi
import ympa_kotlin_client.models.ApiClientDataErrorResponse
import ympa_kotlin_client.models.ApiForbiddenErrorResponse
import ympa_kotlin_client.models.ApiLimitErrorResponse
import ympa_kotlin_client.models.ApiLockedErrorResponse
import ympa_kotlin_client.models.ApiNotFoundErrorResponse
import ympa_kotlin_client.models.ApiServerErrorResponse
import ympa_kotlin_client.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_client.models.ConfirmPricesRequest
import ympa_kotlin_client.models.EmptyApiResponse
import ympa_kotlin_client.models.GetQuarantineOffersRequest
import ympa_kotlin_client.models.GetQuarantineOffersResponse

class PriceQuarantineApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of PriceQuarantineApi
        //val apiInstance = PriceQuarantineApi()

        // to test confirmBusinessPrices
        should("test confirmBusinessPrices") {
            // uncomment below to test confirmBusinessPrices
            //val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
            //val confirmPricesRequest : ConfirmPricesRequest =  // ConfirmPricesRequest | 
            //val result : EmptyApiResponse = apiInstance.confirmBusinessPrices(businessId, confirmPricesRequest)
            //result shouldBe ("TODO")
        }

        // to test confirmCampaignPrices
        should("test confirmCampaignPrices") {
            // uncomment below to test confirmCampaignPrices
            //val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
            //val confirmPricesRequest : ConfirmPricesRequest =  // ConfirmPricesRequest | 
            //val result : EmptyApiResponse = apiInstance.confirmCampaignPrices(campaignId, confirmPricesRequest)
            //result shouldBe ("TODO")
        }

        // to test getBusinessQuarantineOffers
        should("test getBusinessQuarantineOffers") {
            // uncomment below to test getBusinessQuarantineOffers
            //val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
            //val getQuarantineOffersRequest : GetQuarantineOffersRequest =  // GetQuarantineOffersRequest | 
            //val pageToken : kotlin.String = eyBuZXh0SWQ6IDIzNDIgfQ== // kotlin.String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
            //val limit : kotlin.Int = 20 // kotlin.Int | Количество значений на одной странице. 
            //val result : GetQuarantineOffersResponse = apiInstance.getBusinessQuarantineOffers(businessId, getQuarantineOffersRequest, pageToken, limit)
            //result shouldBe ("TODO")
        }

        // to test getCampaignQuarantineOffers
        should("test getCampaignQuarantineOffers") {
            // uncomment below to test getCampaignQuarantineOffers
            //val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
            //val getQuarantineOffersRequest : GetQuarantineOffersRequest =  // GetQuarantineOffersRequest | 
            //val pageToken : kotlin.String = eyBuZXh0SWQ6IDIzNDIgfQ== // kotlin.String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
            //val limit : kotlin.Int = 20 // kotlin.Int | Количество значений на одной странице. 
            //val result : GetQuarantineOffersResponse = apiInstance.getCampaignQuarantineOffers(campaignId, getQuarantineOffersRequest, pageToken, limit)
            //result shouldBe ("TODO")
        }

    }
}
