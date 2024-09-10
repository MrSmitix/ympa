
#include "SetOrderBoxLayoutRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_SetOrderBoxLayoutRequest_allowRemove_is_assigned_from_json()
{




    bourne::json input =
    {
        "allowRemove", true
    };

    SetOrderBoxLayoutRequest obj(input.dump());

    TEST_ASSERT(true == obj.isAllowRemove());




}




void test_SetOrderBoxLayoutRequest_allowRemove_is_converted_to_json()
{


    bourne::json input =
    {
        "allowRemove", true
    };

    SetOrderBoxLayoutRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["allowRemove"] == output["allowRemove"]);


}


