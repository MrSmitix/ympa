
#include "ParameterValueDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ParameterValueDTO_parameterId_is_assigned_from_json()
{






    bourne::json input =
    {
        "parameterId", 1
    };

    ParameterValueDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getParameterId());


}


void test_ParameterValueDTO_unitId_is_assigned_from_json()
{






    bourne::json input =
    {
        "unitId", 1
    };

    ParameterValueDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getUnitId());


}


void test_ParameterValueDTO_valueId_is_assigned_from_json()
{






    bourne::json input =
    {
        "valueId", 1
    };

    ParameterValueDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getValueId());


}


void test_ParameterValueDTO_value_is_assigned_from_json()
{


    bourne::json input =
    {
        "value", "hello"
    };

    ParameterValueDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getValue().c_str());






}



void test_ParameterValueDTO_parameterId_is_converted_to_json()
{



    bourne::json input =
    {
        "parameterId", 1
    };

    ParameterValueDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["parameterId"] == output["parameterId"]);

}


void test_ParameterValueDTO_unitId_is_converted_to_json()
{



    bourne::json input =
    {
        "unitId", 1
    };

    ParameterValueDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["unitId"] == output["unitId"]);

}


void test_ParameterValueDTO_valueId_is_converted_to_json()
{



    bourne::json input =
    {
        "valueId", 1
    };

    ParameterValueDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["valueId"] == output["valueId"]);

}


void test_ParameterValueDTO_value_is_converted_to_json()
{

    bourne::json input =
    {
        "value", "hello"
    };

    ParameterValueDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["value"] == output["value"]);



}


