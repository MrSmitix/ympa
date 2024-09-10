
#include "OutletAddressDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OutletAddressDTO_regionId_is_assigned_from_json()
{






    bourne::json input =
    {
        "regionId", 1
    };

    OutletAddressDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getRegionId());


}


void test_OutletAddressDTO_street_is_assigned_from_json()
{


    bourne::json input =
    {
        "street", "hello"
    };

    OutletAddressDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStreet().c_str());






}


void test_OutletAddressDTO_number_is_assigned_from_json()
{


    bourne::json input =
    {
        "number", "hello"
    };

    OutletAddressDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getNumber().c_str());






}


void test_OutletAddressDTO_building_is_assigned_from_json()
{


    bourne::json input =
    {
        "building", "hello"
    };

    OutletAddressDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBuilding().c_str());






}


void test_OutletAddressDTO_estate_is_assigned_from_json()
{


    bourne::json input =
    {
        "estate", "hello"
    };

    OutletAddressDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEstate().c_str());






}


void test_OutletAddressDTO_block_is_assigned_from_json()
{


    bourne::json input =
    {
        "block", "hello"
    };

    OutletAddressDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBlock().c_str());






}


void test_OutletAddressDTO_additional_is_assigned_from_json()
{


    bourne::json input =
    {
        "additional", "hello"
    };

    OutletAddressDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAdditional().c_str());






}


void test_OutletAddressDTO_km_is_assigned_from_json()
{
    bourne::json input =
    {
        "km", 1
    };

    OutletAddressDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getKm());








}


void test_OutletAddressDTO_city_is_assigned_from_json()
{


    bourne::json input =
    {
        "city", "hello"
    };

    OutletAddressDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCity().c_str());






}



void test_OutletAddressDTO_regionId_is_converted_to_json()
{



    bourne::json input =
    {
        "regionId", 1
    };

    OutletAddressDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["regionId"] == output["regionId"]);

}


void test_OutletAddressDTO_street_is_converted_to_json()
{

    bourne::json input =
    {
        "street", "hello"
    };

    OutletAddressDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["street"] == output["street"]);



}


void test_OutletAddressDTO_number_is_converted_to_json()
{

    bourne::json input =
    {
        "number", "hello"
    };

    OutletAddressDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["number"] == output["number"]);



}


void test_OutletAddressDTO_building_is_converted_to_json()
{

    bourne::json input =
    {
        "building", "hello"
    };

    OutletAddressDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["building"] == output["building"]);



}


void test_OutletAddressDTO_estate_is_converted_to_json()
{

    bourne::json input =
    {
        "estate", "hello"
    };

    OutletAddressDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["estate"] == output["estate"]);



}


void test_OutletAddressDTO_block_is_converted_to_json()
{

    bourne::json input =
    {
        "block", "hello"
    };

    OutletAddressDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["block"] == output["block"]);



}


void test_OutletAddressDTO_additional_is_converted_to_json()
{

    bourne::json input =
    {
        "additional", "hello"
    };

    OutletAddressDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["additional"] == output["additional"]);



}


void test_OutletAddressDTO_km_is_converted_to_json()
{
    bourne::json input =
    {
        "km", 1
    };

    OutletAddressDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["km"] == output["km"]);




}


void test_OutletAddressDTO_city_is_converted_to_json()
{

    bourne::json input =
    {
        "city", "hello"
    };

    OutletAddressDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["city"] == output["city"]);



}


