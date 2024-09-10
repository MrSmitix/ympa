
#include "FeedbackDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_FeedbackDTO_id_is_assigned_from_json()
{






    bourne::json input =
    {
        "id", 1
    };

    FeedbackDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());


}


void test_FeedbackDTO_createdAt_is_assigned_from_json()
{








}


void test_FeedbackDTO_text_is_assigned_from_json()
{


    bourne::json input =
    {
        "text", "hello"
    };

    FeedbackDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getText().c_str());






}




void test_FeedbackDTO_pro_is_assigned_from_json()
{


    bourne::json input =
    {
        "pro", "hello"
    };

    FeedbackDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPro().c_str());






}


void test_FeedbackDTO_contra_is_assigned_from_json()
{


    bourne::json input =
    {
        "contra", "hello"
    };

    FeedbackDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getContra().c_str());






}




void test_FeedbackDTO_resolved_is_assigned_from_json()
{




    bourne::json input =
    {
        "resolved", true
    };

    FeedbackDTO obj(input.dump());

    TEST_ASSERT(true == obj.isResolved());




}


void test_FeedbackDTO_verified_is_assigned_from_json()
{




    bourne::json input =
    {
        "verified", true
    };

    FeedbackDTO obj(input.dump());

    TEST_ASSERT(true == obj.isVerified());




}


void test_FeedbackDTO_recommend_is_assigned_from_json()
{




    bourne::json input =
    {
        "recommend", true
    };

    FeedbackDTO obj(input.dump());

    TEST_ASSERT(true == obj.isRecommend());




}





void test_FeedbackDTO_id_is_converted_to_json()
{



    bourne::json input =
    {
        "id", 1
    };

    FeedbackDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);

}


void test_FeedbackDTO_createdAt_is_converted_to_json()
{




}


void test_FeedbackDTO_text_is_converted_to_json()
{

    bourne::json input =
    {
        "text", "hello"
    };

    FeedbackDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["text"] == output["text"]);



}




void test_FeedbackDTO_pro_is_converted_to_json()
{

    bourne::json input =
    {
        "pro", "hello"
    };

    FeedbackDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pro"] == output["pro"]);



}


void test_FeedbackDTO_contra_is_converted_to_json()
{

    bourne::json input =
    {
        "contra", "hello"
    };

    FeedbackDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["contra"] == output["contra"]);



}




void test_FeedbackDTO_resolved_is_converted_to_json()
{


    bourne::json input =
    {
        "resolved", true
    };

    FeedbackDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["resolved"] == output["resolved"]);


}


void test_FeedbackDTO_verified_is_converted_to_json()
{


    bourne::json input =
    {
        "verified", true
    };

    FeedbackDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["verified"] == output["verified"]);


}


void test_FeedbackDTO_recommend_is_converted_to_json()
{


    bourne::json input =
    {
        "recommend", true
    };

    FeedbackDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["recommend"] == output["recommend"]);


}




