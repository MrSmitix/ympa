package org.openapitools.api;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.GetDeliveryServicesResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for DeliveryServicesApi
 */
@MicronautTest
public class DeliveryServicesApiTest {

    @Inject
    DeliveryServicesApi api;

    
    /**
     * Справочник служб доставки
     *
     * Возвращает справочник служб доставки: идентификаторы и наименования. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getDeliveryServicesTest() {
        // given

        // when
        GetDeliveryServicesResponse body = api.getDeliveryServices().block();

        // then
        // TODO implement the getDeliveryServicesTest()
    }

    
}
