
#include "GoodsFeedbackDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_GoodsFeedbackDTO_feedbackId_is_assigned_from_json()
{






    bourne::json input =
    {
        "feedbackId", 1
    };

    GoodsFeedbackDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getFeedbackId());


}


void test_GoodsFeedbackDTO_createdAt_is_assigned_from_json()
{








}


void test_GoodsFeedbackDTO_needReaction_is_assigned_from_json()
{




    bourne::json input =
    {
        "needReaction", true
    };

    GoodsFeedbackDTO obj(input.dump());

    TEST_ASSERT(true == obj.isNeedReaction());




}



void test_GoodsFeedbackDTO_author_is_assigned_from_json()
{


    bourne::json input =
    {
        "author", "hello"
    };

    GoodsFeedbackDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAuthor().c_str());






}






void test_GoodsFeedbackDTO_feedbackId_is_converted_to_json()
{



    bourne::json input =
    {
        "feedbackId", 1
    };

    GoodsFeedbackDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["feedbackId"] == output["feedbackId"]);

}


void test_GoodsFeedbackDTO_createdAt_is_converted_to_json()
{




}


void test_GoodsFeedbackDTO_needReaction_is_converted_to_json()
{


    bourne::json input =
    {
        "needReaction", true
    };

    GoodsFeedbackDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["needReaction"] == output["needReaction"]);


}



void test_GoodsFeedbackDTO_author_is_converted_to_json()
{

    bourne::json input =
    {
        "author", "hello"
    };

    GoodsFeedbackDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["author"] == output["author"]);



}





