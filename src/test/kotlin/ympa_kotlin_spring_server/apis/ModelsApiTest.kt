package ympa_kotlin_spring_server.apis

import ympa_kotlin_spring_server.models.ApiClientDataErrorResponse
import ympa_kotlin_spring_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_spring_server.models.ApiLimitErrorResponse
import ympa_kotlin_spring_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_spring_server.models.ApiServerErrorResponse
import ympa_kotlin_spring_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_spring_server.models.CurrencyType
import ympa_kotlin_spring_server.models.GetModelsOffersResponse
import ympa_kotlin_spring_server.models.GetModelsRequest
import ympa_kotlin_spring_server.models.GetModelsResponse
import ympa_kotlin_spring_server.models.SearchModelsResponse
import ympa_kotlin_spring_server.models.SortOrderType
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class ModelsApiTest {

    private val api: ModelsApiController = ModelsApiController()

    /**
     * To test ModelsApiController.getModel
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getModelTest() {
        val modelId: kotlin.Long = TODO()
        val regionId: kotlin.Long = TODO()
        val currency: CurrencyType? = TODO()
        val response: ResponseEntity<GetModelsResponse> = api.getModel(modelId, regionId, currency)

        // TODO: test validations
    }

    /**
     * To test ModelsApiController.getModel
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getModelTest() {
        val modelId: kotlin.Long = TODO()
        val regionId: kotlin.Long = TODO()
        val currency: CurrencyType? = TODO()
        val response: ResponseEntity<GetModelsResponse> = api.getModel(modelId, regionId, currency)

        // TODO: test validations
    }

    /**
     * To test ModelsApiController.getModelOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getModelOffersTest() {
        val modelId: kotlin.Long = TODO()
        val regionId: kotlin.Long = TODO()
        val currency: CurrencyType? = TODO()
        val orderByPrice: SortOrderType? = TODO()
        val count: kotlin.Int = TODO()
        val page: kotlin.Int = TODO()
        val response: ResponseEntity<GetModelsOffersResponse> = api.getModelOffers(modelId, regionId, currency, orderByPrice, count, page)

        // TODO: test validations
    }

    /**
     * To test ModelsApiController.getModelOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getModelOffersTest() {
        val modelId: kotlin.Long = TODO()
        val regionId: kotlin.Long = TODO()
        val currency: CurrencyType? = TODO()
        val orderByPrice: SortOrderType? = TODO()
        val count: kotlin.Int = TODO()
        val page: kotlin.Int = TODO()
        val response: ResponseEntity<GetModelsOffersResponse> = api.getModelOffers(modelId, regionId, currency, orderByPrice, count, page)

        // TODO: test validations
    }

    /**
     * To test ModelsApiController.getModels
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getModelsTest() {
        val regionId: kotlin.Long = TODO()
        val getModelsRequest: GetModelsRequest = TODO()
        val currency: CurrencyType? = TODO()
        val response: ResponseEntity<GetModelsResponse> = api.getModels(regionId, getModelsRequest, currency)

        // TODO: test validations
    }

    /**
     * To test ModelsApiController.getModels
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getModelsTest() {
        val regionId: kotlin.Long = TODO()
        val getModelsRequest: GetModelsRequest = TODO()
        val currency: CurrencyType? = TODO()
        val response: ResponseEntity<GetModelsResponse> = api.getModels(regionId, getModelsRequest, currency)

        // TODO: test validations
    }

    /**
     * To test ModelsApiController.getModelsOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getModelsOffersTest() {
        val regionId: kotlin.Long = TODO()
        val getModelsRequest: GetModelsRequest = TODO()
        val currency: CurrencyType? = TODO()
        val orderByPrice: SortOrderType? = TODO()
        val response: ResponseEntity<GetModelsOffersResponse> = api.getModelsOffers(regionId, getModelsRequest, currency, orderByPrice)

        // TODO: test validations
    }

    /**
     * To test ModelsApiController.getModelsOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getModelsOffersTest() {
        val regionId: kotlin.Long = TODO()
        val getModelsRequest: GetModelsRequest = TODO()
        val currency: CurrencyType? = TODO()
        val orderByPrice: SortOrderType? = TODO()
        val response: ResponseEntity<GetModelsOffersResponse> = api.getModelsOffers(regionId, getModelsRequest, currency, orderByPrice)

        // TODO: test validations
    }

    /**
     * To test ModelsApiController.searchModels
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun searchModelsTest() {
        val query: kotlin.String = TODO()
        val regionId: kotlin.Long = TODO()
        val currency: CurrencyType? = TODO()
        val page: kotlin.Int = TODO()
        val pageSize: kotlin.Int? = TODO()
        val response: ResponseEntity<SearchModelsResponse> = api.searchModels(query, regionId, currency, page, pageSize)

        // TODO: test validations
    }

    /**
     * To test ModelsApiController.searchModels
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun searchModelsTest() {
        val query: kotlin.String = TODO()
        val regionId: kotlin.Long = TODO()
        val currency: CurrencyType? = TODO()
        val page: kotlin.Int = TODO()
        val pageSize: kotlin.Int? = TODO()
        val response: ResponseEntity<SearchModelsResponse> = api.searchModels(query, regionId, currency, page, pageSize)

        // TODO: test validations
    }
}
