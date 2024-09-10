
#include "ChangeOutletRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ChangeOutletRequest_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    ChangeOutletRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}



void test_ChangeOutletRequest_coords_is_assigned_from_json()
{


    bourne::json input =
    {
        "coords", "hello"
    };

    ChangeOutletRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCoords().c_str());






}


void test_ChangeOutletRequest_isMain_is_assigned_from_json()
{




    bourne::json input =
    {
        "isMain", true
    };

    ChangeOutletRequest obj(input.dump());

    TEST_ASSERT(true == obj.isIsMain());




}


void test_ChangeOutletRequest_shopOutletCode_is_assigned_from_json()
{


    bourne::json input =
    {
        "shopOutletCode", "hello"
    };

    ChangeOutletRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getShopOutletCode().c_str());






}







void test_ChangeOutletRequest_storagePeriod_is_assigned_from_json()
{






    bourne::json input =
    {
        "storagePeriod", 1
    };

    ChangeOutletRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getStoragePeriod());


}



void test_ChangeOutletRequest_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    ChangeOutletRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}



void test_ChangeOutletRequest_coords_is_converted_to_json()
{

    bourne::json input =
    {
        "coords", "hello"
    };

    ChangeOutletRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["coords"] == output["coords"]);



}


void test_ChangeOutletRequest_isMain_is_converted_to_json()
{


    bourne::json input =
    {
        "isMain", true
    };

    ChangeOutletRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["isMain"] == output["isMain"]);


}


void test_ChangeOutletRequest_shopOutletCode_is_converted_to_json()
{

    bourne::json input =
    {
        "shopOutletCode", "hello"
    };

    ChangeOutletRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["shopOutletCode"] == output["shopOutletCode"]);



}







void test_ChangeOutletRequest_storagePeriod_is_converted_to_json()
{



    bourne::json input =
    {
        "storagePeriod", 1
    };

    ChangeOutletRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["storagePeriod"] == output["storagePeriod"]);

}


