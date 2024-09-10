
#include "GenerateUnitedOrdersRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_GenerateUnitedOrdersRequest_businessId_is_assigned_from_json()
{






    bourne::json input =
    {
        "businessId", 1
    };

    GenerateUnitedOrdersRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBusinessId());


}





void test_GenerateUnitedOrdersRequest_promoId_is_assigned_from_json()
{


    bourne::json input =
    {
        "promoId", "hello"
    };

    GenerateUnitedOrdersRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPromoId().c_str());






}



void test_GenerateUnitedOrdersRequest_businessId_is_converted_to_json()
{



    bourne::json input =
    {
        "businessId", 1
    };

    GenerateUnitedOrdersRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["businessId"] == output["businessId"]);

}





void test_GenerateUnitedOrdersRequest_promoId_is_converted_to_json()
{

    bourne::json input =
    {
        "promoId", "hello"
    };

    GenerateUnitedOrdersRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["promoId"] == output["promoId"]);



}


