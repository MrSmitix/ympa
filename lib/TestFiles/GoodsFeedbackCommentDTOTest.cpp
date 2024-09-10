
#include "GoodsFeedbackCommentDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_GoodsFeedbackCommentDTO_id_is_assigned_from_json()
{






    bourne::json input =
    {
        "id", 1
    };

    GoodsFeedbackCommentDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());


}


void test_GoodsFeedbackCommentDTO_text_is_assigned_from_json()
{


    bourne::json input =
    {
        "text", "hello"
    };

    GoodsFeedbackCommentDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getText().c_str());






}


void test_GoodsFeedbackCommentDTO_canModify_is_assigned_from_json()
{




    bourne::json input =
    {
        "canModify", true
    };

    GoodsFeedbackCommentDTO obj(input.dump());

    TEST_ASSERT(true == obj.isCanModify());




}


void test_GoodsFeedbackCommentDTO_parentId_is_assigned_from_json()
{






    bourne::json input =
    {
        "parentId", 1
    };

    GoodsFeedbackCommentDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getParentId());


}





void test_GoodsFeedbackCommentDTO_id_is_converted_to_json()
{



    bourne::json input =
    {
        "id", 1
    };

    GoodsFeedbackCommentDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);

}


void test_GoodsFeedbackCommentDTO_text_is_converted_to_json()
{

    bourne::json input =
    {
        "text", "hello"
    };

    GoodsFeedbackCommentDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["text"] == output["text"]);



}


void test_GoodsFeedbackCommentDTO_canModify_is_converted_to_json()
{


    bourne::json input =
    {
        "canModify", true
    };

    GoodsFeedbackCommentDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["canModify"] == output["canModify"]);


}


void test_GoodsFeedbackCommentDTO_parentId_is_converted_to_json()
{



    bourne::json input =
    {
        "parentId", 1
    };

    GoodsFeedbackCommentDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["parentId"] == output["parentId"]);

}




