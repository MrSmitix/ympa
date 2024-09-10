
#include "FeedContentDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_FeedContentDTO_rejectedOffersCount_is_assigned_from_json()
{






    bourne::json input =
    {
        "rejectedOffersCount", 1
    };

    FeedContentDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getRejectedOffersCount());


}



void test_FeedContentDTO_totalOffersCount_is_assigned_from_json()
{






    bourne::json input =
    {
        "totalOffersCount", 1
    };

    FeedContentDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getTotalOffersCount());


}




void test_FeedContentDTO_rejectedOffersCount_is_converted_to_json()
{



    bourne::json input =
    {
        "rejectedOffersCount", 1
    };

    FeedContentDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["rejectedOffersCount"] == output["rejectedOffersCount"]);

}



void test_FeedContentDTO_totalOffersCount_is_converted_to_json()
{



    bourne::json input =
    {
        "totalOffersCount", 1
    };

    FeedContentDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["totalOffersCount"] == output["totalOffersCount"]);

}



