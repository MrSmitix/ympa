
#include "UpdateGoodsFeedbackCommentDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_UpdateGoodsFeedbackCommentDTO_id_is_assigned_from_json()
{






    bourne::json input =
    {
        "id", 1
    };

    UpdateGoodsFeedbackCommentDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());


}


void test_UpdateGoodsFeedbackCommentDTO_parentId_is_assigned_from_json()
{






    bourne::json input =
    {
        "parentId", 1
    };

    UpdateGoodsFeedbackCommentDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getParentId());


}


void test_UpdateGoodsFeedbackCommentDTO_text_is_assigned_from_json()
{


    bourne::json input =
    {
        "text", "hello"
    };

    UpdateGoodsFeedbackCommentDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getText().c_str());






}



void test_UpdateGoodsFeedbackCommentDTO_id_is_converted_to_json()
{



    bourne::json input =
    {
        "id", 1
    };

    UpdateGoodsFeedbackCommentDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);

}


void test_UpdateGoodsFeedbackCommentDTO_parentId_is_converted_to_json()
{



    bourne::json input =
    {
        "parentId", 1
    };

    UpdateGoodsFeedbackCommentDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["parentId"] == output["parentId"]);

}


void test_UpdateGoodsFeedbackCommentDTO_text_is_converted_to_json()
{

    bourne::json input =
    {
        "text", "hello"
    };

    UpdateGoodsFeedbackCommentDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["text"] == output["text"]);



}


