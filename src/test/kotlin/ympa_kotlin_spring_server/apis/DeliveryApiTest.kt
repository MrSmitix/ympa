package ympa_kotlin_spring_server.apis

import ympa_kotlin_spring_server.models.ApiClientDataErrorResponse
import ympa_kotlin_spring_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_spring_server.models.ApiLimitErrorResponse
import ympa_kotlin_spring_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_spring_server.models.ApiServerErrorResponse
import ympa_kotlin_spring_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_spring_server.models.GetDeliveryServicesResponse
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class DeliveryApiTest {

    private val api: DeliveryApiController = DeliveryApiController()

    /**
     * To test DeliveryApiController.getDeliveryServices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getDeliveryServicesTest() {
        val response: ResponseEntity<GetDeliveryServicesResponse> = api.getDeliveryServices()

        // TODO: test validations
    }

    /**
     * To test DeliveryApiController.getDeliveryServices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getDeliveryServicesTest() {
        val response: ResponseEntity<GetDeliveryServicesResponse> = api.getDeliveryServices()

        // TODO: test validations
    }

    /**
     * To test DeliveryApiController.getDeliveryServices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getDeliveryServicesTest() {
        val response: ResponseEntity<GetDeliveryServicesResponse> = api.getDeliveryServices()

        // TODO: test validations
    }

    /**
     * To test DeliveryApiController.getDeliveryServices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getDeliveryServicesTest() {
        val response: ResponseEntity<GetDeliveryServicesResponse> = api.getDeliveryServices()

        // TODO: test validations
    }
}
