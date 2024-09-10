
#include "CampaignSettingsTimePeriodDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CampaignSettingsTimePeriodDTO_fromDate_is_assigned_from_json()
{


    bourne::json input =
    {
        "fromDate", "hello"
    };

    CampaignSettingsTimePeriodDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFromDate().c_str());






}


void test_CampaignSettingsTimePeriodDTO_toDate_is_assigned_from_json()
{


    bourne::json input =
    {
        "toDate", "hello"
    };

    CampaignSettingsTimePeriodDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getToDate().c_str());






}



void test_CampaignSettingsTimePeriodDTO_fromDate_is_converted_to_json()
{

    bourne::json input =
    {
        "fromDate", "hello"
    };

    CampaignSettingsTimePeriodDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["fromDate"] == output["fromDate"]);



}


void test_CampaignSettingsTimePeriodDTO_toDate_is_converted_to_json()
{

    bourne::json input =
    {
        "toDate", "hello"
    };

    CampaignSettingsTimePeriodDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["toDate"] == output["toDate"]);



}


