
#include "FeedbackCommentAuthorDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_FeedbackCommentAuthorDTO_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    FeedbackCommentAuthorDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}




void test_FeedbackCommentAuthorDTO_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    FeedbackCommentAuthorDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


