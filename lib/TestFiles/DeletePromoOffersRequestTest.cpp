
#include "DeletePromoOffersRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_DeletePromoOffersRequest_promoId_is_assigned_from_json()
{


    bourne::json input =
    {
        "promoId", "hello"
    };

    DeletePromoOffersRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPromoId().c_str());






}


void test_DeletePromoOffersRequest_deleteAllOffers_is_assigned_from_json()
{




    bourne::json input =
    {
        "deleteAllOffers", true
    };

    DeletePromoOffersRequest obj(input.dump());

    TEST_ASSERT(true == obj.isDeleteAllOffers());




}




void test_DeletePromoOffersRequest_promoId_is_converted_to_json()
{

    bourne::json input =
    {
        "promoId", "hello"
    };

    DeletePromoOffersRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["promoId"] == output["promoId"]);



}


void test_DeletePromoOffersRequest_deleteAllOffers_is_converted_to_json()
{


    bourne::json input =
    {
        "deleteAllOffers", true
    };

    DeletePromoOffersRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["deleteAllOffers"] == output["deleteAllOffers"]);


}



