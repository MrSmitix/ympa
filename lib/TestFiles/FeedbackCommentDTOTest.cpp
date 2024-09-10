
#include "FeedbackCommentDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_FeedbackCommentDTO_id_is_assigned_from_json()
{






    bourne::json input =
    {
        "id", 1
    };

    FeedbackCommentDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());


}


void test_FeedbackCommentDTO_parentId_is_assigned_from_json()
{






    bourne::json input =
    {
        "parentId", 1
    };

    FeedbackCommentDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getParentId());


}


void test_FeedbackCommentDTO_body_is_assigned_from_json()
{


    bourne::json input =
    {
        "body", "hello"
    };

    FeedbackCommentDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBody().c_str());






}


void test_FeedbackCommentDTO_createdAt_is_assigned_from_json()
{








}


void test_FeedbackCommentDTO_updatedAt_is_assigned_from_json()
{








}





void test_FeedbackCommentDTO_id_is_converted_to_json()
{



    bourne::json input =
    {
        "id", 1
    };

    FeedbackCommentDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);

}


void test_FeedbackCommentDTO_parentId_is_converted_to_json()
{



    bourne::json input =
    {
        "parentId", 1
    };

    FeedbackCommentDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["parentId"] == output["parentId"]);

}


void test_FeedbackCommentDTO_body_is_converted_to_json()
{

    bourne::json input =
    {
        "body", "hello"
    };

    FeedbackCommentDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["body"] == output["body"]);



}


void test_FeedbackCommentDTO_createdAt_is_converted_to_json()
{




}


void test_FeedbackCommentDTO_updatedAt_is_converted_to_json()
{




}




