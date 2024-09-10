
#include "PickupAddressDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PickupAddressDTO_country_is_assigned_from_json()
{


    bourne::json input =
    {
        "country", "hello"
    };

    PickupAddressDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCountry().c_str());






}


void test_PickupAddressDTO_city_is_assigned_from_json()
{


    bourne::json input =
    {
        "city", "hello"
    };

    PickupAddressDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCity().c_str());






}


void test_PickupAddressDTO_street_is_assigned_from_json()
{


    bourne::json input =
    {
        "street", "hello"
    };

    PickupAddressDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStreet().c_str());






}


void test_PickupAddressDTO_house_is_assigned_from_json()
{


    bourne::json input =
    {
        "house", "hello"
    };

    PickupAddressDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getHouse().c_str());






}


void test_PickupAddressDTO_postcode_is_assigned_from_json()
{


    bourne::json input =
    {
        "postcode", "hello"
    };

    PickupAddressDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPostcode().c_str());






}



void test_PickupAddressDTO_country_is_converted_to_json()
{

    bourne::json input =
    {
        "country", "hello"
    };

    PickupAddressDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["country"] == output["country"]);



}


void test_PickupAddressDTO_city_is_converted_to_json()
{

    bourne::json input =
    {
        "city", "hello"
    };

    PickupAddressDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["city"] == output["city"]);



}


void test_PickupAddressDTO_street_is_converted_to_json()
{

    bourne::json input =
    {
        "street", "hello"
    };

    PickupAddressDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["street"] == output["street"]);



}


void test_PickupAddressDTO_house_is_converted_to_json()
{

    bourne::json input =
    {
        "house", "hello"
    };

    PickupAddressDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["house"] == output["house"]);



}


void test_PickupAddressDTO_postcode_is_converted_to_json()
{

    bourne::json input =
    {
        "postcode", "hello"
    };

    PickupAddressDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["postcode"] == output["postcode"]);



}


