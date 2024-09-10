
#include "OutletWorkingScheduleItemDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"





void test_OutletWorkingScheduleItemDTO_startTime_is_assigned_from_json()
{


    bourne::json input =
    {
        "startTime", "hello"
    };

    OutletWorkingScheduleItemDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStartTime().c_str());






}


void test_OutletWorkingScheduleItemDTO_endTime_is_assigned_from_json()
{


    bourne::json input =
    {
        "endTime", "hello"
    };

    OutletWorkingScheduleItemDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEndTime().c_str());






}





void test_OutletWorkingScheduleItemDTO_startTime_is_converted_to_json()
{

    bourne::json input =
    {
        "startTime", "hello"
    };

    OutletWorkingScheduleItemDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["startTime"] == output["startTime"]);



}


void test_OutletWorkingScheduleItemDTO_endTime_is_converted_to_json()
{

    bourne::json input =
    {
        "endTime", "hello"
    };

    OutletWorkingScheduleItemDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["endTime"] == output["endTime"]);



}


