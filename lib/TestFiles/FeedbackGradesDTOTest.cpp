
#include "FeedbackGradesDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_FeedbackGradesDTO_average_is_assigned_from_json()
{








}


void test_FeedbackGradesDTO_agreeCount_is_assigned_from_json()
{






    bourne::json input =
    {
        "agreeCount", 1
    };

    FeedbackGradesDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getAgreeCount());


}


void test_FeedbackGradesDTO_rejectCount_is_assigned_from_json()
{






    bourne::json input =
    {
        "rejectCount", 1
    };

    FeedbackGradesDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getRejectCount());


}




void test_FeedbackGradesDTO_average_is_converted_to_json()
{




}


void test_FeedbackGradesDTO_agreeCount_is_converted_to_json()
{



    bourne::json input =
    {
        "agreeCount", 1
    };

    FeedbackGradesDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["agreeCount"] == output["agreeCount"]);

}


void test_FeedbackGradesDTO_rejectCount_is_converted_to_json()
{



    bourne::json input =
    {
        "rejectCount", 1
    };

    FeedbackGradesDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["rejectCount"] == output["rejectCount"]);

}



