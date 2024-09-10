
#include "OfferConditionDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"





void test_OfferConditionDTO_reason_is_assigned_from_json()
{


    bourne::json input =
    {
        "reason", "hello"
    };

    OfferConditionDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getReason().c_str());






}





void test_OfferConditionDTO_reason_is_converted_to_json()
{

    bourne::json input =
    {
        "reason", "hello"
    };

    OfferConditionDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["reason"] == output["reason"]);



}


