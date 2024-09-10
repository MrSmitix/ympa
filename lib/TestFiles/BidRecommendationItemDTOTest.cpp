
#include "BidRecommendationItemDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_BidRecommendationItemDTO_bid_is_assigned_from_json()
{
    bourne::json input =
    {
        "bid", 1
    };

    BidRecommendationItemDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBid());








}


void test_BidRecommendationItemDTO_showPercent_is_assigned_from_json()
{






    bourne::json input =
    {
        "showPercent", 1
    };

    BidRecommendationItemDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getShowPercent());


}



void test_BidRecommendationItemDTO_bid_is_converted_to_json()
{
    bourne::json input =
    {
        "bid", 1
    };

    BidRecommendationItemDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["bid"] == output["bid"]);




}


void test_BidRecommendationItemDTO_showPercent_is_converted_to_json()
{



    bourne::json input =
    {
        "showPercent", 1
    };

    BidRecommendationItemDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["showPercent"] == output["showPercent"]);

}


