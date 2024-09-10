
#include "UpdatePromoOffersRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_UpdatePromoOffersRequest_promoId_is_assigned_from_json()
{


    bourne::json input =
    {
        "promoId", "hello"
    };

    UpdatePromoOffersRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPromoId().c_str());






}




void test_UpdatePromoOffersRequest_promoId_is_converted_to_json()
{

    bourne::json input =
    {
        "promoId", "hello"
    };

    UpdatePromoOffersRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["promoId"] == output["promoId"]);



}



