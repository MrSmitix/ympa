
#include "GenerateGoodsMovementReportRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_GenerateGoodsMovementReportRequest_campaignId_is_assigned_from_json()
{






    bourne::json input =
    {
        "campaignId", 1
    };

    GenerateGoodsMovementReportRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCampaignId());


}




void test_GenerateGoodsMovementReportRequest_shopSku_is_assigned_from_json()
{


    bourne::json input =
    {
        "shopSku", "hello"
    };

    GenerateGoodsMovementReportRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getShopSku().c_str());






}



void test_GenerateGoodsMovementReportRequest_campaignId_is_converted_to_json()
{



    bourne::json input =
    {
        "campaignId", 1
    };

    GenerateGoodsMovementReportRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["campaignId"] == output["campaignId"]);

}




void test_GenerateGoodsMovementReportRequest_shopSku_is_converted_to_json()
{

    bourne::json input =
    {
        "shopSku", "hello"
    };

    GenerateGoodsMovementReportRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["shopSku"] == output["shopSku"]);



}


