
#include "GenerateShipmentListDocumentReportRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_GenerateShipmentListDocumentReportRequest_campaignId_is_assigned_from_json()
{






    bourne::json input =
    {
        "campaignId", 1
    };

    GenerateShipmentListDocumentReportRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCampaignId());


}


void test_GenerateShipmentListDocumentReportRequest_shipmentId_is_assigned_from_json()
{






    bourne::json input =
    {
        "shipmentId", 1
    };

    GenerateShipmentListDocumentReportRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getShipmentId());


}




void test_GenerateShipmentListDocumentReportRequest_campaignId_is_converted_to_json()
{



    bourne::json input =
    {
        "campaignId", 1
    };

    GenerateShipmentListDocumentReportRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["campaignId"] == output["campaignId"]);

}


void test_GenerateShipmentListDocumentReportRequest_shipmentId_is_converted_to_json()
{



    bourne::json input =
    {
        "shipmentId", 1
    };

    GenerateShipmentListDocumentReportRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["shipmentId"] == output["shipmentId"]);

}



