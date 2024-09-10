#include "ShipmentsApi.h"

using namespace Tiny;



        Response<
            EmptyApiResponse
        >
        ShipmentsApi::
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
            std::string
        >
        ShipmentsApi::
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
        ShipmentsApi::
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
        ShipmentsApi::
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
        ShipmentsApi::
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
        ShipmentsApi::
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
        ShipmentsApi::
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
            GetShipmentResponse
        >
        ShipmentsApi::
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
        ShipmentsApi::
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
            SearchShipmentsResponse
        >
        ShipmentsApi::
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
        ShipmentsApi::
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
        ShipmentsApi::
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



