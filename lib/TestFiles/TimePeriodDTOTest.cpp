
#include "TimePeriodDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_TimePeriodDTO_timePeriod_is_assigned_from_json()
{
    bourne::json input =
    {
        "timePeriod", 1
    };

    TimePeriodDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getTimePeriod());








}



void test_TimePeriodDTO_comment_is_assigned_from_json()
{


    bourne::json input =
    {
        "comment", "hello"
    };

    TimePeriodDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getComment().c_str());






}



void test_TimePeriodDTO_timePeriod_is_converted_to_json()
{
    bourne::json input =
    {
        "timePeriod", 1
    };

    TimePeriodDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["timePeriod"] == output["timePeriod"]);




}



void test_TimePeriodDTO_comment_is_converted_to_json()
{

    bourne::json input =
    {
        "comment", "hello"
    };

    TimePeriodDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["comment"] == output["comment"]);



}


