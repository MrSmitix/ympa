
#include "SetReturnDecisionRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_SetReturnDecisionRequest_returnItemId_is_assigned_from_json()
{






    bourne::json input =
    {
        "returnItemId", 1
    };

    SetReturnDecisionRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getReturnItemId());


}



void test_SetReturnDecisionRequest_comment_is_assigned_from_json()
{


    bourne::json input =
    {
        "comment", "hello"
    };

    SetReturnDecisionRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getComment().c_str());






}



void test_SetReturnDecisionRequest_returnItemId_is_converted_to_json()
{



    bourne::json input =
    {
        "returnItemId", 1
    };

    SetReturnDecisionRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["returnItemId"] == output["returnItemId"]);

}



void test_SetReturnDecisionRequest_comment_is_converted_to_json()
{

    bourne::json input =
    {
        "comment", "hello"
    };

    SetReturnDecisionRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["comment"] == output["comment"]);



}


