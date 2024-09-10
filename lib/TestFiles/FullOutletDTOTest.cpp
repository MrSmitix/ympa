
#include "FullOutletDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_FullOutletDTO_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    FullOutletDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}



void test_FullOutletDTO_coords_is_assigned_from_json()
{


    bourne::json input =
    {
        "coords", "hello"
    };

    FullOutletDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCoords().c_str());






}


void test_FullOutletDTO_isMain_is_assigned_from_json()
{




    bourne::json input =
    {
        "isMain", true
    };

    FullOutletDTO obj(input.dump());

    TEST_ASSERT(true == obj.isIsMain());




}


void test_FullOutletDTO_shopOutletCode_is_assigned_from_json()
{


    bourne::json input =
    {
        "shopOutletCode", "hello"
    };

    FullOutletDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getShopOutletCode().c_str());






}







void test_FullOutletDTO_storagePeriod_is_assigned_from_json()
{






    bourne::json input =
    {
        "storagePeriod", 1
    };

    FullOutletDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getStoragePeriod());


}


void test_FullOutletDTO_id_is_assigned_from_json()
{






    bourne::json input =
    {
        "id", 1
    };

    FullOutletDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());


}




void test_FullOutletDTO_shopOutletId_is_assigned_from_json()
{


    bourne::json input =
    {
        "shopOutletId", "hello"
    };

    FullOutletDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getShopOutletId().c_str());






}


void test_FullOutletDTO_workingTime_is_assigned_from_json()
{


    bourne::json input =
    {
        "workingTime", "hello"
    };

    FullOutletDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getWorkingTime().c_str());






}


void test_FullOutletDTO_moderationReason_is_assigned_from_json()
{


    bourne::json input =
    {
        "moderationReason", "hello"
    };

    FullOutletDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getModerationReason().c_str());






}



void test_FullOutletDTO_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    FullOutletDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}



void test_FullOutletDTO_coords_is_converted_to_json()
{

    bourne::json input =
    {
        "coords", "hello"
    };

    FullOutletDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["coords"] == output["coords"]);



}


void test_FullOutletDTO_isMain_is_converted_to_json()
{


    bourne::json input =
    {
        "isMain", true
    };

    FullOutletDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["isMain"] == output["isMain"]);


}


void test_FullOutletDTO_shopOutletCode_is_converted_to_json()
{

    bourne::json input =
    {
        "shopOutletCode", "hello"
    };

    FullOutletDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["shopOutletCode"] == output["shopOutletCode"]);



}







void test_FullOutletDTO_storagePeriod_is_converted_to_json()
{



    bourne::json input =
    {
        "storagePeriod", 1
    };

    FullOutletDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["storagePeriod"] == output["storagePeriod"]);

}


void test_FullOutletDTO_id_is_converted_to_json()
{



    bourne::json input =
    {
        "id", 1
    };

    FullOutletDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);

}




void test_FullOutletDTO_shopOutletId_is_converted_to_json()
{

    bourne::json input =
    {
        "shopOutletId", "hello"
    };

    FullOutletDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["shopOutletId"] == output["shopOutletId"]);



}


void test_FullOutletDTO_workingTime_is_converted_to_json()
{

    bourne::json input =
    {
        "workingTime", "hello"
    };

    FullOutletDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["workingTime"] == output["workingTime"]);



}


void test_FullOutletDTO_moderationReason_is_converted_to_json()
{

    bourne::json input =
    {
        "moderationReason", "hello"
    };

    FullOutletDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["moderationReason"] == output["moderationReason"]);



}


