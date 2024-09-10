
#include "GoodsFeedbackDescriptionDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_GoodsFeedbackDescriptionDTO_advantages_is_assigned_from_json()
{


    bourne::json input =
    {
        "advantages", "hello"
    };

    GoodsFeedbackDescriptionDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAdvantages().c_str());






}


void test_GoodsFeedbackDescriptionDTO_disadvantages_is_assigned_from_json()
{


    bourne::json input =
    {
        "disadvantages", "hello"
    };

    GoodsFeedbackDescriptionDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDisadvantages().c_str());






}


void test_GoodsFeedbackDescriptionDTO_comment_is_assigned_from_json()
{


    bourne::json input =
    {
        "comment", "hello"
    };

    GoodsFeedbackDescriptionDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getComment().c_str());






}



void test_GoodsFeedbackDescriptionDTO_advantages_is_converted_to_json()
{

    bourne::json input =
    {
        "advantages", "hello"
    };

    GoodsFeedbackDescriptionDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["advantages"] == output["advantages"]);



}


void test_GoodsFeedbackDescriptionDTO_disadvantages_is_converted_to_json()
{

    bourne::json input =
    {
        "disadvantages", "hello"
    };

    GoodsFeedbackDescriptionDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["disadvantages"] == output["disadvantages"]);



}


void test_GoodsFeedbackDescriptionDTO_comment_is_converted_to_json()
{

    bourne::json input =
    {
        "comment", "hello"
    };

    GoodsFeedbackDescriptionDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["comment"] == output["comment"]);



}


