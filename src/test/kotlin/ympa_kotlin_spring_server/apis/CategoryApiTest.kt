package ympa_kotlin_spring_server.apis

import ympa_kotlin_spring_server.models.ApiClientDataErrorResponse
import ympa_kotlin_spring_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_spring_server.models.ApiLimitErrorResponse
import ympa_kotlin_spring_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_spring_server.models.ApiServerErrorResponse
import ympa_kotlin_spring_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_spring_server.models.GetCategoryContentParametersResponse
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class CategoryApiTest {

    private val api: CategoryApiController = CategoryApiController()

    /**
     * To test CategoryApiController.getCategoryContentParameters
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCategoryContentParametersTest() {
        val categoryId: kotlin.Long = TODO()
        val response: ResponseEntity<GetCategoryContentParametersResponse> = api.getCategoryContentParameters(categoryId)

        // TODO: test validations
    }

    /**
     * To test CategoryApiController.getCategoryContentParameters
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCategoryContentParametersTest() {
        val categoryId: kotlin.Long = TODO()
        val response: ResponseEntity<GetCategoryContentParametersResponse> = api.getCategoryContentParameters(categoryId)

        // TODO: test validations
    }

    /**
     * To test CategoryApiController.getCategoryContentParameters
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCategoryContentParametersTest() {
        val categoryId: kotlin.Long = TODO()
        val response: ResponseEntity<GetCategoryContentParametersResponse> = api.getCategoryContentParameters(categoryId)

        // TODO: test validations
    }

    /**
     * To test CategoryApiController.getCategoryContentParameters
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCategoryContentParametersTest() {
        val categoryId: kotlin.Long = TODO()
        val response: ResponseEntity<GetCategoryContentParametersResponse> = api.getCategoryContentParameters(categoryId)

        // TODO: test validations
    }

    /**
     * To test CategoryApiController.getCategoryContentParameters
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCategoryContentParametersTest() {
        val categoryId: kotlin.Long = TODO()
        val response: ResponseEntity<GetCategoryContentParametersResponse> = api.getCategoryContentParameters(categoryId)

        // TODO: test validations
    }
}
