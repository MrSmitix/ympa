
#include "FeedIndexLogsErrorDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_FeedIndexLogsErrorDTO_httpStatusCode_is_assigned_from_json()
{
    bourne::json input =
    {
        "httpStatusCode", 1
    };

    FeedIndexLogsErrorDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getHttpStatusCode());








}



void test_FeedIndexLogsErrorDTO_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    FeedIndexLogsErrorDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}



void test_FeedIndexLogsErrorDTO_httpStatusCode_is_converted_to_json()
{
    bourne::json input =
    {
        "httpStatusCode", 1
    };

    FeedIndexLogsErrorDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["httpStatusCode"] == output["httpStatusCode"]);




}



void test_FeedIndexLogsErrorDTO_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    FeedIndexLogsErrorDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}


