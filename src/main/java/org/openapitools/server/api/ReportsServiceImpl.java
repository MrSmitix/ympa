package org.openapitools.server.api;

import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.model.GenerateBoostConsolidatedRequest;
import org.openapitools.server.model.GenerateCompetitorsPositionReportRequest;
import org.openapitools.server.model.GenerateGoodsFeedbackRequest;
import org.openapitools.server.model.GenerateGoodsMovementReportRequest;
import org.openapitools.server.model.GenerateGoodsRealizationReportRequest;
import org.openapitools.server.model.GenerateGoodsTurnoverRequest;
import org.openapitools.server.model.GenerateMassOrderLabelsRequest;
import org.openapitools.server.model.GeneratePricesReportRequest;
import org.openapitools.server.model.GenerateReportResponse;
import org.openapitools.server.model.GenerateShelfsStatisticsRequest;
import org.openapitools.server.model.GenerateShipmentListDocumentReportRequest;
import org.openapitools.server.model.GenerateShowsSalesReportRequest;
import org.openapitools.server.model.GenerateStocksOnWarehousesReportRequest;
import org.openapitools.server.model.GenerateUnitedMarketplaceServicesReportRequest;
import org.openapitools.server.model.GenerateUnitedNettingReportRequest;
import org.openapitools.server.model.GenerateUnitedOrdersRequest;
import org.openapitools.server.model.GetReportInfoResponse;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PageFormatType;
import org.openapitools.server.model.ReportFormatType;
import io.helidon.http.Status;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class ReportsServiceImpl implements ReportsService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void generateBoostConsolidatedReport(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void generateCompetitorsPositionReport(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void generateGoodsFeedbackReport(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void generateGoodsMovementReport(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void generateGoodsRealizationReport(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void generateGoodsTurnoverReport(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void generateMassOrderLabelsReport(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void generatePricesReport(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void generateShelfsStatisticsReport(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void generateShipmentListDocumentReport(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void generateShowsSalesReport(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void generateStocksOnWarehousesReport(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void generateUnitedMarketplaceServicesReport(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void generateUnitedNettingReport(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void generateUnitedOrdersReport(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getReportInfo(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service ReportsService is down. Goodbye!");
    }

}
