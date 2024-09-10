
#include "OrderBuyerDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OrderBuyerDTO_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    OrderBuyerDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_OrderBuyerDTO_lastName_is_assigned_from_json()
{


    bourne::json input =
    {
        "lastName", "hello"
    };

    OrderBuyerDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLastName().c_str());






}


void test_OrderBuyerDTO_firstName_is_assigned_from_json()
{


    bourne::json input =
    {
        "firstName", "hello"
    };

    OrderBuyerDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFirstName().c_str());






}


void test_OrderBuyerDTO_middleName_is_assigned_from_json()
{


    bourne::json input =
    {
        "middleName", "hello"
    };

    OrderBuyerDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMiddleName().c_str());






}




void test_OrderBuyerDTO_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    OrderBuyerDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_OrderBuyerDTO_lastName_is_converted_to_json()
{

    bourne::json input =
    {
        "lastName", "hello"
    };

    OrderBuyerDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["lastName"] == output["lastName"]);



}


void test_OrderBuyerDTO_firstName_is_converted_to_json()
{

    bourne::json input =
    {
        "firstName", "hello"
    };

    OrderBuyerDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["firstName"] == output["firstName"]);



}


void test_OrderBuyerDTO_middleName_is_converted_to_json()
{

    bourne::json input =
    {
        "middleName", "hello"
    };

    OrderBuyerDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["middleName"] == output["middleName"]);



}



