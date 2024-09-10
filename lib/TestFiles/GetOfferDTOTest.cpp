
#include "GetOfferDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_GetOfferDTO_offerId_is_assigned_from_json()
{


    bourne::json input =
    {
        "offerId", "hello"
    };

    GetOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOfferId().c_str());






}


void test_GetOfferDTO_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    GetOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_GetOfferDTO_marketCategoryId_is_assigned_from_json()
{






    bourne::json input =
    {
        "marketCategoryId", 1
    };

    GetOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMarketCategoryId());


}


void test_GetOfferDTO_category_is_assigned_from_json()
{


    bourne::json input =
    {
        "category", "hello"
    };

    GetOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCategory().c_str());






}





void test_GetOfferDTO_vendor_is_assigned_from_json()
{


    bourne::json input =
    {
        "vendor", "hello"
    };

    GetOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getVendor().c_str());






}



void test_GetOfferDTO_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    GetOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}




void test_GetOfferDTO_vendorCode_is_assigned_from_json()
{


    bourne::json input =
    {
        "vendorCode", "hello"
    };

    GetOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getVendorCode().c_str());






}






void test_GetOfferDTO_customsCommodityCode_is_assigned_from_json()
{


    bourne::json input =
    {
        "customsCommodityCode", "hello"
    };

    GetOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCustomsCommodityCode().c_str());






}



void test_GetOfferDTO_boxCount_is_assigned_from_json()
{
    bourne::json input =
    {
        "boxCount", 1
    };

    GetOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBoxCount());








}




void test_GetOfferDTO_downloadable_is_assigned_from_json()
{




    bourne::json input =
    {
        "downloadable", true
    };

    GetOfferDTO obj(input.dump());

    TEST_ASSERT(true == obj.isDownloadable());




}


void test_GetOfferDTO_adult_is_assigned_from_json()
{




    bourne::json input =
    {
        "adult", true
    };

    GetOfferDTO obj(input.dump());

    TEST_ASSERT(true == obj.isAdult());




}











void test_GetOfferDTO_archived_is_assigned_from_json()
{




    bourne::json input =
    {
        "archived", true
    };

    GetOfferDTO obj(input.dump());

    TEST_ASSERT(true == obj.isArchived());




}



void test_GetOfferDTO_offerId_is_converted_to_json()
{

    bourne::json input =
    {
        "offerId", "hello"
    };

    GetOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["offerId"] == output["offerId"]);



}


void test_GetOfferDTO_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    GetOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_GetOfferDTO_marketCategoryId_is_converted_to_json()
{



    bourne::json input =
    {
        "marketCategoryId", 1
    };

    GetOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["marketCategoryId"] == output["marketCategoryId"]);

}


void test_GetOfferDTO_category_is_converted_to_json()
{

    bourne::json input =
    {
        "category", "hello"
    };

    GetOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["category"] == output["category"]);



}





void test_GetOfferDTO_vendor_is_converted_to_json()
{

    bourne::json input =
    {
        "vendor", "hello"
    };

    GetOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["vendor"] == output["vendor"]);



}



void test_GetOfferDTO_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    GetOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}




void test_GetOfferDTO_vendorCode_is_converted_to_json()
{

    bourne::json input =
    {
        "vendorCode", "hello"
    };

    GetOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["vendorCode"] == output["vendorCode"]);



}






void test_GetOfferDTO_customsCommodityCode_is_converted_to_json()
{

    bourne::json input =
    {
        "customsCommodityCode", "hello"
    };

    GetOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["customsCommodityCode"] == output["customsCommodityCode"]);



}



void test_GetOfferDTO_boxCount_is_converted_to_json()
{
    bourne::json input =
    {
        "boxCount", 1
    };

    GetOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["boxCount"] == output["boxCount"]);




}




void test_GetOfferDTO_downloadable_is_converted_to_json()
{


    bourne::json input =
    {
        "downloadable", true
    };

    GetOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["downloadable"] == output["downloadable"]);


}


void test_GetOfferDTO_adult_is_converted_to_json()
{


    bourne::json input =
    {
        "adult", true
    };

    GetOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["adult"] == output["adult"]);


}











void test_GetOfferDTO_archived_is_converted_to_json()
{


    bourne::json input =
    {
        "archived", true
    };

    GetOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["archived"] == output["archived"]);


}


