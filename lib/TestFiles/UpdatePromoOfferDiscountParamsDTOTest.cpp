
#include "UpdatePromoOfferDiscountParamsDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_UpdatePromoOfferDiscountParamsDTO_price_is_assigned_from_json()
{






    bourne::json input =
    {
        "price", 1
    };

    UpdatePromoOfferDiscountParamsDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPrice());


}


void test_UpdatePromoOfferDiscountParamsDTO_promoPrice_is_assigned_from_json()
{






    bourne::json input =
    {
        "promoPrice", 1
    };

    UpdatePromoOfferDiscountParamsDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPromoPrice());


}



void test_UpdatePromoOfferDiscountParamsDTO_price_is_converted_to_json()
{



    bourne::json input =
    {
        "price", 1
    };

    UpdatePromoOfferDiscountParamsDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["price"] == output["price"]);

}


void test_UpdatePromoOfferDiscountParamsDTO_promoPrice_is_converted_to_json()
{



    bourne::json input =
    {
        "promoPrice", 1
    };

    UpdatePromoOfferDiscountParamsDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["promoPrice"] == output["promoPrice"]);

}


