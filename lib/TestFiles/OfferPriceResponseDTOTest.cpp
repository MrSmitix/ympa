
#include "OfferPriceResponseDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OfferPriceResponseDTO_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    OfferPriceResponseDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}



void test_OfferPriceResponseDTO_marketSku_is_assigned_from_json()
{






    bourne::json input =
    {
        "marketSku", 1
    };

    OfferPriceResponseDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMarketSku());


}


void test_OfferPriceResponseDTO_updatedAt_is_assigned_from_json()
{








}



void test_OfferPriceResponseDTO_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    OfferPriceResponseDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}



void test_OfferPriceResponseDTO_marketSku_is_converted_to_json()
{



    bourne::json input =
    {
        "marketSku", 1
    };

    OfferPriceResponseDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["marketSku"] == output["marketSku"]);

}


void test_OfferPriceResponseDTO_updatedAt_is_converted_to_json()
{




}


