
#include "EnrichedMappingsOfferDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_EnrichedMappingsOfferDTO_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_EnrichedMappingsOfferDTO_shopSku_is_assigned_from_json()
{


    bourne::json input =
    {
        "shopSku", "hello"
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getShopSku().c_str());






}


void test_EnrichedMappingsOfferDTO_category_is_assigned_from_json()
{


    bourne::json input =
    {
        "category", "hello"
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCategory().c_str());






}


void test_EnrichedMappingsOfferDTO_vendor_is_assigned_from_json()
{


    bourne::json input =
    {
        "vendor", "hello"
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getVendor().c_str());






}


void test_EnrichedMappingsOfferDTO_vendorCode_is_assigned_from_json()
{


    bourne::json input =
    {
        "vendorCode", "hello"
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getVendorCode().c_str());






}


void test_EnrichedMappingsOfferDTO_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}


void test_EnrichedMappingsOfferDTO_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_EnrichedMappingsOfferDTO_feedId_is_assigned_from_json()
{






    bourne::json input =
    {
        "feedId", 1
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getFeedId());


}





void test_EnrichedMappingsOfferDTO_manufacturer_is_assigned_from_json()
{


    bourne::json input =
    {
        "manufacturer", "hello"
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getManufacturer().c_str());






}



void test_EnrichedMappingsOfferDTO_minShipment_is_assigned_from_json()
{
    bourne::json input =
    {
        "minShipment", 1
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMinShipment());








}


void test_EnrichedMappingsOfferDTO_transportUnitSize_is_assigned_from_json()
{
    bourne::json input =
    {
        "transportUnitSize", 1
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getTransportUnitSize());








}


void test_EnrichedMappingsOfferDTO_quantumOfSupply_is_assigned_from_json()
{
    bourne::json input =
    {
        "quantumOfSupply", 1
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getQuantumOfSupply());








}


void test_EnrichedMappingsOfferDTO_deliveryDurationDays_is_assigned_from_json()
{
    bourne::json input =
    {
        "deliveryDurationDays", 1
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getDeliveryDurationDays());








}


void test_EnrichedMappingsOfferDTO_boxCount_is_assigned_from_json()
{
    bourne::json input =
    {
        "boxCount", 1
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBoxCount());








}





void test_EnrichedMappingsOfferDTO_shelfLifeDays_is_assigned_from_json()
{
    bourne::json input =
    {
        "shelfLifeDays", 1
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getShelfLifeDays());








}


void test_EnrichedMappingsOfferDTO_lifeTimeDays_is_assigned_from_json()
{
    bourne::json input =
    {
        "lifeTimeDays", 1
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getLifeTimeDays());








}


void test_EnrichedMappingsOfferDTO_guaranteePeriodDays_is_assigned_from_json()
{
    bourne::json input =
    {
        "guaranteePeriodDays", 1
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getGuaranteePeriodDays());








}







void test_EnrichedMappingsOfferDTO_certificate_is_assigned_from_json()
{


    bourne::json input =
    {
        "certificate", "hello"
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCertificate().c_str());






}


void test_EnrichedMappingsOfferDTO_price_is_assigned_from_json()
{








}


void test_EnrichedMappingsOfferDTO_marketCategoryId_is_assigned_from_json()
{






    bourne::json input =
    {
        "marketCategoryId", 1
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMarketCategoryId());


}


void test_EnrichedMappingsOfferDTO_marketCategoryName_is_assigned_from_json()
{


    bourne::json input =
    {
        "marketCategoryName", "hello"
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMarketCategoryName().c_str());






}


void test_EnrichedMappingsOfferDTO_marketModelId_is_assigned_from_json()
{






    bourne::json input =
    {
        "marketModelId", 1
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMarketModelId());


}


void test_EnrichedMappingsOfferDTO_marketModelName_is_assigned_from_json()
{


    bourne::json input =
    {
        "marketModelName", "hello"
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMarketModelName().c_str());






}


void test_EnrichedMappingsOfferDTO_marketSku_is_assigned_from_json()
{






    bourne::json input =
    {
        "marketSku", 1
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMarketSku());


}


void test_EnrichedMappingsOfferDTO_marketSkuName_is_assigned_from_json()
{


    bourne::json input =
    {
        "marketSkuName", "hello"
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMarketSkuName().c_str());






}



void test_EnrichedMappingsOfferDTO_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_EnrichedMappingsOfferDTO_shopSku_is_converted_to_json()
{

    bourne::json input =
    {
        "shopSku", "hello"
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["shopSku"] == output["shopSku"]);



}


void test_EnrichedMappingsOfferDTO_category_is_converted_to_json()
{

    bourne::json input =
    {
        "category", "hello"
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["category"] == output["category"]);



}


void test_EnrichedMappingsOfferDTO_vendor_is_converted_to_json()
{

    bourne::json input =
    {
        "vendor", "hello"
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["vendor"] == output["vendor"]);



}


void test_EnrichedMappingsOfferDTO_vendorCode_is_converted_to_json()
{

    bourne::json input =
    {
        "vendorCode", "hello"
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["vendorCode"] == output["vendorCode"]);



}


void test_EnrichedMappingsOfferDTO_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}


void test_EnrichedMappingsOfferDTO_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_EnrichedMappingsOfferDTO_feedId_is_converted_to_json()
{



    bourne::json input =
    {
        "feedId", 1
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["feedId"] == output["feedId"]);

}





void test_EnrichedMappingsOfferDTO_manufacturer_is_converted_to_json()
{

    bourne::json input =
    {
        "manufacturer", "hello"
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["manufacturer"] == output["manufacturer"]);



}



void test_EnrichedMappingsOfferDTO_minShipment_is_converted_to_json()
{
    bourne::json input =
    {
        "minShipment", 1
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["minShipment"] == output["minShipment"]);




}


void test_EnrichedMappingsOfferDTO_transportUnitSize_is_converted_to_json()
{
    bourne::json input =
    {
        "transportUnitSize", 1
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["transportUnitSize"] == output["transportUnitSize"]);




}


void test_EnrichedMappingsOfferDTO_quantumOfSupply_is_converted_to_json()
{
    bourne::json input =
    {
        "quantumOfSupply", 1
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["quantumOfSupply"] == output["quantumOfSupply"]);




}


void test_EnrichedMappingsOfferDTO_deliveryDurationDays_is_converted_to_json()
{
    bourne::json input =
    {
        "deliveryDurationDays", 1
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["deliveryDurationDays"] == output["deliveryDurationDays"]);




}


void test_EnrichedMappingsOfferDTO_boxCount_is_converted_to_json()
{
    bourne::json input =
    {
        "boxCount", 1
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["boxCount"] == output["boxCount"]);




}





void test_EnrichedMappingsOfferDTO_shelfLifeDays_is_converted_to_json()
{
    bourne::json input =
    {
        "shelfLifeDays", 1
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["shelfLifeDays"] == output["shelfLifeDays"]);




}


void test_EnrichedMappingsOfferDTO_lifeTimeDays_is_converted_to_json()
{
    bourne::json input =
    {
        "lifeTimeDays", 1
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["lifeTimeDays"] == output["lifeTimeDays"]);




}


void test_EnrichedMappingsOfferDTO_guaranteePeriodDays_is_converted_to_json()
{
    bourne::json input =
    {
        "guaranteePeriodDays", 1
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["guaranteePeriodDays"] == output["guaranteePeriodDays"]);




}







void test_EnrichedMappingsOfferDTO_certificate_is_converted_to_json()
{

    bourne::json input =
    {
        "certificate", "hello"
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["certificate"] == output["certificate"]);



}


void test_EnrichedMappingsOfferDTO_price_is_converted_to_json()
{




}


void test_EnrichedMappingsOfferDTO_marketCategoryId_is_converted_to_json()
{



    bourne::json input =
    {
        "marketCategoryId", 1
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["marketCategoryId"] == output["marketCategoryId"]);

}


void test_EnrichedMappingsOfferDTO_marketCategoryName_is_converted_to_json()
{

    bourne::json input =
    {
        "marketCategoryName", "hello"
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["marketCategoryName"] == output["marketCategoryName"]);



}


void test_EnrichedMappingsOfferDTO_marketModelId_is_converted_to_json()
{



    bourne::json input =
    {
        "marketModelId", 1
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["marketModelId"] == output["marketModelId"]);

}


void test_EnrichedMappingsOfferDTO_marketModelName_is_converted_to_json()
{

    bourne::json input =
    {
        "marketModelName", "hello"
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["marketModelName"] == output["marketModelName"]);



}


void test_EnrichedMappingsOfferDTO_marketSku_is_converted_to_json()
{



    bourne::json input =
    {
        "marketSku", 1
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["marketSku"] == output["marketSku"]);

}


void test_EnrichedMappingsOfferDTO_marketSkuName_is_converted_to_json()
{

    bourne::json input =
    {
        "marketSkuName", "hello"
    };

    EnrichedMappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["marketSkuName"] == output["marketSkuName"]);



}


