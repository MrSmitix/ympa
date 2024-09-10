
#include "UpdateBusinessOfferPriceDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_UpdateBusinessOfferPriceDTO_offerId_is_assigned_from_json()
{


    bourne::json input =
    {
        "offerId", "hello"
    };

    UpdateBusinessOfferPriceDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOfferId().c_str());






}




void test_UpdateBusinessOfferPriceDTO_offerId_is_converted_to_json()
{

    bourne::json input =
    {
        "offerId", "hello"
    };

    UpdateBusinessOfferPriceDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["offerId"] == output["offerId"]);



}



