
#include "UnitDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_UnitDTO_id_is_assigned_from_json()
{






    bourne::json input =
    {
        "id", 1
    };

    UnitDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());


}


void test_UnitDTO_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    UnitDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_UnitDTO_fullName_is_assigned_from_json()
{


    bourne::json input =
    {
        "fullName", "hello"
    };

    UnitDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFullName().c_str());






}



void test_UnitDTO_id_is_converted_to_json()
{



    bourne::json input =
    {
        "id", 1
    };

    UnitDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);

}


void test_UnitDTO_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    UnitDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_UnitDTO_fullName_is_converted_to_json()
{

    bourne::json input =
    {
        "fullName", "hello"
    };

    UnitDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["fullName"] == output["fullName"]);



}


