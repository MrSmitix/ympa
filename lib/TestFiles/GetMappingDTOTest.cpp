
#include "GetMappingDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_GetMappingDTO_marketSku_is_assigned_from_json()
{






    bourne::json input =
    {
        "marketSku", 1
    };

    GetMappingDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMarketSku());


}


void test_GetMappingDTO_marketSkuName_is_assigned_from_json()
{


    bourne::json input =
    {
        "marketSkuName", "hello"
    };

    GetMappingDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMarketSkuName().c_str());






}


void test_GetMappingDTO_marketModelId_is_assigned_from_json()
{






    bourne::json input =
    {
        "marketModelId", 1
    };

    GetMappingDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMarketModelId());


}


void test_GetMappingDTO_marketModelName_is_assigned_from_json()
{


    bourne::json input =
    {
        "marketModelName", "hello"
    };

    GetMappingDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMarketModelName().c_str());






}


void test_GetMappingDTO_marketCategoryId_is_assigned_from_json()
{






    bourne::json input =
    {
        "marketCategoryId", 1
    };

    GetMappingDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMarketCategoryId());


}


void test_GetMappingDTO_marketCategoryName_is_assigned_from_json()
{


    bourne::json input =
    {
        "marketCategoryName", "hello"
    };

    GetMappingDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMarketCategoryName().c_str());






}



void test_GetMappingDTO_marketSku_is_converted_to_json()
{



    bourne::json input =
    {
        "marketSku", 1
    };

    GetMappingDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["marketSku"] == output["marketSku"]);

}


void test_GetMappingDTO_marketSkuName_is_converted_to_json()
{

    bourne::json input =
    {
        "marketSkuName", "hello"
    };

    GetMappingDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["marketSkuName"] == output["marketSkuName"]);



}


void test_GetMappingDTO_marketModelId_is_converted_to_json()
{



    bourne::json input =
    {
        "marketModelId", 1
    };

    GetMappingDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["marketModelId"] == output["marketModelId"]);

}


void test_GetMappingDTO_marketModelName_is_converted_to_json()
{

    bourne::json input =
    {
        "marketModelName", "hello"
    };

    GetMappingDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["marketModelName"] == output["marketModelName"]);



}


void test_GetMappingDTO_marketCategoryId_is_converted_to_json()
{



    bourne::json input =
    {
        "marketCategoryId", 1
    };

    GetMappingDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["marketCategoryId"] == output["marketCategoryId"]);

}


void test_GetMappingDTO_marketCategoryName_is_converted_to_json()
{

    bourne::json input =
    {
        "marketCategoryName", "hello"
    };

    GetMappingDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["marketCategoryName"] == output["marketCategoryName"]);



}


