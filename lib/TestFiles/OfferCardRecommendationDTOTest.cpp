
#include "OfferCardRecommendationDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_OfferCardRecommendationDTO_percent_is_assigned_from_json()
{
    bourne::json input =
    {
        "percent", 1
    };

    OfferCardRecommendationDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPercent());








}




void test_OfferCardRecommendationDTO_percent_is_converted_to_json()
{
    bourne::json input =
    {
        "percent", 1
    };

    OfferCardRecommendationDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["percent"] == output["percent"]);




}


