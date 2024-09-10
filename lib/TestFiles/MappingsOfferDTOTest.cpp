
#include "MappingsOfferDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_MappingsOfferDTO_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    MappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_MappingsOfferDTO_shopSku_is_assigned_from_json()
{


    bourne::json input =
    {
        "shopSku", "hello"
    };

    MappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getShopSku().c_str());






}


void test_MappingsOfferDTO_category_is_assigned_from_json()
{


    bourne::json input =
    {
        "category", "hello"
    };

    MappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCategory().c_str());






}


void test_MappingsOfferDTO_vendor_is_assigned_from_json()
{


    bourne::json input =
    {
        "vendor", "hello"
    };

    MappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getVendor().c_str());






}


void test_MappingsOfferDTO_vendorCode_is_assigned_from_json()
{


    bourne::json input =
    {
        "vendorCode", "hello"
    };

    MappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getVendorCode().c_str());






}


void test_MappingsOfferDTO_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    MappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}


void test_MappingsOfferDTO_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    MappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_MappingsOfferDTO_feedId_is_assigned_from_json()
{






    bourne::json input =
    {
        "feedId", 1
    };

    MappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getFeedId());


}





void test_MappingsOfferDTO_manufacturer_is_assigned_from_json()
{


    bourne::json input =
    {
        "manufacturer", "hello"
    };

    MappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getManufacturer().c_str());






}



void test_MappingsOfferDTO_minShipment_is_assigned_from_json()
{
    bourne::json input =
    {
        "minShipment", 1
    };

    MappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMinShipment());








}


void test_MappingsOfferDTO_transportUnitSize_is_assigned_from_json()
{
    bourne::json input =
    {
        "transportUnitSize", 1
    };

    MappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getTransportUnitSize());








}


void test_MappingsOfferDTO_quantumOfSupply_is_assigned_from_json()
{
    bourne::json input =
    {
        "quantumOfSupply", 1
    };

    MappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getQuantumOfSupply());








}


void test_MappingsOfferDTO_deliveryDurationDays_is_assigned_from_json()
{
    bourne::json input =
    {
        "deliveryDurationDays", 1
    };

    MappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getDeliveryDurationDays());








}


void test_MappingsOfferDTO_boxCount_is_assigned_from_json()
{
    bourne::json input =
    {
        "boxCount", 1
    };

    MappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBoxCount());








}





void test_MappingsOfferDTO_shelfLifeDays_is_assigned_from_json()
{
    bourne::json input =
    {
        "shelfLifeDays", 1
    };

    MappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getShelfLifeDays());








}


void test_MappingsOfferDTO_lifeTimeDays_is_assigned_from_json()
{
    bourne::json input =
    {
        "lifeTimeDays", 1
    };

    MappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getLifeTimeDays());








}


void test_MappingsOfferDTO_guaranteePeriodDays_is_assigned_from_json()
{
    bourne::json input =
    {
        "guaranteePeriodDays", 1
    };

    MappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getGuaranteePeriodDays());








}







void test_MappingsOfferDTO_certificate_is_assigned_from_json()
{


    bourne::json input =
    {
        "certificate", "hello"
    };

    MappingsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCertificate().c_str());






}


void test_MappingsOfferDTO_price_is_assigned_from_json()
{








}



void test_MappingsOfferDTO_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    MappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_MappingsOfferDTO_shopSku_is_converted_to_json()
{

    bourne::json input =
    {
        "shopSku", "hello"
    };

    MappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["shopSku"] == output["shopSku"]);



}


void test_MappingsOfferDTO_category_is_converted_to_json()
{

    bourne::json input =
    {
        "category", "hello"
    };

    MappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["category"] == output["category"]);



}


void test_MappingsOfferDTO_vendor_is_converted_to_json()
{

    bourne::json input =
    {
        "vendor", "hello"
    };

    MappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["vendor"] == output["vendor"]);



}


void test_MappingsOfferDTO_vendorCode_is_converted_to_json()
{

    bourne::json input =
    {
        "vendorCode", "hello"
    };

    MappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["vendorCode"] == output["vendorCode"]);



}


void test_MappingsOfferDTO_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    MappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}


void test_MappingsOfferDTO_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    MappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_MappingsOfferDTO_feedId_is_converted_to_json()
{



    bourne::json input =
    {
        "feedId", 1
    };

    MappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["feedId"] == output["feedId"]);

}





void test_MappingsOfferDTO_manufacturer_is_converted_to_json()
{

    bourne::json input =
    {
        "manufacturer", "hello"
    };

    MappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["manufacturer"] == output["manufacturer"]);



}



void test_MappingsOfferDTO_minShipment_is_converted_to_json()
{
    bourne::json input =
    {
        "minShipment", 1
    };

    MappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["minShipment"] == output["minShipment"]);




}


void test_MappingsOfferDTO_transportUnitSize_is_converted_to_json()
{
    bourne::json input =
    {
        "transportUnitSize", 1
    };

    MappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["transportUnitSize"] == output["transportUnitSize"]);




}


void test_MappingsOfferDTO_quantumOfSupply_is_converted_to_json()
{
    bourne::json input =
    {
        "quantumOfSupply", 1
    };

    MappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["quantumOfSupply"] == output["quantumOfSupply"]);




}


void test_MappingsOfferDTO_deliveryDurationDays_is_converted_to_json()
{
    bourne::json input =
    {
        "deliveryDurationDays", 1
    };

    MappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["deliveryDurationDays"] == output["deliveryDurationDays"]);




}


void test_MappingsOfferDTO_boxCount_is_converted_to_json()
{
    bourne::json input =
    {
        "boxCount", 1
    };

    MappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["boxCount"] == output["boxCount"]);




}





void test_MappingsOfferDTO_shelfLifeDays_is_converted_to_json()
{
    bourne::json input =
    {
        "shelfLifeDays", 1
    };

    MappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["shelfLifeDays"] == output["shelfLifeDays"]);




}


void test_MappingsOfferDTO_lifeTimeDays_is_converted_to_json()
{
    bourne::json input =
    {
        "lifeTimeDays", 1
    };

    MappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["lifeTimeDays"] == output["lifeTimeDays"]);




}


void test_MappingsOfferDTO_guaranteePeriodDays_is_converted_to_json()
{
    bourne::json input =
    {
        "guaranteePeriodDays", 1
    };

    MappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["guaranteePeriodDays"] == output["guaranteePeriodDays"]);




}







void test_MappingsOfferDTO_certificate_is_converted_to_json()
{

    bourne::json input =
    {
        "certificate", "hello"
    };

    MappingsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["certificate"] == output["certificate"]);



}


void test_MappingsOfferDTO_price_is_converted_to_json()
{




}


