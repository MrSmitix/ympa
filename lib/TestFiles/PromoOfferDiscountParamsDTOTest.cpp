
#include "PromoOfferDiscountParamsDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PromoOfferDiscountParamsDTO_price_is_assigned_from_json()
{






    bourne::json input =
    {
        "price", 1
    };

    PromoOfferDiscountParamsDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPrice());


}


void test_PromoOfferDiscountParamsDTO_promoPrice_is_assigned_from_json()
{






    bourne::json input =
    {
        "promoPrice", 1
    };

    PromoOfferDiscountParamsDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPromoPrice());


}


void test_PromoOfferDiscountParamsDTO_maxPromoPrice_is_assigned_from_json()
{






    bourne::json input =
    {
        "maxPromoPrice", 1
    };

    PromoOfferDiscountParamsDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMaxPromoPrice());


}



void test_PromoOfferDiscountParamsDTO_price_is_converted_to_json()
{



    bourne::json input =
    {
        "price", 1
    };

    PromoOfferDiscountParamsDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["price"] == output["price"]);

}


void test_PromoOfferDiscountParamsDTO_promoPrice_is_converted_to_json()
{



    bourne::json input =
    {
        "promoPrice", 1
    };

    PromoOfferDiscountParamsDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["promoPrice"] == output["promoPrice"]);

}


void test_PromoOfferDiscountParamsDTO_maxPromoPrice_is_converted_to_json()
{



    bourne::json input =
    {
        "maxPromoPrice", 1
    };

    PromoOfferDiscountParamsDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["maxPromoPrice"] == output["maxPromoPrice"]);

}


