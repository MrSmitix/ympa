
#include "SetShipmentPalletsCountRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_SetShipmentPalletsCountRequest_placesCount_is_assigned_from_json()
{
    bourne::json input =
    {
        "placesCount", 1
    };

    SetShipmentPalletsCountRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPlacesCount());








}



void test_SetShipmentPalletsCountRequest_placesCount_is_converted_to_json()
{
    bourne::json input =
    {
        "placesCount", 1
    };

    SetShipmentPalletsCountRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["placesCount"] == output["placesCount"]);




}


