
#include "GoodsFeedbackStatisticsDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_GoodsFeedbackStatisticsDTO_rating_is_assigned_from_json()
{
    bourne::json input =
    {
        "rating", 1
    };

    GoodsFeedbackStatisticsDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getRating());








}


void test_GoodsFeedbackStatisticsDTO_commentsCount_is_assigned_from_json()
{






    bourne::json input =
    {
        "commentsCount", 1
    };

    GoodsFeedbackStatisticsDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCommentsCount());


}


void test_GoodsFeedbackStatisticsDTO_recommended_is_assigned_from_json()
{




    bourne::json input =
    {
        "recommended", true
    };

    GoodsFeedbackStatisticsDTO obj(input.dump());

    TEST_ASSERT(true == obj.isRecommended());




}


void test_GoodsFeedbackStatisticsDTO_paidAmount_is_assigned_from_json()
{






    bourne::json input =
    {
        "paidAmount", 1
    };

    GoodsFeedbackStatisticsDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPaidAmount());


}



void test_GoodsFeedbackStatisticsDTO_rating_is_converted_to_json()
{
    bourne::json input =
    {
        "rating", 1
    };

    GoodsFeedbackStatisticsDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["rating"] == output["rating"]);




}


void test_GoodsFeedbackStatisticsDTO_commentsCount_is_converted_to_json()
{



    bourne::json input =
    {
        "commentsCount", 1
    };

    GoodsFeedbackStatisticsDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["commentsCount"] == output["commentsCount"]);

}


void test_GoodsFeedbackStatisticsDTO_recommended_is_converted_to_json()
{


    bourne::json input =
    {
        "recommended", true
    };

    GoodsFeedbackStatisticsDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["recommended"] == output["recommended"]);


}


void test_GoodsFeedbackStatisticsDTO_paidAmount_is_converted_to_json()
{



    bourne::json input =
    {
        "paidAmount", 1
    };

    GoodsFeedbackStatisticsDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["paidAmount"] == output["paidAmount"]);

}


