
#include "OrderDeliveryAddressDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OrderDeliveryAddressDTO_country_is_assigned_from_json()
{


    bourne::json input =
    {
        "country", "hello"
    };

    OrderDeliveryAddressDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCountry().c_str());






}


void test_OrderDeliveryAddressDTO_postcode_is_assigned_from_json()
{


    bourne::json input =
    {
        "postcode", "hello"
    };

    OrderDeliveryAddressDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPostcode().c_str());






}


void test_OrderDeliveryAddressDTO_city_is_assigned_from_json()
{


    bourne::json input =
    {
        "city", "hello"
    };

    OrderDeliveryAddressDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCity().c_str());






}


void test_OrderDeliveryAddressDTO_district_is_assigned_from_json()
{


    bourne::json input =
    {
        "district", "hello"
    };

    OrderDeliveryAddressDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDistrict().c_str());






}


void test_OrderDeliveryAddressDTO_subway_is_assigned_from_json()
{


    bourne::json input =
    {
        "subway", "hello"
    };

    OrderDeliveryAddressDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSubway().c_str());






}


void test_OrderDeliveryAddressDTO_street_is_assigned_from_json()
{


    bourne::json input =
    {
        "street", "hello"
    };

    OrderDeliveryAddressDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStreet().c_str());






}


void test_OrderDeliveryAddressDTO_house_is_assigned_from_json()
{


    bourne::json input =
    {
        "house", "hello"
    };

    OrderDeliveryAddressDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getHouse().c_str());






}


void test_OrderDeliveryAddressDTO_block_is_assigned_from_json()
{


    bourne::json input =
    {
        "block", "hello"
    };

    OrderDeliveryAddressDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBlock().c_str());






}


void test_OrderDeliveryAddressDTO_entrance_is_assigned_from_json()
{


    bourne::json input =
    {
        "entrance", "hello"
    };

    OrderDeliveryAddressDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEntrance().c_str());






}


void test_OrderDeliveryAddressDTO_entryphone_is_assigned_from_json()
{


    bourne::json input =
    {
        "entryphone", "hello"
    };

    OrderDeliveryAddressDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEntryphone().c_str());






}


void test_OrderDeliveryAddressDTO_floor_is_assigned_from_json()
{


    bourne::json input =
    {
        "floor", "hello"
    };

    OrderDeliveryAddressDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFloor().c_str());






}


void test_OrderDeliveryAddressDTO_apartment_is_assigned_from_json()
{


    bourne::json input =
    {
        "apartment", "hello"
    };

    OrderDeliveryAddressDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getApartment().c_str());






}


void test_OrderDeliveryAddressDTO_phone_is_assigned_from_json()
{


    bourne::json input =
    {
        "phone", "hello"
    };

    OrderDeliveryAddressDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPhone().c_str());






}


void test_OrderDeliveryAddressDTO_recipient_is_assigned_from_json()
{


    bourne::json input =
    {
        "recipient", "hello"
    };

    OrderDeliveryAddressDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRecipient().c_str());






}




void test_OrderDeliveryAddressDTO_country_is_converted_to_json()
{

    bourne::json input =
    {
        "country", "hello"
    };

    OrderDeliveryAddressDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["country"] == output["country"]);



}


void test_OrderDeliveryAddressDTO_postcode_is_converted_to_json()
{

    bourne::json input =
    {
        "postcode", "hello"
    };

    OrderDeliveryAddressDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["postcode"] == output["postcode"]);



}


void test_OrderDeliveryAddressDTO_city_is_converted_to_json()
{

    bourne::json input =
    {
        "city", "hello"
    };

    OrderDeliveryAddressDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["city"] == output["city"]);



}


void test_OrderDeliveryAddressDTO_district_is_converted_to_json()
{

    bourne::json input =
    {
        "district", "hello"
    };

    OrderDeliveryAddressDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["district"] == output["district"]);



}


void test_OrderDeliveryAddressDTO_subway_is_converted_to_json()
{

    bourne::json input =
    {
        "subway", "hello"
    };

    OrderDeliveryAddressDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["subway"] == output["subway"]);



}


void test_OrderDeliveryAddressDTO_street_is_converted_to_json()
{

    bourne::json input =
    {
        "street", "hello"
    };

    OrderDeliveryAddressDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["street"] == output["street"]);



}


void test_OrderDeliveryAddressDTO_house_is_converted_to_json()
{

    bourne::json input =
    {
        "house", "hello"
    };

    OrderDeliveryAddressDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["house"] == output["house"]);



}


void test_OrderDeliveryAddressDTO_block_is_converted_to_json()
{

    bourne::json input =
    {
        "block", "hello"
    };

    OrderDeliveryAddressDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["block"] == output["block"]);



}


void test_OrderDeliveryAddressDTO_entrance_is_converted_to_json()
{

    bourne::json input =
    {
        "entrance", "hello"
    };

    OrderDeliveryAddressDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["entrance"] == output["entrance"]);



}


void test_OrderDeliveryAddressDTO_entryphone_is_converted_to_json()
{

    bourne::json input =
    {
        "entryphone", "hello"
    };

    OrderDeliveryAddressDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["entryphone"] == output["entryphone"]);



}


void test_OrderDeliveryAddressDTO_floor_is_converted_to_json()
{

    bourne::json input =
    {
        "floor", "hello"
    };

    OrderDeliveryAddressDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["floor"] == output["floor"]);



}


void test_OrderDeliveryAddressDTO_apartment_is_converted_to_json()
{

    bourne::json input =
    {
        "apartment", "hello"
    };

    OrderDeliveryAddressDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["apartment"] == output["apartment"]);



}


void test_OrderDeliveryAddressDTO_phone_is_converted_to_json()
{

    bourne::json input =
    {
        "phone", "hello"
    };

    OrderDeliveryAddressDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["phone"] == output["phone"]);



}


void test_OrderDeliveryAddressDTO_recipient_is_converted_to_json()
{

    bourne::json input =
    {
        "recipient", "hello"
    };

    OrderDeliveryAddressDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["recipient"] == output["recipient"]);



}



