
#include "FeedbackOrderDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_FeedbackOrderDTO_shopOrderId_is_assigned_from_json()
{


    bourne::json input =
    {
        "shopOrderId", "hello"
    };

    FeedbackOrderDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getShopOrderId().c_str());






}




void test_FeedbackOrderDTO_shopOrderId_is_converted_to_json()
{

    bourne::json input =
    {
        "shopOrderId", "hello"
    };

    FeedbackOrderDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["shopOrderId"] == output["shopOrderId"]);



}



