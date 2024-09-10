package org.openapitools.server.api;

import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.model.GetGoodsStatsRequest;
import org.openapitools.server.model.GetGoodsStatsResponse;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.helidon.http.Status;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class GoodsStatsServiceImpl implements GoodsStatsService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void getGoodsStats(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service GoodsStatsService is down. Goodbye!");
    }

}
