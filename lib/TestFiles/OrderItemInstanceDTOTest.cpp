
#include "OrderItemInstanceDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OrderItemInstanceDTO_cis_is_assigned_from_json()
{


    bourne::json input =
    {
        "cis", "hello"
    };

    OrderItemInstanceDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCis().c_str());






}


void test_OrderItemInstanceDTO_cisFull_is_assigned_from_json()
{


    bourne::json input =
    {
        "cisFull", "hello"
    };

    OrderItemInstanceDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCisFull().c_str());






}


void test_OrderItemInstanceDTO_uin_is_assigned_from_json()
{


    bourne::json input =
    {
        "uin", "hello"
    };

    OrderItemInstanceDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUin().c_str());






}


void test_OrderItemInstanceDTO_rnpt_is_assigned_from_json()
{


    bourne::json input =
    {
        "rnpt", "hello"
    };

    OrderItemInstanceDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRnpt().c_str());






}


void test_OrderItemInstanceDTO_gtd_is_assigned_from_json()
{


    bourne::json input =
    {
        "gtd", "hello"
    };

    OrderItemInstanceDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getGtd().c_str());






}



void test_OrderItemInstanceDTO_cis_is_converted_to_json()
{

    bourne::json input =
    {
        "cis", "hello"
    };

    OrderItemInstanceDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["cis"] == output["cis"]);



}


void test_OrderItemInstanceDTO_cisFull_is_converted_to_json()
{

    bourne::json input =
    {
        "cisFull", "hello"
    };

    OrderItemInstanceDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["cisFull"] == output["cisFull"]);



}


void test_OrderItemInstanceDTO_uin_is_converted_to_json()
{

    bourne::json input =
    {
        "uin", "hello"
    };

    OrderItemInstanceDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["uin"] == output["uin"]);



}


void test_OrderItemInstanceDTO_rnpt_is_converted_to_json()
{

    bourne::json input =
    {
        "rnpt", "hello"
    };

    OrderItemInstanceDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["rnpt"] == output["rnpt"]);



}


void test_OrderItemInstanceDTO_gtd_is_converted_to_json()
{

    bourne::json input =
    {
        "gtd", "hello"
    };

    OrderItemInstanceDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["gtd"] == output["gtd"]);



}


