
#include "OrderTrackDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OrderTrackDTO_trackCode_is_assigned_from_json()
{


    bourne::json input =
    {
        "trackCode", "hello"
    };

    OrderTrackDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTrackCode().c_str());






}


void test_OrderTrackDTO_deliveryServiceId_is_assigned_from_json()
{






    bourne::json input =
    {
        "deliveryServiceId", 1
    };

    OrderTrackDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getDeliveryServiceId());


}



void test_OrderTrackDTO_trackCode_is_converted_to_json()
{

    bourne::json input =
    {
        "trackCode", "hello"
    };

    OrderTrackDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["trackCode"] == output["trackCode"]);



}


void test_OrderTrackDTO_deliveryServiceId_is_converted_to_json()
{



    bourne::json input =
    {
        "deliveryServiceId", 1
    };

    OrderTrackDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["deliveryServiceId"] == output["deliveryServiceId"]);

}


