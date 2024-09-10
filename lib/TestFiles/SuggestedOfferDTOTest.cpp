
#include "SuggestedOfferDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_SuggestedOfferDTO_offerId_is_assigned_from_json()
{


    bourne::json input =
    {
        "offerId", "hello"
    };

    SuggestedOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOfferId().c_str());






}


void test_SuggestedOfferDTO_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    SuggestedOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_SuggestedOfferDTO_category_is_assigned_from_json()
{


    bourne::json input =
    {
        "category", "hello"
    };

    SuggestedOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCategory().c_str());






}


void test_SuggestedOfferDTO_vendor_is_assigned_from_json()
{


    bourne::json input =
    {
        "vendor", "hello"
    };

    SuggestedOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getVendor().c_str());






}



void test_SuggestedOfferDTO_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    SuggestedOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}


void test_SuggestedOfferDTO_vendorCode_is_assigned_from_json()
{


    bourne::json input =
    {
        "vendorCode", "hello"
    };

    SuggestedOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getVendorCode().c_str());






}




void test_SuggestedOfferDTO_offerId_is_converted_to_json()
{

    bourne::json input =
    {
        "offerId", "hello"
    };

    SuggestedOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["offerId"] == output["offerId"]);



}


void test_SuggestedOfferDTO_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    SuggestedOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_SuggestedOfferDTO_category_is_converted_to_json()
{

    bourne::json input =
    {
        "category", "hello"
    };

    SuggestedOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["category"] == output["category"]);



}


void test_SuggestedOfferDTO_vendor_is_converted_to_json()
{

    bourne::json input =
    {
        "vendor", "hello"
    };

    SuggestedOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["vendor"] == output["vendor"]);



}



void test_SuggestedOfferDTO_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    SuggestedOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}


void test_SuggestedOfferDTO_vendorCode_is_converted_to_json()
{

    bourne::json input =
    {
        "vendorCode", "hello"
    };

    SuggestedOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["vendorCode"] == output["vendorCode"]);



}



