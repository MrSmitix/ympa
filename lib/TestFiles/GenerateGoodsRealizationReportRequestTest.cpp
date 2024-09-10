
#include "GenerateGoodsRealizationReportRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_GenerateGoodsRealizationReportRequest_campaignId_is_assigned_from_json()
{






    bourne::json input =
    {
        "campaignId", 1
    };

    GenerateGoodsRealizationReportRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCampaignId());


}


void test_GenerateGoodsRealizationReportRequest_year_is_assigned_from_json()
{
    bourne::json input =
    {
        "year", 1
    };

    GenerateGoodsRealizationReportRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getYear());








}


void test_GenerateGoodsRealizationReportRequest_month_is_assigned_from_json()
{
    bourne::json input =
    {
        "month", 1
    };

    GenerateGoodsRealizationReportRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMonth());








}



void test_GenerateGoodsRealizationReportRequest_campaignId_is_converted_to_json()
{



    bourne::json input =
    {
        "campaignId", 1
    };

    GenerateGoodsRealizationReportRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["campaignId"] == output["campaignId"]);

}


void test_GenerateGoodsRealizationReportRequest_year_is_converted_to_json()
{
    bourne::json input =
    {
        "year", 1
    };

    GenerateGoodsRealizationReportRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["year"] == output["year"]);




}


void test_GenerateGoodsRealizationReportRequest_month_is_converted_to_json()
{
    bourne::json input =
    {
        "month", 1
    };

    GenerateGoodsRealizationReportRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["month"] == output["month"]);




}


