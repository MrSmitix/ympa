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

import ympa_kotlin_client.apis.OutletsApi
import ympa_kotlin_client.models.ApiClientDataErrorResponse
import ympa_kotlin_client.models.ApiForbiddenErrorResponse
import ympa_kotlin_client.models.ApiLimitErrorResponse
import ympa_kotlin_client.models.ApiNotFoundErrorResponse
import ympa_kotlin_client.models.ApiServerErrorResponse
import ympa_kotlin_client.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_client.models.ChangeOutletRequest
import ympa_kotlin_client.models.CreateOutletResponse
import ympa_kotlin_client.models.EmptyApiResponse
import ympa_kotlin_client.models.GetOutletResponse
import ympa_kotlin_client.models.GetOutletsResponse

class OutletsApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of OutletsApi
        //val apiInstance = OutletsApi()

        // to test createOutlet
        should("test createOutlet") {
            // uncomment below to test createOutlet
            //val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
            //val changeOutletRequest : ChangeOutletRequest =  // ChangeOutletRequest | 
            //val result : CreateOutletResponse = apiInstance.createOutlet(campaignId, changeOutletRequest)
            //result shouldBe ("TODO")
        }

        // to test deleteOutlet
        should("test deleteOutlet") {
            // uncomment below to test deleteOutlet
            //val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
            //val outletId : kotlin.Long = 789 // kotlin.Long | Идентификатор точки продаж.
            //val result : EmptyApiResponse = apiInstance.deleteOutlet(campaignId, outletId)
            //result shouldBe ("TODO")
        }

        // to test getOutlet
        should("test getOutlet") {
            // uncomment below to test getOutlet
            //val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
            //val outletId : kotlin.Long = 789 // kotlin.Long | Идентификатор точки продаж.
            //val result : GetOutletResponse = apiInstance.getOutlet(campaignId, outletId)
            //result shouldBe ("TODO")
        }

        // to test getOutlets
        should("test getOutlets") {
            // uncomment below to test getOutlets
            //val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
            //val pageToken : kotlin.String = eyBuZXh0SWQ6IDIzNDIgfQ== // kotlin.String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
            //val regionId : kotlin.Long = 789 // kotlin.Long | Идентификатор региона. Если задать идентификатор родительского региона любого уровня, в выходных данных будут отображены точки продаж всех дочерних регионов. Идентификатор региона можно получить c помощью метода [GET regions](../../reference/regions/searchRegionsByName.md). 
            //val shopOutletCode : kotlin.String = shopOutletCode_example // kotlin.String | Идентификатор точки продаж, присвоенный магазином.
            //val regionId2 : kotlin.Long = 789 // kotlin.Long | {% note warning \"\" %}  Этот параметр устарел. Для указания региона используйте `region_id`.  {% endnote %} 
            //val result : GetOutletsResponse = apiInstance.getOutlets(campaignId, pageToken, regionId, shopOutletCode, regionId2)
            //result shouldBe ("TODO")
        }

        // to test updateOutlet
        should("test updateOutlet") {
            // uncomment below to test updateOutlet
            //val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
            //val outletId : kotlin.Long = 789 // kotlin.Long | Идентификатор точки продаж.
            //val changeOutletRequest : ChangeOutletRequest =  // ChangeOutletRequest | 
            //val result : EmptyApiResponse = apiInstance.updateOutlet(campaignId, outletId, changeOutletRequest)
            //result shouldBe ("TODO")
        }

    }
}
