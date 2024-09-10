
#include "FeedPlacementDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_FeedPlacementDTO_totalOffersCount_is_assigned_from_json()
{
    bourne::json input =
    {
        "totalOffersCount", 1
    };

    FeedPlacementDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getTotalOffersCount());








}




void test_FeedPlacementDTO_totalOffersCount_is_converted_to_json()
{
    bourne::json input =
    {
        "totalOffersCount", 1
    };

    FeedPlacementDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["totalOffersCount"] == output["totalOffersCount"]);




}


