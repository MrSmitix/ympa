package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.ApiClientDataErrorResponse;
import com.prokarma.pkmst.model.ApiForbiddenErrorResponse;
import com.prokarma.pkmst.model.ApiLimitErrorResponse;
import com.prokarma.pkmst.model.ApiNotFoundErrorResponse;
import com.prokarma.pkmst.model.ApiServerErrorResponse;
import com.prokarma.pkmst.model.ApiUnauthorizedErrorResponse;
import com.prokarma.pkmst.model.GenerateBoostConsolidatedRequest;
import com.prokarma.pkmst.model.GenerateCompetitorsPositionReportRequest;
import com.prokarma.pkmst.model.GenerateGoodsFeedbackRequest;
import com.prokarma.pkmst.model.GenerateGoodsMovementReportRequest;
import com.prokarma.pkmst.model.GenerateGoodsRealizationReportRequest;
import com.prokarma.pkmst.model.GenerateGoodsTurnoverRequest;
import com.prokarma.pkmst.model.GenerateMassOrderLabelsRequest;
import com.prokarma.pkmst.model.GeneratePricesReportRequest;
import com.prokarma.pkmst.model.GenerateReportResponse;
import com.prokarma.pkmst.model.GenerateShelfsStatisticsRequest;
import com.prokarma.pkmst.model.GenerateShipmentListDocumentReportRequest;
import com.prokarma.pkmst.model.GenerateShowsSalesReportRequest;
import com.prokarma.pkmst.model.GenerateStocksOnWarehousesReportRequest;
import com.prokarma.pkmst.model.GenerateUnitedMarketplaceServicesReportRequest;
import com.prokarma.pkmst.model.GenerateUnitedNettingReportRequest;
import com.prokarma.pkmst.model.GenerateUnitedOrdersRequest;
import com.prokarma.pkmst.model.GetReportInfoResponse;
import com.prokarma.pkmst.model.PageFormatType;
import com.prokarma.pkmst.model.ReportFormatType;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implementation
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Controller
public class ReportsApiController implements ReportsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public ReportsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<GenerateReportResponse> generateBoostConsolidatedReport(@ApiParam(value = "" ,required=true )   @RequestBody GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest,
        @ApiParam(value = "Формат отчета.", allowableValues = "FILE, CSV")  @RequestParam(value = "format", required = false) ReportFormatType format,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GenerateReportResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GenerateReportResponse> generateCompetitorsPositionReport(@ApiParam(value = "" ,required=true )   @RequestBody GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest,
        @ApiParam(value = "Формат отчета.", allowableValues = "FILE, CSV")  @RequestParam(value = "format", required = false) ReportFormatType format,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GenerateReportResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GenerateReportResponse> generateGoodsFeedbackReport(@ApiParam(value = "" ,required=true )   @RequestBody GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest,
        @ApiParam(value = "Формат отчета.", allowableValues = "FILE, CSV")  @RequestParam(value = "format", required = false) ReportFormatType format,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GenerateReportResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GenerateReportResponse> generateGoodsMovementReport(@ApiParam(value = "" ,required=true )   @RequestBody GenerateGoodsMovementReportRequest generateGoodsMovementReportRequest,
        @ApiParam(value = "Формат отчета.", allowableValues = "FILE, CSV")  @RequestParam(value = "format", required = false) ReportFormatType format,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GenerateReportResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GenerateReportResponse> generateGoodsRealizationReport(@ApiParam(value = "" ,required=true )   @RequestBody GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest,
        @ApiParam(value = "Формат отчета.", allowableValues = "FILE, CSV")  @RequestParam(value = "format", required = false) ReportFormatType format,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GenerateReportResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GenerateReportResponse> generateGoodsTurnoverReport(@ApiParam(value = "" ,required=true )   @RequestBody GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest,
        @ApiParam(value = "Формат отчета.", allowableValues = "FILE, CSV")  @RequestParam(value = "format", required = false) ReportFormatType format,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GenerateReportResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GenerateReportResponse> generateMassOrderLabelsReport(@ApiParam(value = "" ,required=true )   @RequestBody GenerateMassOrderLabelsRequest generateMassOrderLabelsRequest,
        @ApiParam(value = "Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7.", allowableValues = "A7, A4")  @RequestParam(value = "format", required = false) PageFormatType format,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GenerateReportResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GenerateReportResponse> generatePricesReport(@ApiParam(value = "" ,required=true )   @RequestBody GeneratePricesReportRequest generatePricesReportRequest,
        @ApiParam(value = "Формат отчета.", allowableValues = "FILE, CSV")  @RequestParam(value = "format", required = false) ReportFormatType format,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GenerateReportResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GenerateReportResponse> generateShelfsStatisticsReport(@ApiParam(value = "" ,required=true )   @RequestBody GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest,
        @ApiParam(value = "Формат отчета.", allowableValues = "FILE, CSV")  @RequestParam(value = "format", required = false) ReportFormatType format,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GenerateReportResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GenerateReportResponse> generateShipmentListDocumentReport(@ApiParam(value = "" ,required=true )   @RequestBody GenerateShipmentListDocumentReportRequest generateShipmentListDocumentReportRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GenerateReportResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GenerateReportResponse> generateShowsSalesReport(@ApiParam(value = "" ,required=true )   @RequestBody GenerateShowsSalesReportRequest generateShowsSalesReportRequest,
        @ApiParam(value = "Формат отчета.", allowableValues = "FILE, CSV")  @RequestParam(value = "format", required = false) ReportFormatType format,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GenerateReportResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GenerateReportResponse> generateStocksOnWarehousesReport(@ApiParam(value = "" ,required=true )   @RequestBody GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest,
        @ApiParam(value = "Формат отчета.", allowableValues = "FILE, CSV")  @RequestParam(value = "format", required = false) ReportFormatType format,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GenerateReportResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GenerateReportResponse> generateUnitedMarketplaceServicesReport(@ApiParam(value = "" ,required=true )   @RequestBody GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest,
        @ApiParam(value = "Формат отчета.", allowableValues = "FILE, CSV")  @RequestParam(value = "format", required = false) ReportFormatType format,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GenerateReportResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GenerateReportResponse> generateUnitedNettingReport(@ApiParam(value = "" ,required=true )   @RequestBody GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest,
        @ApiParam(value = "Формат отчета.", allowableValues = "FILE, CSV")  @RequestParam(value = "format", required = false) ReportFormatType format,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GenerateReportResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GenerateReportResponse> generateUnitedOrdersReport(@ApiParam(value = "" ,required=true )   @RequestBody GenerateUnitedOrdersRequest generateUnitedOrdersRequest,
        @ApiParam(value = "Формат отчета.", allowableValues = "FILE, CSV")  @RequestParam(value = "format", required = false) ReportFormatType format,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerateReportResponse>(objectMapper.readValue("", GenerateReportResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GenerateReportResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetReportInfoResponse> getReportInfo(@ApiParam(value = "Идентификатор отчета, который вы получили после запуска генерации. ",required=true ) @PathVariable("reportId") String reportId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetReportInfoResponse>(objectMapper.readValue("", GetReportInfoResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetReportInfoResponse>(objectMapper.readValue("", GetReportInfoResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetReportInfoResponse>(objectMapper.readValue("", GetReportInfoResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetReportInfoResponse>(objectMapper.readValue("", GetReportInfoResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetReportInfoResponse>(objectMapper.readValue("", GetReportInfoResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetReportInfoResponse>(objectMapper.readValue("", GetReportInfoResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetReportInfoResponse>(objectMapper.readValue("", GetReportInfoResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetReportInfoResponse>(HttpStatus.OK);
    }

}
