package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ApiClientDataErrorResponse
import org.openapitools.model.ApiForbiddenErrorResponse
import org.openapitools.model.ApiLimitErrorResponse
import org.openapitools.model.ApiNotFoundErrorResponse
import org.openapitools.model.ApiServerErrorResponse
import org.openapitools.model.ApiUnauthorizedErrorResponse
import org.openapitools.model.GenerateBoostConsolidatedRequest
import org.openapitools.model.GenerateCompetitorsPositionReportRequest
import org.openapitools.model.GenerateGoodsFeedbackRequest
import org.openapitools.model.GenerateGoodsMovementReportRequest
import org.openapitools.model.GenerateGoodsRealizationReportRequest
import org.openapitools.model.GenerateGoodsTurnoverRequest
import org.openapitools.model.GenerateMassOrderLabelsRequest
import org.openapitools.model.GeneratePricesReportRequest
import org.openapitools.model.GenerateReportResponse
import org.openapitools.model.GenerateShelfsStatisticsRequest
import org.openapitools.model.GenerateShipmentListDocumentReportRequest
import org.openapitools.model.GenerateShowsSalesReportRequest
import org.openapitools.model.GenerateStocksOnWarehousesReportRequest
import org.openapitools.model.GenerateUnitedMarketplaceServicesReportRequest
import org.openapitools.model.GenerateUnitedNettingReportRequest
import org.openapitools.model.GenerateUnitedOrdersRequest
import org.openapitools.model.GetReportInfoResponse
import org.openapitools.model.PageFormatType
import org.openapitools.model.ReportFormatType

class ReportsApi {
    String basePath = "https://api.partner.market.yandex.ru"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def generateBoostConsolidatedReport ( GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest, ReportFormatType format, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/reports/boost-consolidated/generate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (generateBoostConsolidatedRequest == null) {
            throw new RuntimeException("missing required params generateBoostConsolidatedRequest")
        }

        if (format != null) {
            queryParams.put("format", format)
        }


        contentType = 'application/json';
        bodyParams = generateBoostConsolidatedRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GenerateReportResponse.class )

    }

    def generateCompetitorsPositionReport ( GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest, ReportFormatType format, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/reports/competitors-position/generate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (generateCompetitorsPositionReportRequest == null) {
            throw new RuntimeException("missing required params generateCompetitorsPositionReportRequest")
        }

        if (format != null) {
            queryParams.put("format", format)
        }


        contentType = 'application/json';
        bodyParams = generateCompetitorsPositionReportRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GenerateReportResponse.class )

    }

    def generateGoodsFeedbackReport ( GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest, ReportFormatType format, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/reports/goods-feedback/generate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (generateGoodsFeedbackRequest == null) {
            throw new RuntimeException("missing required params generateGoodsFeedbackRequest")
        }

        if (format != null) {
            queryParams.put("format", format)
        }


        contentType = 'application/json';
        bodyParams = generateGoodsFeedbackRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GenerateReportResponse.class )

    }

    def generateGoodsMovementReport ( GenerateGoodsMovementReportRequest generateGoodsMovementReportRequest, ReportFormatType format, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/reports/goods-movement/generate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (generateGoodsMovementReportRequest == null) {
            throw new RuntimeException("missing required params generateGoodsMovementReportRequest")
        }

        if (format != null) {
            queryParams.put("format", format)
        }


        contentType = 'application/json';
        bodyParams = generateGoodsMovementReportRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GenerateReportResponse.class )

    }

    def generateGoodsRealizationReport ( GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest, ReportFormatType format, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/reports/goods-realization/generate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (generateGoodsRealizationReportRequest == null) {
            throw new RuntimeException("missing required params generateGoodsRealizationReportRequest")
        }

        if (format != null) {
            queryParams.put("format", format)
        }


        contentType = 'application/json';
        bodyParams = generateGoodsRealizationReportRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GenerateReportResponse.class )

    }

    def generateGoodsTurnoverReport ( GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest, ReportFormatType format, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/reports/goods-turnover/generate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (generateGoodsTurnoverRequest == null) {
            throw new RuntimeException("missing required params generateGoodsTurnoverRequest")
        }

        if (format != null) {
            queryParams.put("format", format)
        }


        contentType = 'application/json';
        bodyParams = generateGoodsTurnoverRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GenerateReportResponse.class )

    }

    def generateMassOrderLabelsReport ( GenerateMassOrderLabelsRequest generateMassOrderLabelsRequest, PageFormatType format, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/reports/documents/labels/generate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (generateMassOrderLabelsRequest == null) {
            throw new RuntimeException("missing required params generateMassOrderLabelsRequest")
        }

        if (format != null) {
            queryParams.put("format", format)
        }


        contentType = 'application/json';
        bodyParams = generateMassOrderLabelsRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GenerateReportResponse.class )

    }

    def generatePricesReport ( GeneratePricesReportRequest generatePricesReportRequest, ReportFormatType format, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/reports/prices/generate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (generatePricesReportRequest == null) {
            throw new RuntimeException("missing required params generatePricesReportRequest")
        }

        if (format != null) {
            queryParams.put("format", format)
        }


        contentType = 'application/json';
        bodyParams = generatePricesReportRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GenerateReportResponse.class )

    }

    def generateShelfsStatisticsReport ( GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest, ReportFormatType format, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/reports/shelf-statistics/generate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (generateShelfsStatisticsRequest == null) {
            throw new RuntimeException("missing required params generateShelfsStatisticsRequest")
        }

        if (format != null) {
            queryParams.put("format", format)
        }


        contentType = 'application/json';
        bodyParams = generateShelfsStatisticsRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GenerateReportResponse.class )

    }

    def generateShipmentListDocumentReport ( GenerateShipmentListDocumentReportRequest generateShipmentListDocumentReportRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/reports/documents/shipment-list/generate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (generateShipmentListDocumentReportRequest == null) {
            throw new RuntimeException("missing required params generateShipmentListDocumentReportRequest")
        }



        contentType = 'application/json';
        bodyParams = generateShipmentListDocumentReportRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GenerateReportResponse.class )

    }

    def generateShowsSalesReport ( GenerateShowsSalesReportRequest generateShowsSalesReportRequest, ReportFormatType format, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/reports/shows-sales/generate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (generateShowsSalesReportRequest == null) {
            throw new RuntimeException("missing required params generateShowsSalesReportRequest")
        }

        if (format != null) {
            queryParams.put("format", format)
        }


        contentType = 'application/json';
        bodyParams = generateShowsSalesReportRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GenerateReportResponse.class )

    }

    def generateStocksOnWarehousesReport ( GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest, ReportFormatType format, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/reports/stocks-on-warehouses/generate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (generateStocksOnWarehousesReportRequest == null) {
            throw new RuntimeException("missing required params generateStocksOnWarehousesReportRequest")
        }

        if (format != null) {
            queryParams.put("format", format)
        }


        contentType = 'application/json';
        bodyParams = generateStocksOnWarehousesReportRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GenerateReportResponse.class )

    }

    def generateUnitedMarketplaceServicesReport ( GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest, ReportFormatType format, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/reports/united-marketplace-services/generate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (generateUnitedMarketplaceServicesReportRequest == null) {
            throw new RuntimeException("missing required params generateUnitedMarketplaceServicesReportRequest")
        }

        if (format != null) {
            queryParams.put("format", format)
        }


        contentType = 'application/json';
        bodyParams = generateUnitedMarketplaceServicesReportRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GenerateReportResponse.class )

    }

    def generateUnitedNettingReport ( GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest, ReportFormatType format, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/reports/united-netting/generate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (generateUnitedNettingReportRequest == null) {
            throw new RuntimeException("missing required params generateUnitedNettingReportRequest")
        }

        if (format != null) {
            queryParams.put("format", format)
        }


        contentType = 'application/json';
        bodyParams = generateUnitedNettingReportRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GenerateReportResponse.class )

    }

    def generateUnitedOrdersReport ( GenerateUnitedOrdersRequest generateUnitedOrdersRequest, ReportFormatType format, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/reports/united-orders/generate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (generateUnitedOrdersRequest == null) {
            throw new RuntimeException("missing required params generateUnitedOrdersRequest")
        }

        if (format != null) {
            queryParams.put("format", format)
        }


        contentType = 'application/json';
        bodyParams = generateUnitedOrdersRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GenerateReportResponse.class )

    }

    def getReportInfo ( String reportId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/reports/info/${reportId}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (reportId == null) {
            throw new RuntimeException("missing required params reportId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetReportInfoResponse.class )

    }

}
