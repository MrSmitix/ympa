package ympa_kotlin_spring_server.apis

import ympa_kotlin_spring_server.models.ApiClientDataErrorResponse
import ympa_kotlin_spring_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_spring_server.models.ApiLimitErrorResponse
import ympa_kotlin_spring_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_spring_server.models.ApiServerErrorResponse
import ympa_kotlin_spring_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_spring_server.models.GetRegionWithChildrenResponse
import ympa_kotlin_spring_server.models.GetRegionsResponse
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class RegionsApiTest {

    private val api: RegionsApiController = RegionsApiController()

    /**
     * To test RegionsApiController.searchRegionChildren
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun searchRegionChildrenTest() {
        val regionId: kotlin.Long = TODO()
        val page: kotlin.Int = TODO()
        val pageSize: kotlin.Int? = TODO()
        val response: ResponseEntity<GetRegionWithChildrenResponse> = api.searchRegionChildren(regionId, page, pageSize)

        // TODO: test validations
    }

    /**
     * To test RegionsApiController.searchRegionChildren
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun searchRegionChildrenTest() {
        val regionId: kotlin.Long = TODO()
        val page: kotlin.Int = TODO()
        val pageSize: kotlin.Int? = TODO()
        val response: ResponseEntity<GetRegionWithChildrenResponse> = api.searchRegionChildren(regionId, page, pageSize)

        // TODO: test validations
    }

    /**
     * To test RegionsApiController.searchRegionChildren
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun searchRegionChildrenTest() {
        val regionId: kotlin.Long = TODO()
        val page: kotlin.Int = TODO()
        val pageSize: kotlin.Int? = TODO()
        val response: ResponseEntity<GetRegionWithChildrenResponse> = api.searchRegionChildren(regionId, page, pageSize)

        // TODO: test validations
    }

    /**
     * To test RegionsApiController.searchRegionChildren
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun searchRegionChildrenTest() {
        val regionId: kotlin.Long = TODO()
        val page: kotlin.Int = TODO()
        val pageSize: kotlin.Int? = TODO()
        val response: ResponseEntity<GetRegionWithChildrenResponse> = api.searchRegionChildren(regionId, page, pageSize)

        // TODO: test validations
    }

    /**
     * To test RegionsApiController.searchRegionChildren
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun searchRegionChildrenTest() {
        val regionId: kotlin.Long = TODO()
        val page: kotlin.Int = TODO()
        val pageSize: kotlin.Int? = TODO()
        val response: ResponseEntity<GetRegionWithChildrenResponse> = api.searchRegionChildren(regionId, page, pageSize)

        // TODO: test validations
    }

    /**
     * To test RegionsApiController.searchRegionsById
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun searchRegionsByIdTest() {
        val regionId: kotlin.Long = TODO()
        val response: ResponseEntity<GetRegionsResponse> = api.searchRegionsById(regionId)

        // TODO: test validations
    }

    /**
     * To test RegionsApiController.searchRegionsById
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun searchRegionsByIdTest() {
        val regionId: kotlin.Long = TODO()
        val response: ResponseEntity<GetRegionsResponse> = api.searchRegionsById(regionId)

        // TODO: test validations
    }

    /**
     * To test RegionsApiController.searchRegionsById
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun searchRegionsByIdTest() {
        val regionId: kotlin.Long = TODO()
        val response: ResponseEntity<GetRegionsResponse> = api.searchRegionsById(regionId)

        // TODO: test validations
    }

    /**
     * To test RegionsApiController.searchRegionsById
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun searchRegionsByIdTest() {
        val regionId: kotlin.Long = TODO()
        val response: ResponseEntity<GetRegionsResponse> = api.searchRegionsById(regionId)

        // TODO: test validations
    }

    /**
     * To test RegionsApiController.searchRegionsById
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun searchRegionsByIdTest() {
        val regionId: kotlin.Long = TODO()
        val response: ResponseEntity<GetRegionsResponse> = api.searchRegionsById(regionId)

        // TODO: test validations
    }

    /**
     * To test RegionsApiController.searchRegionsByName
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun searchRegionsByNameTest() {
        val name: kotlin.String = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetRegionsResponse> = api.searchRegionsByName(name, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test RegionsApiController.searchRegionsByName
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun searchRegionsByNameTest() {
        val name: kotlin.String = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetRegionsResponse> = api.searchRegionsByName(name, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test RegionsApiController.searchRegionsByName
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun searchRegionsByNameTest() {
        val name: kotlin.String = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetRegionsResponse> = api.searchRegionsByName(name, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test RegionsApiController.searchRegionsByName
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun searchRegionsByNameTest() {
        val name: kotlin.String = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetRegionsResponse> = api.searchRegionsByName(name, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test RegionsApiController.searchRegionsByName
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun searchRegionsByNameTest() {
        val name: kotlin.String = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetRegionsResponse> = api.searchRegionsByName(name, pageToken, limit)

        // TODO: test validations
    }
}
