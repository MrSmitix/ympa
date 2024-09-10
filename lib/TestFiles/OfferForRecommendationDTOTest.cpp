
#include "OfferForRecommendationDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OfferForRecommendationDTO_offerId_is_assigned_from_json()
{


    bourne::json input =
    {
        "offerId", "hello"
    };

    OfferForRecommendationDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOfferId().c_str());






}





void test_OfferForRecommendationDTO_shows_is_assigned_from_json()
{






    bourne::json input =
    {
        "shows", 1
    };

    OfferForRecommendationDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getShows());


}



void test_OfferForRecommendationDTO_offerId_is_converted_to_json()
{

    bourne::json input =
    {
        "offerId", "hello"
    };

    OfferForRecommendationDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["offerId"] == output["offerId"]);



}





void test_OfferForRecommendationDTO_shows_is_converted_to_json()
{



    bourne::json input =
    {
        "shows", 1
    };

    OfferForRecommendationDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["shows"] == output["shows"]);

}


