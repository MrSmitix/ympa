
#include "FeedDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_FeedDTO_id_is_assigned_from_json()
{






    bourne::json input =
    {
        "id", 1
    };

    FeedDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());


}


void test_FeedDTO_login_is_assigned_from_json()
{


    bourne::json input =
    {
        "login", "hello"
    };

    FeedDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLogin().c_str());






}


void test_FeedDTO_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    FeedDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_FeedDTO_password_is_assigned_from_json()
{


    bourne::json input =
    {
        "password", "hello"
    };

    FeedDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPassword().c_str());






}


void test_FeedDTO_uploadDate_is_assigned_from_json()
{








}


void test_FeedDTO_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "url", "hello"
    };

    FeedDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUrl().c_str());






}







void test_FeedDTO_id_is_converted_to_json()
{



    bourne::json input =
    {
        "id", 1
    };

    FeedDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);

}


void test_FeedDTO_login_is_converted_to_json()
{

    bourne::json input =
    {
        "login", "hello"
    };

    FeedDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["login"] == output["login"]);



}


void test_FeedDTO_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    FeedDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_FeedDTO_password_is_converted_to_json()
{

    bourne::json input =
    {
        "password", "hello"
    };

    FeedDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["password"] == output["password"]);



}


void test_FeedDTO_uploadDate_is_converted_to_json()
{




}


void test_FeedDTO_url_is_converted_to_json()
{

    bourne::json input =
    {
        "url", "hello"
    };

    FeedDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["url"] == output["url"]);



}






