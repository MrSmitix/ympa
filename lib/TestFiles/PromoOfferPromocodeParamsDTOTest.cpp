
#include "PromoOfferPromocodeParamsDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PromoOfferPromocodeParamsDTO_maxPrice_is_assigned_from_json()
{






    bourne::json input =
    {
        "maxPrice", 1
    };

    PromoOfferPromocodeParamsDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMaxPrice());


}



void test_PromoOfferPromocodeParamsDTO_maxPrice_is_converted_to_json()
{



    bourne::json input =
    {
        "maxPrice", 1
    };

    PromoOfferPromocodeParamsDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["maxPrice"] == output["maxPrice"]);

}


