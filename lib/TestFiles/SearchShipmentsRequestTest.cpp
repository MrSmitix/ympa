
#include "SearchShipmentsRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"







void test_SearchShipmentsRequest_cancelledOrders_is_assigned_from_json()
{




    bourne::json input =
    {
        "cancelledOrders", true
    };

    SearchShipmentsRequest obj(input.dump());

    TEST_ASSERT(true == obj.isCancelledOrders());




}







void test_SearchShipmentsRequest_cancelledOrders_is_converted_to_json()
{


    bourne::json input =
    {
        "cancelledOrders", true
    };

    SearchShipmentsRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["cancelledOrders"] == output["cancelledOrders"]);


}


