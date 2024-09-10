
#include "ReturnInstanceDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"





void test_ReturnInstanceDTO_cis_is_assigned_from_json()
{


    bourne::json input =
    {
        "cis", "hello"
    };

    ReturnInstanceDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCis().c_str());






}


void test_ReturnInstanceDTO_imei_is_assigned_from_json()
{


    bourne::json input =
    {
        "imei", "hello"
    };

    ReturnInstanceDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getImei().c_str());






}





void test_ReturnInstanceDTO_cis_is_converted_to_json()
{

    bourne::json input =
    {
        "cis", "hello"
    };

    ReturnInstanceDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["cis"] == output["cis"]);



}


void test_ReturnInstanceDTO_imei_is_converted_to_json()
{

    bourne::json input =
    {
        "imei", "hello"
    };

    ReturnInstanceDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["imei"] == output["imei"]);



}


