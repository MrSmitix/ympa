
#include "OrderBusinessBuyerDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OrderBusinessBuyerDTO_inn_is_assigned_from_json()
{


    bourne::json input =
    {
        "inn", "hello"
    };

    OrderBusinessBuyerDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getInn().c_str());






}


void test_OrderBusinessBuyerDTO_kpp_is_assigned_from_json()
{


    bourne::json input =
    {
        "kpp", "hello"
    };

    OrderBusinessBuyerDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getKpp().c_str());






}


void test_OrderBusinessBuyerDTO_organizationName_is_assigned_from_json()
{


    bourne::json input =
    {
        "organizationName", "hello"
    };

    OrderBusinessBuyerDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOrganizationName().c_str());






}


void test_OrderBusinessBuyerDTO_organizationJurAddress_is_assigned_from_json()
{


    bourne::json input =
    {
        "organizationJurAddress", "hello"
    };

    OrderBusinessBuyerDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOrganizationJurAddress().c_str());






}



void test_OrderBusinessBuyerDTO_inn_is_converted_to_json()
{

    bourne::json input =
    {
        "inn", "hello"
    };

    OrderBusinessBuyerDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["inn"] == output["inn"]);



}


void test_OrderBusinessBuyerDTO_kpp_is_converted_to_json()
{

    bourne::json input =
    {
        "kpp", "hello"
    };

    OrderBusinessBuyerDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["kpp"] == output["kpp"]);



}


void test_OrderBusinessBuyerDTO_organizationName_is_converted_to_json()
{

    bourne::json input =
    {
        "organizationName", "hello"
    };

    OrderBusinessBuyerDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["organizationName"] == output["organizationName"]);



}


void test_OrderBusinessBuyerDTO_organizationJurAddress_is_converted_to_json()
{

    bourne::json input =
    {
        "organizationJurAddress", "hello"
    };

    OrderBusinessBuyerDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["organizationJurAddress"] == output["organizationJurAddress"]);



}


