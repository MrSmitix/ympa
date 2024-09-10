
#include "OrderBuyerInfoDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OrderBuyerInfoDTO_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    OrderBuyerInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_OrderBuyerInfoDTO_lastName_is_assigned_from_json()
{


    bourne::json input =
    {
        "lastName", "hello"
    };

    OrderBuyerInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLastName().c_str());






}


void test_OrderBuyerInfoDTO_firstName_is_assigned_from_json()
{


    bourne::json input =
    {
        "firstName", "hello"
    };

    OrderBuyerInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFirstName().c_str());






}


void test_OrderBuyerInfoDTO_middleName_is_assigned_from_json()
{


    bourne::json input =
    {
        "middleName", "hello"
    };

    OrderBuyerInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMiddleName().c_str());






}



void test_OrderBuyerInfoDTO_phone_is_assigned_from_json()
{


    bourne::json input =
    {
        "phone", "hello"
    };

    OrderBuyerInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPhone().c_str());






}



void test_OrderBuyerInfoDTO_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    OrderBuyerInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_OrderBuyerInfoDTO_lastName_is_converted_to_json()
{

    bourne::json input =
    {
        "lastName", "hello"
    };

    OrderBuyerInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["lastName"] == output["lastName"]);



}


void test_OrderBuyerInfoDTO_firstName_is_converted_to_json()
{

    bourne::json input =
    {
        "firstName", "hello"
    };

    OrderBuyerInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["firstName"] == output["firstName"]);



}


void test_OrderBuyerInfoDTO_middleName_is_converted_to_json()
{

    bourne::json input =
    {
        "middleName", "hello"
    };

    OrderBuyerInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["middleName"] == output["middleName"]);



}



void test_OrderBuyerInfoDTO_phone_is_converted_to_json()
{

    bourne::json input =
    {
        "phone", "hello"
    };

    OrderBuyerInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["phone"] == output["phone"]);



}


