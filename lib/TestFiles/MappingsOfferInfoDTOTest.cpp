
#include "MappingsOfferInfoDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_MappingsOfferInfoDTO_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    MappingsOfferInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_MappingsOfferInfoDTO_shopSku_is_assigned_from_json()
{


    bourne::json input =
    {
        "shopSku", "hello"
    };

    MappingsOfferInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getShopSku().c_str());






}


void test_MappingsOfferInfoDTO_category_is_assigned_from_json()
{


    bourne::json input =
    {
        "category", "hello"
    };

    MappingsOfferInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCategory().c_str());






}


void test_MappingsOfferInfoDTO_vendor_is_assigned_from_json()
{


    bourne::json input =
    {
        "vendor", "hello"
    };

    MappingsOfferInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getVendor().c_str());






}


void test_MappingsOfferInfoDTO_vendorCode_is_assigned_from_json()
{


    bourne::json input =
    {
        "vendorCode", "hello"
    };

    MappingsOfferInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getVendorCode().c_str());






}


void test_MappingsOfferInfoDTO_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    MappingsOfferInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}


void test_MappingsOfferInfoDTO_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    MappingsOfferInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_MappingsOfferInfoDTO_feedId_is_assigned_from_json()
{






    bourne::json input =
    {
        "feedId", 1
    };

    MappingsOfferInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getFeedId());


}





void test_MappingsOfferInfoDTO_manufacturer_is_assigned_from_json()
{


    bourne::json input =
    {
        "manufacturer", "hello"
    };

    MappingsOfferInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getManufacturer().c_str());






}



void test_MappingsOfferInfoDTO_minShipment_is_assigned_from_json()
{
    bourne::json input =
    {
        "minShipment", 1
    };

    MappingsOfferInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMinShipment());








}


void test_MappingsOfferInfoDTO_transportUnitSize_is_assigned_from_json()
{
    bourne::json input =
    {
        "transportUnitSize", 1
    };

    MappingsOfferInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getTransportUnitSize());








}


void test_MappingsOfferInfoDTO_quantumOfSupply_is_assigned_from_json()
{
    bourne::json input =
    {
        "quantumOfSupply", 1
    };

    MappingsOfferInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getQuantumOfSupply());








}


void test_MappingsOfferInfoDTO_deliveryDurationDays_is_assigned_from_json()
{
    bourne::json input =
    {
        "deliveryDurationDays", 1
    };

    MappingsOfferInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getDeliveryDurationDays());








}


void test_MappingsOfferInfoDTO_boxCount_is_assigned_from_json()
{
    bourne::json input =
    {
        "boxCount", 1
    };

    MappingsOfferInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBoxCount());








}





void test_MappingsOfferInfoDTO_shelfLifeDays_is_assigned_from_json()
{
    bourne::json input =
    {
        "shelfLifeDays", 1
    };

    MappingsOfferInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getShelfLifeDays());








}


void test_MappingsOfferInfoDTO_lifeTimeDays_is_assigned_from_json()
{
    bourne::json input =
    {
        "lifeTimeDays", 1
    };

    MappingsOfferInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getLifeTimeDays());








}


void test_MappingsOfferInfoDTO_guaranteePeriodDays_is_assigned_from_json()
{
    bourne::json input =
    {
        "guaranteePeriodDays", 1
    };

    MappingsOfferInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getGuaranteePeriodDays());








}







void test_MappingsOfferInfoDTO_certificate_is_assigned_from_json()
{


    bourne::json input =
    {
        "certificate", "hello"
    };

    MappingsOfferInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCertificate().c_str());






}



void test_MappingsOfferInfoDTO_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    MappingsOfferInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_MappingsOfferInfoDTO_shopSku_is_converted_to_json()
{

    bourne::json input =
    {
        "shopSku", "hello"
    };

    MappingsOfferInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["shopSku"] == output["shopSku"]);



}


void test_MappingsOfferInfoDTO_category_is_converted_to_json()
{

    bourne::json input =
    {
        "category", "hello"
    };

    MappingsOfferInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["category"] == output["category"]);



}


void test_MappingsOfferInfoDTO_vendor_is_converted_to_json()
{

    bourne::json input =
    {
        "vendor", "hello"
    };

    MappingsOfferInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["vendor"] == output["vendor"]);



}


void test_MappingsOfferInfoDTO_vendorCode_is_converted_to_json()
{

    bourne::json input =
    {
        "vendorCode", "hello"
    };

    MappingsOfferInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["vendorCode"] == output["vendorCode"]);



}


void test_MappingsOfferInfoDTO_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    MappingsOfferInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}


void test_MappingsOfferInfoDTO_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    MappingsOfferInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_MappingsOfferInfoDTO_feedId_is_converted_to_json()
{



    bourne::json input =
    {
        "feedId", 1
    };

    MappingsOfferInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["feedId"] == output["feedId"]);

}





void test_MappingsOfferInfoDTO_manufacturer_is_converted_to_json()
{

    bourne::json input =
    {
        "manufacturer", "hello"
    };

    MappingsOfferInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["manufacturer"] == output["manufacturer"]);



}



void test_MappingsOfferInfoDTO_minShipment_is_converted_to_json()
{
    bourne::json input =
    {
        "minShipment", 1
    };

    MappingsOfferInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["minShipment"] == output["minShipment"]);




}


void test_MappingsOfferInfoDTO_transportUnitSize_is_converted_to_json()
{
    bourne::json input =
    {
        "transportUnitSize", 1
    };

    MappingsOfferInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["transportUnitSize"] == output["transportUnitSize"]);




}


void test_MappingsOfferInfoDTO_quantumOfSupply_is_converted_to_json()
{
    bourne::json input =
    {
        "quantumOfSupply", 1
    };

    MappingsOfferInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["quantumOfSupply"] == output["quantumOfSupply"]);




}


void test_MappingsOfferInfoDTO_deliveryDurationDays_is_converted_to_json()
{
    bourne::json input =
    {
        "deliveryDurationDays", 1
    };

    MappingsOfferInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["deliveryDurationDays"] == output["deliveryDurationDays"]);




}


void test_MappingsOfferInfoDTO_boxCount_is_converted_to_json()
{
    bourne::json input =
    {
        "boxCount", 1
    };

    MappingsOfferInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["boxCount"] == output["boxCount"]);




}





void test_MappingsOfferInfoDTO_shelfLifeDays_is_converted_to_json()
{
    bourne::json input =
    {
        "shelfLifeDays", 1
    };

    MappingsOfferInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["shelfLifeDays"] == output["shelfLifeDays"]);




}


void test_MappingsOfferInfoDTO_lifeTimeDays_is_converted_to_json()
{
    bourne::json input =
    {
        "lifeTimeDays", 1
    };

    MappingsOfferInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["lifeTimeDays"] == output["lifeTimeDays"]);




}


void test_MappingsOfferInfoDTO_guaranteePeriodDays_is_converted_to_json()
{
    bourne::json input =
    {
        "guaranteePeriodDays", 1
    };

    MappingsOfferInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["guaranteePeriodDays"] == output["guaranteePeriodDays"]);




}







void test_MappingsOfferInfoDTO_certificate_is_converted_to_json()
{

    bourne::json input =
    {
        "certificate", "hello"
    };

    MappingsOfferInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["certificate"] == output["certificate"]);



}


