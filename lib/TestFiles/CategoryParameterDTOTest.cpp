
#include "CategoryParameterDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CategoryParameterDTO_id_is_assigned_from_json()
{






    bourne::json input =
    {
        "id", 1
    };

    CategoryParameterDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());


}


void test_CategoryParameterDTO_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    CategoryParameterDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}




void test_CategoryParameterDTO_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    CategoryParameterDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}



void test_CategoryParameterDTO_required_is_assigned_from_json()
{




    bourne::json input =
    {
        "required", true
    };

    CategoryParameterDTO obj(input.dump());

    TEST_ASSERT(true == obj.isRequired());




}


void test_CategoryParameterDTO_filtering_is_assigned_from_json()
{




    bourne::json input =
    {
        "filtering", true
    };

    CategoryParameterDTO obj(input.dump());

    TEST_ASSERT(true == obj.isFiltering());




}


void test_CategoryParameterDTO_distinctive_is_assigned_from_json()
{




    bourne::json input =
    {
        "distinctive", true
    };

    CategoryParameterDTO obj(input.dump());

    TEST_ASSERT(true == obj.isDistinctive());




}


void test_CategoryParameterDTO_multivalue_is_assigned_from_json()
{




    bourne::json input =
    {
        "multivalue", true
    };

    CategoryParameterDTO obj(input.dump());

    TEST_ASSERT(true == obj.isMultivalue());




}


void test_CategoryParameterDTO_allowCustomValues_is_assigned_from_json()
{




    bourne::json input =
    {
        "allowCustomValues", true
    };

    CategoryParameterDTO obj(input.dump());

    TEST_ASSERT(true == obj.isAllowCustomValues());




}






void test_CategoryParameterDTO_id_is_converted_to_json()
{



    bourne::json input =
    {
        "id", 1
    };

    CategoryParameterDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);

}


void test_CategoryParameterDTO_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    CategoryParameterDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}




void test_CategoryParameterDTO_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    CategoryParameterDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}



void test_CategoryParameterDTO_required_is_converted_to_json()
{


    bourne::json input =
    {
        "required", true
    };

    CategoryParameterDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["required"] == output["required"]);


}


void test_CategoryParameterDTO_filtering_is_converted_to_json()
{


    bourne::json input =
    {
        "filtering", true
    };

    CategoryParameterDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["filtering"] == output["filtering"]);


}


void test_CategoryParameterDTO_distinctive_is_converted_to_json()
{


    bourne::json input =
    {
        "distinctive", true
    };

    CategoryParameterDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["distinctive"] == output["distinctive"]);


}


void test_CategoryParameterDTO_multivalue_is_converted_to_json()
{


    bourne::json input =
    {
        "multivalue", true
    };

    CategoryParameterDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["multivalue"] == output["multivalue"]);


}


void test_CategoryParameterDTO_allowCustomValues_is_converted_to_json()
{


    bourne::json input =
    {
        "allowCustomValues", true
    };

    CategoryParameterDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["allowCustomValues"] == output["allowCustomValues"]);


}





