#include "FbsApi.h"

using namespace Tiny;



        Response<
            EmptyApiResponse
        >
        FbsApi::
        addHiddenOffers(
            
            long campaignId
            , 
            
            AddHiddenOffersRequest addHiddenOffersRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/hidden-offers"; //campaignId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | addHiddenOffersRequest



            payload = addHiddenOffersRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }

        Response<
            AddOffersToArchiveResponse
        >
        FbsApi::
        addOffersToArchive(
            
            long businessId
            , 
            
            AddOffersToArchiveRequest addOffersToArchiveRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/offer-mappings/archive"; //businessId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | addOffersToArchiveRequest



            payload = addOffersToArchiveRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            AddOffersToArchiveResponse obj(output_string);


            Response<AddOffersToArchiveResponse> response(obj, httpCode);
            return response;
        }

        Response<
            CalculateTariffsResponse
        >
        FbsApi::
        calculateTariffs(
            
            CalculateTariffsRequest calculateTariffsRequest
            
        )
        {
            std::string url = basepath + "/tariffs/calculate"; //


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | calculateTariffsRequest



            payload = calculateTariffsRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CalculateTariffsResponse obj(output_string);


            Response<CalculateTariffsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        FbsApi::
        confirmBusinessPrices(
            
            long businessId
            , 
            
            ConfirmPricesRequest confirmPricesRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/price-quarantine/confirm"; //businessId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | confirmPricesRequest



            payload = confirmPricesRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        FbsApi::
        confirmCampaignPrices(
            
            long campaignId
            , 
            
            ConfirmPricesRequest confirmPricesRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/price-quarantine/confirm"; //campaignId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | confirmPricesRequest



            payload = confirmPricesRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        FbsApi::
        confirmShipment(
            
            long campaignId
            , 
            
            long shipmentId
            , 
            
            ConfirmShipmentRequest confirmShipmentRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm"; //campaignId shipmentId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_shipmentId("{");
                s_shipmentId.append("shipmentId");
                s_shipmentId.append("}");

                int pos = url.find(s_shipmentId);

                url.erase(pos, s_shipmentId.length());
                url.insert(pos, stringify(shipmentId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | confirmShipmentRequest



            payload = confirmShipmentRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }

        Response<
            CreateChatResponse
        >
        FbsApi::
        createChat(
            
            long businessId
            , 
            
            CreateChatRequest createChatRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/chats/new"; //businessId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | createChatRequest



            payload = createChatRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CreateChatResponse obj(output_string);


            Response<CreateChatResponse> response(obj, httpCode);
            return response;
        }

        Response<
            DeleteCampaignOffersResponse
        >
        FbsApi::
        deleteCampaignOffers(
            
            long campaignId
            , 
            
            DeleteCampaignOffersRequest deleteCampaignOffersRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/offers/delete"; //campaignId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | deleteCampaignOffersRequest



            payload = deleteCampaignOffersRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            DeleteCampaignOffersResponse obj(output_string);


            Response<DeleteCampaignOffersResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        FbsApi::
        deleteGoodsFeedbackComment(
            
            long businessId
            , 
            
            DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/goods-feedback/comments/delete"; //businessId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | deleteGoodsFeedbackCommentRequest



            payload = deleteGoodsFeedbackCommentRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        FbsApi::
        deleteHiddenOffers(
            
            long campaignId
            , 
            
            DeleteHiddenOffersRequest deleteHiddenOffersRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/hidden-offers/delete"; //campaignId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | deleteHiddenOffersRequest



            payload = deleteHiddenOffersRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }

        Response<
            DeleteOffersResponse
        >
        FbsApi::
        deleteOffers(
            
            long businessId
            , 
            
            DeleteOffersRequest deleteOffersRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/offer-mappings/delete"; //businessId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | deleteOffersRequest



            payload = deleteOffersRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            DeleteOffersResponse obj(output_string);


            Response<DeleteOffersResponse> response(obj, httpCode);
            return response;
        }

        Response<
            DeleteOffersFromArchiveResponse
        >
        FbsApi::
        deleteOffersFromArchive(
            
            long businessId
            , 
            
            DeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/offer-mappings/unarchive"; //businessId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | deleteOffersFromArchiveRequest



            payload = deleteOffersFromArchiveRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            DeleteOffersFromArchiveResponse obj(output_string);


            Response<DeleteOffersFromArchiveResponse> response(obj, httpCode);
            return response;
        }

        Response<
            DeletePromoOffersResponse
        >
        FbsApi::
        deletePromoOffers(
            
            long businessId
            , 
            
            DeletePromoOffersRequest deletePromoOffersRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/promos/offers/delete"; //businessId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | deletePromoOffersRequest



            payload = deletePromoOffersRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            DeletePromoOffersResponse obj(output_string);


            Response<DeletePromoOffersResponse> response(obj, httpCode);
            return response;
        }

        Response<
            std::string
        >
        FbsApi::
        downloadShipmentAct(
            
            long campaignId
            , 
            
            long shipmentId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act"; //campaignId shipmentId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_shipmentId("{");
                s_shipmentId.append("shipmentId");
                s_shipmentId.append("}");

                int pos = url.find(s_shipmentId);

                url.erase(pos, s_shipmentId.length());
                url.insert(pos, stringify(shipmentId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();



            bourne::json jsonPayload(output_string);
            std::string obj;
            jsonToValue(&obj, jsonPayload, "std::string");



            Response<std::string> response(obj, httpCode);
            return response;
        }

        Response<
            std::string
        >
        FbsApi::
        downloadShipmentDiscrepancyAct(
            
            long campaignId
            , 
            
            long shipmentId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act"; //campaignId shipmentId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_shipmentId("{");
                s_shipmentId.append("shipmentId");
                s_shipmentId.append("}");

                int pos = url.find(s_shipmentId);

                url.erase(pos, s_shipmentId.length());
                url.insert(pos, stringify(shipmentId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();



            bourne::json jsonPayload(output_string);
            std::string obj;
            jsonToValue(&obj, jsonPayload, "std::string");



            Response<std::string> response(obj, httpCode);
            return response;
        }

        Response<
            std::string
        >
        FbsApi::
        downloadShipmentInboundAct(
            
            long campaignId
            , 
            
            long shipmentId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act"; //campaignId shipmentId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_shipmentId("{");
                s_shipmentId.append("shipmentId");
                s_shipmentId.append("}");

                int pos = url.find(s_shipmentId);

                url.erase(pos, s_shipmentId.length());
                url.insert(pos, stringify(shipmentId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();



            bourne::json jsonPayload(output_string);
            std::string obj;
            jsonToValue(&obj, jsonPayload, "std::string");



            Response<std::string> response(obj, httpCode);
            return response;
        }

        Response<
            std::string
        >
        FbsApi::
        downloadShipmentPalletLabels(
            
            long campaignId
            , 
            
            long shipmentId
            , 
            
            ShipmentPalletLabelPageFormatType format
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels"; //campaignId shipmentId 


            // Headers  | 

            // Query    | format 
            addQueryParam("format",format);

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_shipmentId("{");
                s_shipmentId.append("shipmentId");
                s_shipmentId.append("}");

                int pos = url.find(s_shipmentId);

                url.erase(pos, s_shipmentId.length());
                url.insert(pos, stringify(shipmentId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();



            bourne::json jsonPayload(output_string);
            std::string obj;
            jsonToValue(&obj, jsonPayload, "std::string");



            Response<std::string> response(obj, httpCode);
            return response;
        }

        Response<
            std::string
        >
        FbsApi::
        downloadShipmentReceptionTransferAct(
            
            long campaignId
            , 
            
            int warehouseId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/shipments/reception-transfer-act"; //campaignId 


            // Headers  | 

            // Query    | warehouseId 
            addQueryParam("warehouse_id",warehouseId);

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();



            bourne::json jsonPayload(output_string);
            std::string obj;
            jsonToValue(&obj, jsonPayload, "std::string");



            Response<std::string> response(obj, httpCode);
            return response;
        }

        Response<
            std::string
        >
        FbsApi::
        downloadShipmentTransportationWaybill(
            
            long campaignId
            , 
            
            long shipmentId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill"; //campaignId shipmentId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_shipmentId("{");
                s_shipmentId.append("shipmentId");
                s_shipmentId.append("}");

                int pos = url.find(s_shipmentId);

                url.erase(pos, s_shipmentId.length());
                url.insert(pos, stringify(shipmentId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();



            bourne::json jsonPayload(output_string);
            std::string obj;
            jsonToValue(&obj, jsonPayload, "std::string");



            Response<std::string> response(obj, httpCode);
            return response;
        }

        Response<
            GenerateReportResponse
        >
        FbsApi::
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
        FbsApi::
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
        FbsApi::
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
        FbsApi::
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
        FbsApi::
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
            std::string
        >
        FbsApi::
        generateOrderLabel(
            
            long campaignId
            , 
            
            long orderId
            , 
            
            long shipmentId
            , 
            
            long boxId
            , 
            
            PageFormatType format
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label"; //campaignId orderId shipmentId boxId 


            // Headers  | 

            // Query    | format 
            addQueryParam("format",format);

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_orderId("{");
                s_orderId.append("orderId");
                s_orderId.append("}");

                int pos = url.find(s_orderId);

                url.erase(pos, s_orderId.length());
                url.insert(pos, stringify(orderId));
                std::string s_shipmentId("{");
                s_shipmentId.append("shipmentId");
                s_shipmentId.append("}");

                int pos = url.find(s_shipmentId);

                url.erase(pos, s_shipmentId.length());
                url.insert(pos, stringify(shipmentId));
                std::string s_boxId("{");
                s_boxId.append("boxId");
                s_boxId.append("}");

                int pos = url.find(s_boxId);

                url.erase(pos, s_boxId.length());
                url.insert(pos, stringify(boxId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();



            bourne::json jsonPayload(output_string);
            std::string obj;
            jsonToValue(&obj, jsonPayload, "std::string");



            Response<std::string> response(obj, httpCode);
            return response;
        }

        Response<
            std::string
        >
        FbsApi::
        generateOrderLabels(
            
            long campaignId
            , 
            
            long orderId
            , 
            
            PageFormatType format
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}/delivery/labels"; //campaignId orderId 


            // Headers  | 

            // Query    | format 
            addQueryParam("format",format);

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_orderId("{");
                s_orderId.append("orderId");
                s_orderId.append("}");

                int pos = url.find(s_orderId);

                url.erase(pos, s_orderId.length());
                url.insert(pos, stringify(orderId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();



            bourne::json jsonPayload(output_string);
            std::string obj;
            jsonToValue(&obj, jsonPayload, "std::string");



            Response<std::string> response(obj, httpCode);
            return response;
        }

        Response<
            GenerateReportResponse
        >
        FbsApi::
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
        FbsApi::
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
        FbsApi::
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
        FbsApi::
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
        FbsApi::
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
        FbsApi::
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
        FbsApi::
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
        FbsApi::
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
            GetAllOffersResponse
        >
        FbsApi::
        getAllOffers(
            
            long campaignId
            , 
            
            long feedId
            , 
            
            int chunk
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/offers/all"; //campaignId 


            // Headers  | 

            // Query    | feedId chunk 
            addQueryParam("feedId",feedId);
            addQueryParam("chunk",chunk);

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetAllOffersResponse obj(output_string);


            Response<GetAllOffersResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetBidsInfoResponse
        >
        FbsApi::
        getBidsInfoForBusiness(
            
            long businessId
            , 
            
            std::string pageToken
            , 
            
            int limit
            , 
            
            GetBidsInfoRequest getBidsInfoRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/bids/info"; //businessId 


            // Headers  | 

            // Query    | pageToken limit 
            addQueryParam("page_token",pageToken);
            addQueryParam("limit",limit);

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | getBidsInfoRequest



            payload = getBidsInfoRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetBidsInfoResponse obj(output_string);


            Response<GetBidsInfoResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetBidsRecommendationsResponse
        >
        FbsApi::
        getBidsRecommendations(
            
            long businessId
            , 
            
            GetBidsRecommendationsRequest getBidsRecommendationsRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/bids/recommendations"; //businessId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | getBidsRecommendationsRequest



            payload = getBidsRecommendationsRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetBidsRecommendationsResponse obj(output_string);


            Response<GetBidsRecommendationsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetQuarantineOffersResponse
        >
        FbsApi::
        getBusinessQuarantineOffers(
            
            long businessId
            , 
            
            GetQuarantineOffersRequest getQuarantineOffersRequest
            , 
            
            std::string pageToken
            , 
            
            int limit
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/price-quarantine"; //businessId 


            // Headers  | 

            // Query    | pageToken limit 
            addQueryParam("page_token",pageToken);
            addQueryParam("limit",limit);

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | getQuarantineOffersRequest



            payload = getQuarantineOffersRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetQuarantineOffersResponse obj(output_string);


            Response<GetQuarantineOffersResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetBusinessSettingsResponse
        >
        FbsApi::
        getBusinessSettings(
            
            long businessId
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/settings"; //businessId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetBusinessSettingsResponse obj(output_string);


            Response<GetBusinessSettingsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetCampaignResponse
        >
        FbsApi::
        getCampaign(
            
            long campaignId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}"; //campaignId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetCampaignResponse obj(output_string);


            Response<GetCampaignResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetCampaignLoginsResponse
        >
        FbsApi::
        getCampaignLogins(
            
            long campaignId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/logins"; //campaignId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetCampaignLoginsResponse obj(output_string);


            Response<GetCampaignLoginsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetCampaignOffersResponse
        >
        FbsApi::
        getCampaignOffers(
            
            long campaignId
            , 
            
            GetCampaignOffersRequest getCampaignOffersRequest
            , 
            
            std::string pageToken
            , 
            
            int limit
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/offers"; //campaignId 


            // Headers  | 

            // Query    | pageToken limit 
            addQueryParam("page_token",pageToken);
            addQueryParam("limit",limit);

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | getCampaignOffersRequest



            payload = getCampaignOffersRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetCampaignOffersResponse obj(output_string);


            Response<GetCampaignOffersResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetQuarantineOffersResponse
        >
        FbsApi::
        getCampaignQuarantineOffers(
            
            long campaignId
            , 
            
            GetQuarantineOffersRequest getQuarantineOffersRequest
            , 
            
            std::string pageToken
            , 
            
            int limit
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/price-quarantine"; //campaignId 


            // Headers  | 

            // Query    | pageToken limit 
            addQueryParam("page_token",pageToken);
            addQueryParam("limit",limit);

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | getQuarantineOffersRequest



            payload = getQuarantineOffersRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetQuarantineOffersResponse obj(output_string);


            Response<GetQuarantineOffersResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetCampaignRegionResponse
        >
        FbsApi::
        getCampaignRegion(
            
            long campaignId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/region"; //campaignId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetCampaignRegionResponse obj(output_string);


            Response<GetCampaignRegionResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetCampaignSettingsResponse
        >
        FbsApi::
        getCampaignSettings(
            
            long campaignId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/settings"; //campaignId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetCampaignSettingsResponse obj(output_string);


            Response<GetCampaignSettingsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetCampaignsResponse
        >
        FbsApi::
        getCampaigns(
            
            int page
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/campaigns"; //


            // Headers  | 

            // Query    | page pageSize 
            addQueryParam("page",page);
            addQueryParam("pageSize",pageSize);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetCampaignsResponse obj(output_string);


            Response<GetCampaignsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetCampaignsResponse
        >
        FbsApi::
        getCampaignsByLogin(
            
            std::string login
            , 
            
            int page
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/campaigns/by_login/{login}"; //login 


            // Headers  | 

            // Query    | page pageSize 
            addQueryParam("page",page);
            addQueryParam("pageSize",pageSize);

            // Form     | 



                std::string s_login("{");
                s_login.append("login");
                s_login.append("}");

                int pos = url.find(s_login);

                url.erase(pos, s_login.length());
                url.insert(pos, stringify(login));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetCampaignsResponse obj(output_string);


            Response<GetCampaignsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetCategoriesMaxSaleQuantumResponse
        >
        FbsApi::
        getCategoriesMaxSaleQuantum(
            
            GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest
            
        )
        {
            std::string url = basepath + "/categories/max-sale-quantum"; //


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | getCategoriesMaxSaleQuantumRequest



            payload = getCategoriesMaxSaleQuantumRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetCategoriesMaxSaleQuantumResponse obj(output_string);


            Response<GetCategoriesMaxSaleQuantumResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetCategoriesResponse
        >
        FbsApi::
        getCategoriesTree(
            
            GetCategoriesRequest getCategoriesRequest
            
        )
        {
            std::string url = basepath + "/categories/tree"; //


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | getCategoriesRequest



            payload = getCategoriesRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetCategoriesResponse obj(output_string);


            Response<GetCategoriesResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetCategoryContentParametersResponse
        >
        FbsApi::
        getCategoryContentParameters(
            
            long categoryId
            
        )
        {
            std::string url = basepath + "/category/{categoryId}/parameters"; //categoryId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_categoryId("{");
                s_categoryId.append("categoryId");
                s_categoryId.append("}");

                int pos = url.find(s_categoryId);

                url.erase(pos, s_categoryId.length());
                url.insert(pos, stringify(categoryId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetCategoryContentParametersResponse obj(output_string);


            Response<GetCategoryContentParametersResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetChatHistoryResponse
        >
        FbsApi::
        getChatHistory(
            
            long businessId
            , 
            
            long chatId
            , 
            
            GetChatHistoryRequest getChatHistoryRequest
            , 
            
            std::string pageToken
            , 
            
            int limit
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/chats/history"; //businessId 


            // Headers  | 

            // Query    | chatId pageToken limit 
            addQueryParam("chatId",chatId);
            addQueryParam("page_token",pageToken);
            addQueryParam("limit",limit);

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | getChatHistoryRequest



            payload = getChatHistoryRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetChatHistoryResponse obj(output_string);


            Response<GetChatHistoryResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetChatsResponse
        >
        FbsApi::
        getChats(
            
            long businessId
            , 
            
            GetChatsRequest getChatsRequest
            , 
            
            std::string pageToken
            , 
            
            int limit
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/chats"; //businessId 


            // Headers  | 

            // Query    | pageToken limit 
            addQueryParam("page_token",pageToken);
            addQueryParam("limit",limit);

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | getChatsRequest



            payload = getChatsRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetChatsResponse obj(output_string);


            Response<GetChatsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetDeliveryServicesResponse
        >
        FbsApi::
        getDeliveryServices(
        )
        {
            std::string url = basepath + "/delivery/services"; //


            // Headers  | 

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetDeliveryServicesResponse obj(output_string);


            Response<GetDeliveryServicesResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetFeedResponse
        >
        FbsApi::
        getFeed(
            
            long campaignId
            , 
            
            long feedId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/feeds/{feedId}"; //campaignId feedId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_feedId("{");
                s_feedId.append("feedId");
                s_feedId.append("}");

                int pos = url.find(s_feedId);

                url.erase(pos, s_feedId.length());
                url.insert(pos, stringify(feedId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetFeedResponse obj(output_string);


            Response<GetFeedResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetFeedIndexLogsResponse
        >
        FbsApi::
        getFeedIndexLogs(
            
            long campaignId
            , 
            
            long feedId
            , 
            
            int limit
            , 
            
            std::string publishedTimeFrom
            , 
            
            std::string publishedTimeTo
            , 
            
            FeedIndexLogsStatusType status
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/feeds/{feedId}/index-logs"; //campaignId feedId 


            // Headers  | 

            // Query    | limit publishedTimeFrom publishedTimeTo status 
            addQueryParam("limit",limit);
            addQueryParam("published_time_from",publishedTimeFrom);
            addQueryParam("published_time_to",publishedTimeTo);
            addQueryParam("status",status);

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_feedId("{");
                s_feedId.append("feedId");
                s_feedId.append("}");

                int pos = url.find(s_feedId);

                url.erase(pos, s_feedId.length());
                url.insert(pos, stringify(feedId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetFeedIndexLogsResponse obj(output_string);


            Response<GetFeedIndexLogsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetFeedbackListResponse
        >
        FbsApi::
        getFeedbackAndCommentUpdates(
            
            long campaignId
            , 
            
            std::string pageToken
            , 
            
            int limit
            , 
            
            Date fromDate
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/feedback/updates"; //campaignId 


            // Headers  | 

            // Query    | pageToken limit fromDate 
            addQueryParam("page_token",pageToken);
            addQueryParam("limit",limit);
            addQueryParam("from_date",fromDate);

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetFeedbackListResponse obj(output_string);


            Response<GetFeedbackListResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetFeedsResponse
        >
        FbsApi::
        getFeeds(
            
            long campaignId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/feeds"; //campaignId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetFeedsResponse obj(output_string);


            Response<GetFeedsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetGoodsFeedbackCommentsResponse
        >
        FbsApi::
        getGoodsFeedbackComments(
            
            long businessId
            , 
            
            GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest
            , 
            
            std::string pageToken
            , 
            
            int limit
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/goods-feedback/comments"; //businessId 


            // Headers  | 

            // Query    | pageToken limit 
            addQueryParam("page_token",pageToken);
            addQueryParam("limit",limit);

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | getGoodsFeedbackCommentsRequest



            payload = getGoodsFeedbackCommentsRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetGoodsFeedbackCommentsResponse obj(output_string);


            Response<GetGoodsFeedbackCommentsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetGoodsFeedbackResponse
        >
        FbsApi::
        getGoodsFeedbacks(
            
            long businessId
            , 
            
            std::string pageToken
            , 
            
            int limit
            , 
            
            GetGoodsFeedbackRequest getGoodsFeedbackRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/goods-feedback"; //businessId 


            // Headers  | 

            // Query    | pageToken limit 
            addQueryParam("page_token",pageToken);
            addQueryParam("limit",limit);

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | getGoodsFeedbackRequest



            payload = getGoodsFeedbackRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetGoodsFeedbackResponse obj(output_string);


            Response<GetGoodsFeedbackResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetGoodsStatsResponse
        >
        FbsApi::
        getGoodsStats(
            
            long campaignId
            , 
            
            GetGoodsStatsRequest getGoodsStatsRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/stats/skus"; //campaignId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | getGoodsStatsRequest



            payload = getGoodsStatsRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetGoodsStatsResponse obj(output_string);


            Response<GetGoodsStatsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetHiddenOffersResponse
        >
        FbsApi::
        getHiddenOffers(
            
            long campaignId
            , 
            std::list<std::string> offerId
            
            , 
            
            std::string pageToken
            , 
            
            int limit
            , 
            
            int offset
            , 
            
            int page
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/hidden-offers"; //campaignId 


            // Headers  | 

            // Query    | offerId pageToken limit offset page pageSize 
            for (auto &x : offerId){
                addQueryParam("offer_id", std::string(x));
            }
            addQueryParam("page_token",pageToken);
            addQueryParam("limit",limit);
            addQueryParam("offset",offset);
            addQueryParam("page",page);
            addQueryParam("pageSize",pageSize);

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetHiddenOffersResponse obj(output_string);


            Response<GetHiddenOffersResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetOfferCardsContentStatusResponse
        >
        FbsApi::
        getOfferCardsContentStatus(
            
            long businessId
            , 
            
            std::string pageToken
            , 
            
            int limit
            , 
            
            GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/offer-cards"; //businessId 


            // Headers  | 

            // Query    | pageToken limit 
            addQueryParam("page_token",pageToken);
            addQueryParam("limit",limit);

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | getOfferCardsContentStatusRequest



            payload = getOfferCardsContentStatusRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetOfferCardsContentStatusResponse obj(output_string);


            Response<GetOfferCardsContentStatusResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetOfferMappingEntriesResponse
        >
        FbsApi::
        getOfferMappingEntries(
            
            long campaignId
            , 
            std::list<std::string> offerId
            
            , 
            std::list<std::string> shopSku
            
            , 
            
            OfferMappingKindType mappingKind
            , 
            std::list<OfferProcessingStatusType> status
            
            , 
            std::list<OfferAvailabilityStatusType> availability
            
            , 
            std::list<int> categoryId
            
            , 
            std::list<std::string> vendor
            
            , 
            
            std::string pageToken
            , 
            
            int limit
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/offer-mapping-entries"; //campaignId 


            // Headers  | 

            // Query    | offerId shopSku mappingKind status availability categoryId vendor pageToken limit 
            for (auto &x : offerId){
                addQueryParam("offer_id", std::string(x));
            }
            for (auto &x : shopSku){
                addQueryParam("shop_sku", std::string(x));
            }
            addQueryParam("mapping_kind",mappingKind);
            for (auto &x : status){
                addQueryParam("status", std::string(x));
            }
            for (auto &x : availability){
                addQueryParam("availability", std::string(x));
            }
            for (auto &x : categoryId){
                addQueryParam("category_id", std::string(x));
            }
            for (auto &x : vendor){
                addQueryParam("vendor", std::string(x));
            }
            addQueryParam("page_token",pageToken);
            addQueryParam("limit",limit);

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetOfferMappingEntriesResponse obj(output_string);


            Response<GetOfferMappingEntriesResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetOfferMappingsResponse
        >
        FbsApi::
        getOfferMappings(
            
            long businessId
            , 
            
            std::string pageToken
            , 
            
            int limit
            , 
            
            GetOfferMappingsRequest getOfferMappingsRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/offer-mappings"; //businessId 


            // Headers  | 

            // Query    | pageToken limit 
            addQueryParam("page_token",pageToken);
            addQueryParam("limit",limit);

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | getOfferMappingsRequest



            payload = getOfferMappingsRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetOfferMappingsResponse obj(output_string);


            Response<GetOfferMappingsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetOfferRecommendationsResponse
        >
        FbsApi::
        getOfferRecommendations(
            
            long businessId
            , 
            
            GetOfferRecommendationsRequest getOfferRecommendationsRequest
            , 
            
            std::string pageToken
            , 
            
            int limit
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/offers/recommendations"; //businessId 


            // Headers  | 

            // Query    | pageToken limit 
            addQueryParam("page_token",pageToken);
            addQueryParam("limit",limit);

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | getOfferRecommendationsRequest



            payload = getOfferRecommendationsRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetOfferRecommendationsResponse obj(output_string);


            Response<GetOfferRecommendationsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetOffersResponse
        >
        FbsApi::
        getOffers(
            
            long campaignId
            , 
            
            std::string query
            , 
            
            long feedId
            , 
            
            std::string shopCategoryId
            , 
            
            CurrencyType currency
            , 
            
            bool matched
            , 
            
            int page
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/offers"; //campaignId 


            // Headers  | 

            // Query    | query feedId shopCategoryId currency matched page pageSize 
            addQueryParam("query",query);
            addQueryParam("feedId",feedId);
            addQueryParam("shopCategoryId",shopCategoryId);
            addQueryParam("currency",currency);
            addQueryParam("matched",matched);
            addQueryParam("page",page);
            addQueryParam("pageSize",pageSize);

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetOffersResponse obj(output_string);


            Response<GetOffersResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetOrderResponse
        >
        FbsApi::
        getOrder(
            
            long campaignId
            , 
            
            long orderId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}"; //campaignId orderId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_orderId("{");
                s_orderId.append("orderId");
                s_orderId.append("}");

                int pos = url.find(s_orderId);

                url.erase(pos, s_orderId.length());
                url.insert(pos, stringify(orderId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetOrderResponse obj(output_string);


            Response<GetOrderResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetBusinessBuyerInfoResponse
        >
        FbsApi::
        getOrderBusinessBuyerInfo(
            
            long campaignId
            , 
            
            long orderId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}/business-buyer"; //campaignId orderId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_orderId("{");
                s_orderId.append("orderId");
                s_orderId.append("}");

                int pos = url.find(s_orderId);

                url.erase(pos, s_orderId.length());
                url.insert(pos, stringify(orderId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetBusinessBuyerInfoResponse obj(output_string);


            Response<GetBusinessBuyerInfoResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetBusinessDocumentsInfoResponse
        >
        FbsApi::
        getOrderBusinessDocumentsInfo(
            
            long campaignId
            , 
            
            long orderId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}/documents"; //campaignId orderId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_orderId("{");
                s_orderId.append("orderId");
                s_orderId.append("}");

                int pos = url.find(s_orderId);

                url.erase(pos, s_orderId.length());
                url.insert(pos, stringify(orderId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetBusinessDocumentsInfoResponse obj(output_string);


            Response<GetBusinessDocumentsInfoResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetOrderLabelsDataResponse
        >
        FbsApi::
        getOrderLabelsData(
            
            long campaignId
            , 
            
            long orderId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data"; //campaignId orderId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_orderId("{");
                s_orderId.append("orderId");
                s_orderId.append("}");

                int pos = url.find(s_orderId);

                url.erase(pos, s_orderId.length());
                url.insert(pos, stringify(orderId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetOrderLabelsDataResponse obj(output_string);


            Response<GetOrderLabelsDataResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetOrdersResponse
        >
        FbsApi::
        getOrders(
            
            long campaignId
            , 
            std::list<long> orderIds
            
            , 
            Set<OrderStatusType> status
            
            , 
            Set<OrderSubstatusType> substatus
            
            , 
            
            Date fromDate
            , 
            
            Date toDate
            , 
            
            Date supplierShipmentDateFrom
            , 
            
            Date supplierShipmentDateTo
            , 
            
            std::string updatedAtFrom
            , 
            
            std::string updatedAtTo
            , 
            
            OrderDeliveryDispatchType dispatchType
            , 
            
            bool fake
            , 
            
            bool hasCis
            , 
            
            bool onlyWaitingForCancellationApprove
            , 
            
            bool onlyEstimatedDelivery
            , 
            
            OrderBuyerType buyerType
            , 
            
            int page
            , 
            
            int pageSize
            , 
            
            std::string pageToken
            , 
            
            int limit
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders"; //campaignId 


            // Headers  | 

            // Query    | orderIds status substatus fromDate toDate supplierShipmentDateFrom supplierShipmentDateTo updatedAtFrom updatedAtTo dispatchType fake hasCis onlyWaitingForCancellationApprove onlyEstimatedDelivery buyerType page pageSize pageToken limit 
            for (auto &x : orderIds){
                addQueryParam("orderIds", std::string(x));
            }
            for (auto &x : status){
                addQueryParam("status", std::string(x));
            }
            for (auto &x : substatus){
                addQueryParam("substatus", std::string(x));
            }
            addQueryParam("fromDate",fromDate);
            addQueryParam("toDate",toDate);
            addQueryParam("supplierShipmentDateFrom",supplierShipmentDateFrom);
            addQueryParam("supplierShipmentDateTo",supplierShipmentDateTo);
            addQueryParam("updatedAtFrom",updatedAtFrom);
            addQueryParam("updatedAtTo",updatedAtTo);
            addQueryParam("dispatchType",dispatchType);
            addQueryParam("fake",fake);
            addQueryParam("hasCis",hasCis);
            addQueryParam("onlyWaitingForCancellationApprove",onlyWaitingForCancellationApprove);
            addQueryParam("onlyEstimatedDelivery",onlyEstimatedDelivery);
            addQueryParam("buyerType",buyerType);
            addQueryParam("page",page);
            addQueryParam("pageSize",pageSize);
            addQueryParam("page_token",pageToken);
            addQueryParam("limit",limit);

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetOrdersResponse obj(output_string);


            Response<GetOrdersResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetOrdersStatsResponse
        >
        FbsApi::
        getOrdersStats(
            
            long campaignId
            , 
            
            std::string pageToken
            , 
            
            int limit
            , 
            
            GetOrdersStatsRequest getOrdersStatsRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/stats/orders"; //campaignId 


            // Headers  | 

            // Query    | pageToken limit 
            addQueryParam("page_token",pageToken);
            addQueryParam("limit",limit);

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | getOrdersStatsRequest



            payload = getOrdersStatsRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetOrdersStatsResponse obj(output_string);


            Response<GetOrdersStatsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetPricesResponse
        >
        FbsApi::
        getPrices(
            
            long campaignId
            , 
            
            std::string pageToken
            , 
            
            int limit
            , 
            
            bool archived
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/offer-prices"; //campaignId 


            // Headers  | 

            // Query    | pageToken limit archived 
            addQueryParam("page_token",pageToken);
            addQueryParam("limit",limit);
            addQueryParam("archived",archived);

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetPricesResponse obj(output_string);


            Response<GetPricesResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetPricesByOfferIdsResponse
        >
        FbsApi::
        getPricesByOfferIds(
            
            long campaignId
            , 
            
            std::string pageToken
            , 
            
            int limit
            , 
            
            GetPricesByOfferIdsRequest getPricesByOfferIdsRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/offer-prices"; //campaignId 


            // Headers  | 

            // Query    | pageToken limit 
            addQueryParam("page_token",pageToken);
            addQueryParam("limit",limit);

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | getPricesByOfferIdsRequest



            payload = getPricesByOfferIdsRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetPricesByOfferIdsResponse obj(output_string);


            Response<GetPricesByOfferIdsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetPromoOffersResponse
        >
        FbsApi::
        getPromoOffers(
            
            long businessId
            , 
            
            GetPromoOffersRequest getPromoOffersRequest
            , 
            
            std::string pageToken
            , 
            
            int limit
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/promos/offers"; //businessId 


            // Headers  | 

            // Query    | pageToken limit 
            addQueryParam("page_token",pageToken);
            addQueryParam("limit",limit);

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | getPromoOffersRequest



            payload = getPromoOffersRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetPromoOffersResponse obj(output_string);


            Response<GetPromoOffersResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetPromosResponse
        >
        FbsApi::
        getPromos(
            
            long businessId
            , 
            
            GetPromosRequest getPromosRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/promos"; //businessId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | getPromosRequest



            payload = getPromosRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetPromosResponse obj(output_string);


            Response<GetPromosResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetQualityRatingDetailsResponse
        >
        FbsApi::
        getQualityRatingDetails(
            
            long campaignId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/ratings/quality/details"; //campaignId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetQualityRatingDetailsResponse obj(output_string);


            Response<GetQualityRatingDetailsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetQualityRatingResponse
        >
        FbsApi::
        getQualityRatings(
            
            long businessId
            , 
            
            GetQualityRatingRequest getQualityRatingRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/ratings/quality"; //businessId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | getQualityRatingRequest



            payload = getQualityRatingRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetQualityRatingResponse obj(output_string);


            Response<GetQualityRatingResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetReportInfoResponse
        >
        FbsApi::
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

        Response<
            GetReturnResponse
        >
        FbsApi::
        getReturn(
            
            long campaignId
            , 
            
            long orderId
            , 
            
            long returnId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}"; //campaignId orderId returnId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_orderId("{");
                s_orderId.append("orderId");
                s_orderId.append("}");

                int pos = url.find(s_orderId);

                url.erase(pos, s_orderId.length());
                url.insert(pos, stringify(orderId));
                std::string s_returnId("{");
                s_returnId.append("returnId");
                s_returnId.append("}");

                int pos = url.find(s_returnId);

                url.erase(pos, s_returnId.length());
                url.insert(pos, stringify(returnId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetReturnResponse obj(output_string);


            Response<GetReturnResponse> response(obj, httpCode);
            return response;
        }

        Response<
            std::string
        >
        FbsApi::
        getReturnApplication(
            
            long campaignId
            , 
            
            long orderId
            , 
            
            long returnId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application"; //campaignId orderId returnId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_orderId("{");
                s_orderId.append("orderId");
                s_orderId.append("}");

                int pos = url.find(s_orderId);

                url.erase(pos, s_orderId.length());
                url.insert(pos, stringify(orderId));
                std::string s_returnId("{");
                s_returnId.append("returnId");
                s_returnId.append("}");

                int pos = url.find(s_returnId);

                url.erase(pos, s_returnId.length());
                url.insert(pos, stringify(returnId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();



            bourne::json jsonPayload(output_string);
            std::string obj;
            jsonToValue(&obj, jsonPayload, "std::string");



            Response<std::string> response(obj, httpCode);
            return response;
        }

        Response<
            std::string
        >
        FbsApi::
        getReturnPhoto(
            
            long campaignId
            , 
            
            long orderId
            , 
            
            long returnId
            , 
            
            long itemId
            , 
            
            std::string imageHash
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}"; //campaignId orderId returnId itemId imageHash 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_orderId("{");
                s_orderId.append("orderId");
                s_orderId.append("}");

                int pos = url.find(s_orderId);

                url.erase(pos, s_orderId.length());
                url.insert(pos, stringify(orderId));
                std::string s_returnId("{");
                s_returnId.append("returnId");
                s_returnId.append("}");

                int pos = url.find(s_returnId);

                url.erase(pos, s_returnId.length());
                url.insert(pos, stringify(returnId));
                std::string s_itemId("{");
                s_itemId.append("itemId");
                s_itemId.append("}");

                int pos = url.find(s_itemId);

                url.erase(pos, s_itemId.length());
                url.insert(pos, stringify(itemId));
                std::string s_imageHash("{");
                s_imageHash.append("imageHash");
                s_imageHash.append("}");

                int pos = url.find(s_imageHash);

                url.erase(pos, s_imageHash.length());
                url.insert(pos, stringify(imageHash));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();



            bourne::json jsonPayload(output_string);
            std::string obj;
            jsonToValue(&obj, jsonPayload, "std::string");



            Response<std::string> response(obj, httpCode);
            return response;
        }

        Response<
            GetReturnsResponse
        >
        FbsApi::
        getReturns(
            
            long campaignId
            , 
            
            std::string pageToken
            , 
            
            int limit
            , 
            std::list<long> orderIds
            
            , 
            std::list<RefundStatusType> statuses
            
            , 
            
            ReturnType type
            , 
            
            Date fromDate
            , 
            
            Date toDate
            , 
            
            Date fromDate2
            , 
            
            Date toDate2
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/returns"; //campaignId 


            // Headers  | 

            // Query    | pageToken limit orderIds statuses type fromDate toDate fromDate2 toDate2 
            addQueryParam("page_token",pageToken);
            addQueryParam("limit",limit);
            for (auto &x : orderIds){
                addQueryParam("orderIds", std::string(x));
            }
            for (auto &x : statuses){
                addQueryParam("statuses", std::string(x));
            }
            addQueryParam("type",type);
            addQueryParam("fromDate",fromDate);
            addQueryParam("toDate",toDate);
            addQueryParam("from_date",fromDate2);
            addQueryParam("to_date",toDate2);

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetReturnsResponse obj(output_string);


            Response<GetReturnsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetShipmentResponse
        >
        FbsApi::
        getShipment(
            
            long campaignId
            , 
            
            long shipmentId
            , 
            
            bool cancelledOrders
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}"; //campaignId shipmentId 


            // Headers  | 

            // Query    | cancelledOrders 
            addQueryParam("cancelledOrders",cancelledOrders);

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_shipmentId("{");
                s_shipmentId.append("shipmentId");
                s_shipmentId.append("}");

                int pos = url.find(s_shipmentId);

                url.erase(pos, s_shipmentId.length());
                url.insert(pos, stringify(shipmentId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetShipmentResponse obj(output_string);


            Response<GetShipmentResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetShipmentOrdersInfoResponse
        >
        FbsApi::
        getShipmentOrdersInfo(
            
            long campaignId
            , 
            
            long shipmentId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info"; //campaignId shipmentId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_shipmentId("{");
                s_shipmentId.append("shipmentId");
                s_shipmentId.append("}");

                int pos = url.find(s_shipmentId);

                url.erase(pos, s_shipmentId.length());
                url.insert(pos, stringify(shipmentId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetShipmentOrdersInfoResponse obj(output_string);


            Response<GetShipmentOrdersInfoResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetWarehouseStocksResponse
        >
        FbsApi::
        getStocks(
            
            long campaignId
            , 
            
            std::string pageToken
            , 
            
            int limit
            , 
            
            GetWarehouseStocksRequest getWarehouseStocksRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/offers/stocks"; //campaignId 


            // Headers  | 

            // Query    | pageToken limit 
            addQueryParam("page_token",pageToken);
            addQueryParam("limit",limit);

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | getWarehouseStocksRequest



            payload = getWarehouseStocksRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetWarehouseStocksResponse obj(output_string);


            Response<GetWarehouseStocksResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetSuggestedOfferMappingEntriesResponse
        >
        FbsApi::
        getSuggestedOfferMappingEntries(
            
            long campaignId
            , 
            
            GetSuggestedOfferMappingEntriesRequest getSuggestedOfferMappingEntriesRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/offer-mapping-entries/suggestions"; //campaignId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | getSuggestedOfferMappingEntriesRequest



            payload = getSuggestedOfferMappingEntriesRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetSuggestedOfferMappingEntriesResponse obj(output_string);


            Response<GetSuggestedOfferMappingEntriesResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetSuggestedOfferMappingsResponse
        >
        FbsApi::
        getSuggestedOfferMappings(
            
            long businessId
            , 
            
            GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/offer-mappings/suggestions"; //businessId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | getSuggestedOfferMappingsRequest



            payload = getSuggestedOfferMappingsRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetSuggestedOfferMappingsResponse obj(output_string);


            Response<GetSuggestedOfferMappingsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            SuggestPricesResponse
        >
        FbsApi::
        getSuggestedPrices(
            
            long campaignId
            , 
            
            SuggestPricesRequest suggestPricesRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/offer-prices/suggestions"; //campaignId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | suggestPricesRequest



            payload = suggestPricesRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            SuggestPricesResponse obj(output_string);


            Response<SuggestPricesResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetWarehousesResponse
        >
        FbsApi::
        getWarehouses(
            
            long businessId
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/warehouses"; //businessId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetWarehousesResponse obj(output_string);


            Response<GetWarehousesResponse> response(obj, httpCode);
            return response;
        }

        Response<
            ProvideOrderItemIdentifiersResponse
        >
        FbsApi::
        provideOrderItemIdentifiers(
            
            long campaignId
            , 
            
            long orderId
            , 
            
            ProvideOrderItemIdentifiersRequest provideOrderItemIdentifiersRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}/identifiers"; //campaignId orderId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_orderId("{");
                s_orderId.append("orderId");
                s_orderId.append("}");

                int pos = url.find(s_orderId);

                url.erase(pos, s_orderId.length());
                url.insert(pos, stringify(orderId));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | provideOrderItemIdentifiersRequest



            payload = provideOrderItemIdentifiersRequest.toJson().dump();

            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ProvideOrderItemIdentifiersResponse obj(output_string);


            Response<ProvideOrderItemIdentifiersResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        FbsApi::
        putBidsForBusiness(
            
            long businessId
            , 
            
            PutSkuBidsRequest putSkuBidsRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/bids"; //businessId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | putSkuBidsRequest



            payload = putSkuBidsRequest.toJson().dump();

            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        FbsApi::
        putBidsForCampaign(
            
            long campaignId
            , 
            
            PutSkuBidsRequest putSkuBidsRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/bids"; //campaignId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | putSkuBidsRequest



            payload = putSkuBidsRequest.toJson().dump();

            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        FbsApi::
        refreshFeed(
            
            long campaignId
            , 
            
            long feedId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/feeds/{feedId}/refresh"; //campaignId feedId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_feedId("{");
                s_feedId.append("feedId");
                s_feedId.append("}");

                int pos = url.find(s_feedId);

                url.erase(pos, s_feedId.length());
                url.insert(pos, stringify(feedId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetRegionWithChildrenResponse
        >
        FbsApi::
        searchRegionChildren(
            
            long regionId
            , 
            
            int page
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/regions/{regionId}/children"; //regionId 


            // Headers  | 

            // Query    | page pageSize 
            addQueryParam("page",page);
            addQueryParam("pageSize",pageSize);

            // Form     | 



                std::string s_regionId("{");
                s_regionId.append("regionId");
                s_regionId.append("}");

                int pos = url.find(s_regionId);

                url.erase(pos, s_regionId.length());
                url.insert(pos, stringify(regionId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetRegionWithChildrenResponse obj(output_string);


            Response<GetRegionWithChildrenResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetRegionsResponse
        >
        FbsApi::
        searchRegionsById(
            
            long regionId
            
        )
        {
            std::string url = basepath + "/regions/{regionId}"; //regionId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_regionId("{");
                s_regionId.append("regionId");
                s_regionId.append("}");

                int pos = url.find(s_regionId);

                url.erase(pos, s_regionId.length());
                url.insert(pos, stringify(regionId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetRegionsResponse obj(output_string);


            Response<GetRegionsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetRegionsResponse
        >
        FbsApi::
        searchRegionsByName(
            
            std::string name
            , 
            
            std::string pageToken
            , 
            
            int limit
            
        )
        {
            std::string url = basepath + "/regions"; //


            // Headers  | 

            // Query    | name pageToken limit 
            addQueryParam("name",name);
            addQueryParam("page_token",pageToken);
            addQueryParam("limit",limit);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetRegionsResponse obj(output_string);


            Response<GetRegionsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            SearchShipmentsResponse
        >
        FbsApi::
        searchShipments(
            
            long campaignId
            , 
            
            SearchShipmentsRequest searchShipmentsRequest
            , 
            
            std::string pageToken
            , 
            
            int limit
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/first-mile/shipments"; //campaignId 


            // Headers  | 

            // Query    | pageToken limit 
            addQueryParam("page_token",pageToken);
            addQueryParam("limit",limit);

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | searchShipmentsRequest



            payload = searchShipmentsRequest.toJson().dump();

            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            SearchShipmentsResponse obj(output_string);


            Response<SearchShipmentsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        FbsApi::
        sendFileToChat(
            
            long businessId
            , 
            
            long chatId
            , 
            
            std::string file
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/chats/file/send"; //businessId 


            // Headers  | 

            // Query    | chatId 
            addQueryParam("chatId",chatId);

            // Form     | file 
            addHeader("Content-Type", "application/x-www-form-urlencoded");

            addFormParam("file",file);


                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        FbsApi::
        sendMessageToChat(
            
            long businessId
            , 
            
            long chatId
            , 
            
            SendMessageToChatRequest sendMessageToChatRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/chats/message"; //businessId 


            // Headers  | 

            // Query    | chatId 
            addQueryParam("chatId",chatId);

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | sendMessageToChatRequest



            payload = sendMessageToChatRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        FbsApi::
        setFeedParams(
            
            long campaignId
            , 
            
            long feedId
            , 
            
            SetFeedParamsRequest setFeedParamsRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/feeds/{feedId}/params"; //campaignId feedId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_feedId("{");
                s_feedId.append("feedId");
                s_feedId.append("}");

                int pos = url.find(s_feedId);

                url.erase(pos, s_feedId.length());
                url.insert(pos, stringify(feedId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | setFeedParamsRequest



            payload = setFeedParamsRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }

        Response<
            SetOrderBoxLayoutResponse
        >
        FbsApi::
        setOrderBoxLayout(
            
            long campaignId
            , 
            
            long orderId
            , 
            
            SetOrderBoxLayoutRequest setOrderBoxLayoutRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}/boxes"; //campaignId orderId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_orderId("{");
                s_orderId.append("orderId");
                s_orderId.append("}");

                int pos = url.find(s_orderId);

                url.erase(pos, s_orderId.length());
                url.insert(pos, stringify(orderId));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | setOrderBoxLayoutRequest



            payload = setOrderBoxLayoutRequest.toJson().dump();

            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            SetOrderBoxLayoutResponse obj(output_string);


            Response<SetOrderBoxLayoutResponse> response(obj, httpCode);
            return response;
        }

        Response<
            SetOrderShipmentBoxesResponse
        >
        FbsApi::
        setOrderShipmentBoxes(
            
            long campaignId
            , 
            
            long orderId
            , 
            
            long shipmentId
            , 
            
            SetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes"; //campaignId orderId shipmentId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_orderId("{");
                s_orderId.append("orderId");
                s_orderId.append("}");

                int pos = url.find(s_orderId);

                url.erase(pos, s_orderId.length());
                url.insert(pos, stringify(orderId));
                std::string s_shipmentId("{");
                s_shipmentId.append("shipmentId");
                s_shipmentId.append("}");

                int pos = url.find(s_shipmentId);

                url.erase(pos, s_shipmentId.length());
                url.insert(pos, stringify(shipmentId));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | setOrderShipmentBoxesRequest



            payload = setOrderShipmentBoxesRequest.toJson().dump();

            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            SetOrderShipmentBoxesResponse obj(output_string);


            Response<SetOrderShipmentBoxesResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        FbsApi::
        setShipmentPalletsCount(
            
            long campaignId
            , 
            
            long shipmentId
            , 
            
            SetShipmentPalletsCountRequest setShipmentPalletsCountRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets"; //campaignId shipmentId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_shipmentId("{");
                s_shipmentId.append("shipmentId");
                s_shipmentId.append("}");

                int pos = url.find(s_shipmentId);

                url.erase(pos, s_shipmentId.length());
                url.insert(pos, stringify(shipmentId));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | setShipmentPalletsCountRequest



            payload = setShipmentPalletsCountRequest.toJson().dump();

            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        FbsApi::
        skipGoodsFeedbacksReaction(
            
            long businessId
            , 
            
            SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/goods-feedback/skip-reaction"; //businessId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | skipGoodsFeedbackReactionRequest



            payload = skipGoodsFeedbackReactionRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        FbsApi::
        transferOrdersFromShipment(
            
            long campaignId
            , 
            
            long shipmentId
            , 
            
            TransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer"; //campaignId shipmentId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_shipmentId("{");
                s_shipmentId.append("shipmentId");
                s_shipmentId.append("}");

                int pos = url.find(s_shipmentId);

                url.erase(pos, s_shipmentId.length());
                url.insert(pos, stringify(shipmentId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | transferOrdersFromShipmentRequest



            payload = transferOrdersFromShipmentRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        FbsApi::
        updateBusinessPrices(
            
            long businessId
            , 
            
            UpdateBusinessPricesRequest updateBusinessPricesRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/offer-prices/updates"; //businessId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | updateBusinessPricesRequest



            payload = updateBusinessPricesRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        FbsApi::
        updateCampaignOffers(
            
            long campaignId
            , 
            
            UpdateCampaignOffersRequest updateCampaignOffersRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/offers/update"; //campaignId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | updateCampaignOffersRequest



            payload = updateCampaignOffersRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }

        Response<
            UpdateGoodsFeedbackCommentResponse
        >
        FbsApi::
        updateGoodsFeedbackComment(
            
            long businessId
            , 
            
            UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/goods-feedback/comments/update"; //businessId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | updateGoodsFeedbackCommentRequest



            payload = updateGoodsFeedbackCommentRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            UpdateGoodsFeedbackCommentResponse obj(output_string);


            Response<UpdateGoodsFeedbackCommentResponse> response(obj, httpCode);
            return response;
        }

        Response<
            UpdateOfferContentResponse
        >
        FbsApi::
        updateOfferContent(
            
            long businessId
            , 
            
            UpdateOfferContentRequest updateOfferContentRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/offer-cards/update"; //businessId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | updateOfferContentRequest



            payload = updateOfferContentRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            UpdateOfferContentResponse obj(output_string);


            Response<UpdateOfferContentResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        FbsApi::
        updateOfferMappingEntries(
            
            long campaignId
            , 
            
            UpdateOfferMappingEntryRequest updateOfferMappingEntryRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/offer-mapping-entries/updates"; //campaignId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | updateOfferMappingEntryRequest



            payload = updateOfferMappingEntryRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }

        Response<
            UpdateOfferMappingsResponse
        >
        FbsApi::
        updateOfferMappings(
            
            long businessId
            , 
            
            UpdateOfferMappingsRequest updateOfferMappingsRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/offer-mappings/update"; //businessId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | updateOfferMappingsRequest



            payload = updateOfferMappingsRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            UpdateOfferMappingsResponse obj(output_string);


            Response<UpdateOfferMappingsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            String
        >
        FbsApi::
        updateOrderItems(
            
            long campaignId
            , 
            
            long orderId
            , 
            
            UpdateOrderItemRequest updateOrderItemRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}/items"; //campaignId orderId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_orderId("{");
                s_orderId.append("orderId");
                s_orderId.append("}");

                int pos = url.find(s_orderId);

                url.erase(pos, s_orderId.length());
                url.insert(pos, stringify(orderId));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | updateOrderItemRequest



            payload = updateOrderItemRequest.toJson().dump();

            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            UpdateOrderStatusResponse
        >
        FbsApi::
        updateOrderStatus(
            
            long campaignId
            , 
            
            long orderId
            , 
            
            UpdateOrderStatusRequest updateOrderStatusRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}/status"; //campaignId orderId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_orderId("{");
                s_orderId.append("orderId");
                s_orderId.append("}");

                int pos = url.find(s_orderId);

                url.erase(pos, s_orderId.length());
                url.insert(pos, stringify(orderId));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | updateOrderStatusRequest



            payload = updateOrderStatusRequest.toJson().dump();

            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            UpdateOrderStatusResponse obj(output_string);


            Response<UpdateOrderStatusResponse> response(obj, httpCode);
            return response;
        }

        Response<
            UpdateOrderStatusesResponse
        >
        FbsApi::
        updateOrderStatuses(
            
            long campaignId
            , 
            
            UpdateOrderStatusesRequest updateOrderStatusesRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/status-update"; //campaignId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | updateOrderStatusesRequest



            payload = updateOrderStatusesRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            UpdateOrderStatusesResponse obj(output_string);


            Response<UpdateOrderStatusesResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        FbsApi::
        updatePrices(
            
            long campaignId
            , 
            
            UpdatePricesRequest updatePricesRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/offer-prices/updates"; //campaignId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | updatePricesRequest



            payload = updatePricesRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }

        Response<
            UpdatePromoOffersResponse
        >
        FbsApi::
        updatePromoOffers(
            
            long businessId
            , 
            
            UpdatePromoOffersRequest updatePromoOffersRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/promos/offers/update"; //businessId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | updatePromoOffersRequest



            payload = updatePromoOffersRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            UpdatePromoOffersResponse obj(output_string);


            Response<UpdatePromoOffersResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        FbsApi::
        updateStocks(
            
            long campaignId
            , 
            
            UpdateStocksRequest updateStocksRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/offers/stocks"; //campaignId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | updateStocksRequest



            payload = updateStocksRequest.toJson().dump();

            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }



