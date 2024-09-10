
#include "GenerateShowsSalesReportRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_GenerateShowsSalesReportRequest_businessId_is_assigned_from_json()
{






    bourne::json input =
    {
        "businessId", 1
    };

    GenerateShowsSalesReportRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBusinessId());


}


void test_GenerateShowsSalesReportRequest_campaignId_is_assigned_from_json()
{






    bourne::json input =
    {
        "campaignId", 1
    };

    GenerateShowsSalesReportRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCampaignId());


}






void test_GenerateShowsSalesReportRequest_businessId_is_converted_to_json()
{



    bourne::json input =
    {
        "businessId", 1
    };

    GenerateShowsSalesReportRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["businessId"] == output["businessId"]);

}


void test_GenerateShowsSalesReportRequest_campaignId_is_converted_to_json()
{



    bourne::json input =
    {
        "campaignId", 1
    };

    GenerateShowsSalesReportRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["campaignId"] == output["campaignId"]);

}





