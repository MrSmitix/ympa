
#include "PriceRecommendationItemDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PriceRecommendationItemDTO_campaignId_is_assigned_from_json()
{






    bourne::json input =
    {
        "campaignId", 1
    };

    PriceRecommendationItemDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCampaignId());


}


void test_PriceRecommendationItemDTO_price_is_assigned_from_json()
{








}



void test_PriceRecommendationItemDTO_campaignId_is_converted_to_json()
{



    bourne::json input =
    {
        "campaignId", 1
    };

    PriceRecommendationItemDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["campaignId"] == output["campaignId"]);

}


void test_PriceRecommendationItemDTO_price_is_converted_to_json()
{




}


