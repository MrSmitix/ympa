package ympa_kotlin_spring_server.apis

import ympa_kotlin_spring_server.models.ApiClientDataErrorResponse
import ympa_kotlin_spring_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_spring_server.models.ApiLimitErrorResponse
import ympa_kotlin_spring_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_spring_server.models.ApiServerErrorResponse
import ympa_kotlin_spring_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_spring_server.models.GetFulfillmentWarehousesResponse
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class WarehousesApiTest {

    private val api: WarehousesApiController = WarehousesApiController()

    /**
     * To test WarehousesApiController.getFulfillmentWarehouses
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getFulfillmentWarehousesTest() {
        val response: ResponseEntity<GetFulfillmentWarehousesResponse> = api.getFulfillmentWarehouses()

        // TODO: test validations
    }

    /**
     * To test WarehousesApiController.getFulfillmentWarehouses
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getFulfillmentWarehousesTest() {
        val response: ResponseEntity<GetFulfillmentWarehousesResponse> = api.getFulfillmentWarehouses()

        // TODO: test validations
    }
}
