
#include "CreateChatRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CreateChatRequest_orderId_is_assigned_from_json()
{






    bourne::json input =
    {
        "orderId", 1
    };

    CreateChatRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getOrderId());


}



void test_CreateChatRequest_orderId_is_converted_to_json()
{



    bourne::json input =
    {
        "orderId", 1
    };

    CreateChatRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["orderId"] == output["orderId"]);

}


