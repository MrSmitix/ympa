
#include "ParameterValueConstraintsDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ParameterValueConstraintsDTO_minValue_is_assigned_from_json()
{








}


void test_ParameterValueConstraintsDTO_maxValue_is_assigned_from_json()
{








}


void test_ParameterValueConstraintsDTO_maxLength_is_assigned_from_json()
{
    bourne::json input =
    {
        "maxLength", 1
    };

    ParameterValueConstraintsDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMaxLength());








}



void test_ParameterValueConstraintsDTO_minValue_is_converted_to_json()
{




}


void test_ParameterValueConstraintsDTO_maxValue_is_converted_to_json()
{




}


void test_ParameterValueConstraintsDTO_maxLength_is_converted_to_json()
{
    bourne::json input =
    {
        "maxLength", 1
    };

    ParameterValueConstraintsDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["maxLength"] == output["maxLength"]);




}


