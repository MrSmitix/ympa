
#include "QuantumDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_QuantumDTO_minQuantity_is_assigned_from_json()
{
    bourne::json input =
    {
        "minQuantity", 1
    };

    QuantumDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMinQuantity());








}


void test_QuantumDTO_stepQuantity_is_assigned_from_json()
{
    bourne::json input =
    {
        "stepQuantity", 1
    };

    QuantumDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getStepQuantity());








}



void test_QuantumDTO_minQuantity_is_converted_to_json()
{
    bourne::json input =
    {
        "minQuantity", 1
    };

    QuantumDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["minQuantity"] == output["minQuantity"]);




}


void test_QuantumDTO_stepQuantity_is_converted_to_json()
{
    bourne::json input =
    {
        "stepQuantity", 1
    };

    QuantumDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["stepQuantity"] == output["stepQuantity"]);




}


