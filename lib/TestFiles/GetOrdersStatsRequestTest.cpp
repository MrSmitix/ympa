
#include "GetOrdersStatsRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"









void test_GetOrdersStatsRequest_hasCis_is_assigned_from_json()
{




    bourne::json input =
    {
        "hasCis", true
    };

    GetOrdersStatsRequest obj(input.dump());

    TEST_ASSERT(true == obj.isHasCis());




}









void test_GetOrdersStatsRequest_hasCis_is_converted_to_json()
{


    bourne::json input =
    {
        "hasCis", true
    };

    GetOrdersStatsRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["hasCis"] == output["hasCis"]);


}


