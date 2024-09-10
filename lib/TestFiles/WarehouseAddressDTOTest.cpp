
#include "WarehouseAddressDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_WarehouseAddressDTO_city_is_assigned_from_json()
{


    bourne::json input =
    {
        "city", "hello"
    };

    WarehouseAddressDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCity().c_str());






}


void test_WarehouseAddressDTO_street_is_assigned_from_json()
{


    bourne::json input =
    {
        "street", "hello"
    };

    WarehouseAddressDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStreet().c_str());






}


void test_WarehouseAddressDTO_number_is_assigned_from_json()
{


    bourne::json input =
    {
        "number", "hello"
    };

    WarehouseAddressDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getNumber().c_str());






}


void test_WarehouseAddressDTO_building_is_assigned_from_json()
{


    bourne::json input =
    {
        "building", "hello"
    };

    WarehouseAddressDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBuilding().c_str());






}


void test_WarehouseAddressDTO_block_is_assigned_from_json()
{


    bourne::json input =
    {
        "block", "hello"
    };

    WarehouseAddressDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBlock().c_str());






}




void test_WarehouseAddressDTO_city_is_converted_to_json()
{

    bourne::json input =
    {
        "city", "hello"
    };

    WarehouseAddressDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["city"] == output["city"]);



}


void test_WarehouseAddressDTO_street_is_converted_to_json()
{

    bourne::json input =
    {
        "street", "hello"
    };

    WarehouseAddressDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["street"] == output["street"]);



}


void test_WarehouseAddressDTO_number_is_converted_to_json()
{

    bourne::json input =
    {
        "number", "hello"
    };

    WarehouseAddressDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["number"] == output["number"]);



}


void test_WarehouseAddressDTO_building_is_converted_to_json()
{

    bourne::json input =
    {
        "building", "hello"
    };

    WarehouseAddressDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["building"] == output["building"]);



}


void test_WarehouseAddressDTO_block_is_converted_to_json()
{

    bourne::json input =
    {
        "block", "hello"
    };

    WarehouseAddressDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["block"] == output["block"]);



}



