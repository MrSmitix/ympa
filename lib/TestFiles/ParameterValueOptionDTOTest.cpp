
#include "ParameterValueOptionDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ParameterValueOptionDTO_id_is_assigned_from_json()
{






    bourne::json input =
    {
        "id", 1
    };

    ParameterValueOptionDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());


}


void test_ParameterValueOptionDTO_value_is_assigned_from_json()
{


    bourne::json input =
    {
        "value", "hello"
    };

    ParameterValueOptionDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getValue().c_str());






}


void test_ParameterValueOptionDTO_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    ParameterValueOptionDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}



void test_ParameterValueOptionDTO_id_is_converted_to_json()
{



    bourne::json input =
    {
        "id", 1
    };

    ParameterValueOptionDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);

}


void test_ParameterValueOptionDTO_value_is_converted_to_json()
{

    bourne::json input =
    {
        "value", "hello"
    };

    ParameterValueOptionDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["value"] == output["value"]);



}


void test_ParameterValueOptionDTO_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    ParameterValueOptionDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}


