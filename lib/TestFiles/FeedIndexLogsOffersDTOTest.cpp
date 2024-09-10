
#include "FeedIndexLogsOffersDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_FeedIndexLogsOffersDTO_rejectedCount_is_assigned_from_json()
{






    bourne::json input =
    {
        "rejectedCount", 1
    };

    FeedIndexLogsOffersDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getRejectedCount());


}


void test_FeedIndexLogsOffersDTO_totalCount_is_assigned_from_json()
{






    bourne::json input =
    {
        "totalCount", 1
    };

    FeedIndexLogsOffersDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getTotalCount());


}



void test_FeedIndexLogsOffersDTO_rejectedCount_is_converted_to_json()
{



    bourne::json input =
    {
        "rejectedCount", 1
    };

    FeedIndexLogsOffersDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["rejectedCount"] == output["rejectedCount"]);

}


void test_FeedIndexLogsOffersDTO_totalCount_is_converted_to_json()
{



    bourne::json input =
    {
        "totalCount", 1
    };

    FeedIndexLogsOffersDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["totalCount"] == output["totalCount"]);

}


