
#include "BriefOrderItemInstanceDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_BriefOrderItemInstanceDTO_cis_is_assigned_from_json()
{


    bourne::json input =
    {
        "cis", "hello"
    };

    BriefOrderItemInstanceDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCis().c_str());






}


void test_BriefOrderItemInstanceDTO_uin_is_assigned_from_json()
{


    bourne::json input =
    {
        "uin", "hello"
    };

    BriefOrderItemInstanceDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUin().c_str());






}


void test_BriefOrderItemInstanceDTO_rnpt_is_assigned_from_json()
{


    bourne::json input =
    {
        "rnpt", "hello"
    };

    BriefOrderItemInstanceDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRnpt().c_str());






}


void test_BriefOrderItemInstanceDTO_gtd_is_assigned_from_json()
{


    bourne::json input =
    {
        "gtd", "hello"
    };

    BriefOrderItemInstanceDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getGtd().c_str());






}



void test_BriefOrderItemInstanceDTO_cis_is_converted_to_json()
{

    bourne::json input =
    {
        "cis", "hello"
    };

    BriefOrderItemInstanceDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["cis"] == output["cis"]);



}


void test_BriefOrderItemInstanceDTO_uin_is_converted_to_json()
{

    bourne::json input =
    {
        "uin", "hello"
    };

    BriefOrderItemInstanceDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["uin"] == output["uin"]);



}


void test_BriefOrderItemInstanceDTO_rnpt_is_converted_to_json()
{

    bourne::json input =
    {
        "rnpt", "hello"
    };

    BriefOrderItemInstanceDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["rnpt"] == output["rnpt"]);



}


void test_BriefOrderItemInstanceDTO_gtd_is_converted_to_json()
{

    bourne::json input =
    {
        "gtd", "hello"
    };

    BriefOrderItemInstanceDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["gtd"] == output["gtd"]);



}


