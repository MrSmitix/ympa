#include "ReportsApi.h"

using namespace Tiny;



        Response<
            GenerateReportResponse
        >
        ReportsApi::
        generateBoostConsolidatedReport(
            
            GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest
            , 
            
            ReportFormatType format
            
        )
        {
            std::string url = basepath + "/reports/boost-consolidated/generate"; //


            // Headers  | 

            // Query    | format 
            addQueryParam("format",format);

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | generateBoostConsolidatedRequest



            payload = generateBoostConsolidatedRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GenerateReportResponse obj(output_string);


            Response<GenerateReportResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GenerateReportResponse
        >
        ReportsApi::
        generateCompetitorsPositionReport(
            
            GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest
            , 
            
            ReportFormatType format
            
        )
        {
            std::string url = basepath + "/reports/competitors-position/generate"; //


            // Headers  | 

            // Query    | format 
            addQueryParam("format",format);

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | generateCompetitorsPositionReportRequest



            payload = generateCompetitorsPositionReportRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GenerateReportResponse obj(output_string);


            Response<GenerateReportResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GenerateReportResponse
        >
        ReportsApi::
        generateGoodsFeedbackReport(
            
            GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest
            , 
            
            ReportFormatType format
            
        )
        {
            std::string url = basepath + "/reports/goods-feedback/generate"; //


            // Headers  | 

            // Query    | format 
            addQueryParam("format",format);

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | generateGoodsFeedbackRequest



            payload = generateGoodsFeedbackRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GenerateReportResponse obj(output_string);


            Response<GenerateReportResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GenerateReportResponse
        >
        ReportsApi::
        generateGoodsMovementReport(
            
            GenerateGoodsMovementReportRequest generateGoodsMovementReportRequest
            , 
            
            ReportFormatType format
            
        )
        {
            std::string url = basepath + "/reports/goods-movement/generate"; //


            // Headers  | 

            // Query    | format 
            addQueryParam("format",format);

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | generateGoodsMovementReportRequest



            payload = generateGoodsMovementReportRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GenerateReportResponse obj(output_string);


            Response<GenerateReportResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GenerateReportResponse
        >
        ReportsApi::
        generateGoodsRealizationReport(
            
            GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest
            , 
            
            ReportFormatType format
            
        )
        {
            std::string url = basepath + "/reports/goods-realization/generate"; //


            // Headers  | 

            // Query    | format 
            addQueryParam("format",format);

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | generateGoodsRealizationReportRequest



            payload = generateGoodsRealizationReportRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GenerateReportResponse obj(output_string);


            Response<GenerateReportResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GenerateReportResponse
        >
        ReportsApi::
        generateGoodsTurnoverReport(
            
            GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest
            , 
            
            ReportFormatType format
            
        )
        {
            std::string url = basepath + "/reports/goods-turnover/generate"; //


            // Headers  | 

            // Query    | format 
            addQueryParam("format",format);

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | generateGoodsTurnoverRequest



            payload = generateGoodsTurnoverRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GenerateReportResponse obj(output_string);


            Response<GenerateReportResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GenerateReportResponse
        >
        ReportsApi::
        generateMassOrderLabelsReport(
            
            GenerateMassOrderLabelsRequest generateMassOrderLabelsRequest
            , 
            
            PageFormatType format
            
        )
        {
            std::string url = basepath + "/reports/documents/labels/generate"; //


            // Headers  | 

            // Query    | format 
            addQueryParam("format",format);

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | generateMassOrderLabelsRequest



            payload = generateMassOrderLabelsRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GenerateReportResponse obj(output_string);


            Response<GenerateReportResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GenerateReportResponse
        >
        ReportsApi::
        generatePricesReport(
            
            GeneratePricesReportRequest generatePricesReportRequest
            , 
            
            ReportFormatType format
            
        )
        {
            std::string url = basepath + "/reports/prices/generate"; //


            // Headers  | 

            // Query    | format 
            addQueryParam("format",format);

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | generatePricesReportRequest



            payload = generatePricesReportRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GenerateReportResponse obj(output_string);


            Response<GenerateReportResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GenerateReportResponse
        >
        ReportsApi::
        generateShelfsStatisticsReport(
            
            GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest
            , 
            
            ReportFormatType format
            
        )
        {
            std::string url = basepath + "/reports/shelf-statistics/generate"; //


            // Headers  | 

            // Query    | format 
            addQueryParam("format",format);

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | generateShelfsStatisticsRequest



            payload = generateShelfsStatisticsRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GenerateReportResponse obj(output_string);


            Response<GenerateReportResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GenerateReportResponse
        >
        ReportsApi::
        generateShipmentListDocumentReport(
            
            GenerateShipmentListDocumentReportRequest generateShipmentListDocumentReportRequest
            
        )
        {
            std::string url = basepath + "/reports/documents/shipment-list/generate"; //


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | generateShipmentListDocumentReportRequest



            payload = generateShipmentListDocumentReportRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GenerateReportResponse obj(output_string);


            Response<GenerateReportResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GenerateReportResponse
        >
        ReportsApi::
        generateShowsSalesReport(
            
            GenerateShowsSalesReportRequest generateShowsSalesReportRequest
            , 
            
            ReportFormatType format
            
        )
        {
            std::string url = basepath + "/reports/shows-sales/generate"; //


            // Headers  | 

            // Query    | format 
            addQueryParam("format",format);

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | generateShowsSalesReportRequest



            payload = generateShowsSalesReportRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GenerateReportResponse obj(output_string);


            Response<GenerateReportResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GenerateReportResponse
        >
        ReportsApi::
        generateStocksOnWarehousesReport(
            
            GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest
            , 
            
            ReportFormatType format
            
        )
        {
            std::string url = basepath + "/reports/stocks-on-warehouses/generate"; //


            // Headers  | 

            // Query    | format 
            addQueryParam("format",format);

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | generateStocksOnWarehousesReportRequest



            payload = generateStocksOnWarehousesReportRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GenerateReportResponse obj(output_string);


            Response<GenerateReportResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GenerateReportResponse
        >
        ReportsApi::
        generateUnitedMarketplaceServicesReport(
            
            GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest
            , 
            
            ReportFormatType format
            
        )
        {
            std::string url = basepath + "/reports/united-marketplace-services/generate"; //


            // Headers  | 

            // Query    | format 
            addQueryParam("format",format);

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | generateUnitedMarketplaceServicesReportRequest



            payload = generateUnitedMarketplaceServicesReportRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GenerateReportResponse obj(output_string);


            Response<GenerateReportResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GenerateReportResponse
        >
        ReportsApi::
        generateUnitedNettingReport(
            
            GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest
            , 
            
            ReportFormatType format
            
        )
        {
            std::string url = basepath + "/reports/united-netting/generate"; //


            // Headers  | 

            // Query    | format 
            addQueryParam("format",format);

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | generateUnitedNettingReportRequest



            payload = generateUnitedNettingReportRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GenerateReportResponse obj(output_string);


            Response<GenerateReportResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GenerateReportResponse
        >
        ReportsApi::
        generateUnitedOrdersReport(
            
            GenerateUnitedOrdersRequest generateUnitedOrdersRequest
            , 
            
            ReportFormatType format
            
        )
        {
            std::string url = basepath + "/reports/united-orders/generate"; //


            // Headers  | 

            // Query    | format 
            addQueryParam("format",format);

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | generateUnitedOrdersRequest



            payload = generateUnitedOrdersRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GenerateReportResponse obj(output_string);


            Response<GenerateReportResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetReportInfoResponse
        >
        ReportsApi::
        getReportInfo(
            
            std::string reportId
            
        )
        {
            std::string url = basepath + "/reports/info/{reportId}"; //reportId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_reportId("{");
                s_reportId.append("reportId");
                s_reportId.append("}");

                int pos = url.find(s_reportId);

                url.erase(pos, s_reportId.length());
                url.insert(pos, stringify(reportId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetReportInfoResponse obj(output_string);


            Response<GetReportInfoResponse> response(obj, httpCode);
            return response;
        }



