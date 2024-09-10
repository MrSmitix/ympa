
#include "FlippingPagerDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_FlippingPagerDTO_total_is_assigned_from_json()
{
    bourne::json input =
    {
        "total", 1
    };

    FlippingPagerDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getTotal());








}


void test_FlippingPagerDTO_from_is_assigned_from_json()
{
    bourne::json input =
    {
        "from", 1
    };

    FlippingPagerDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getFrom());








}


void test_FlippingPagerDTO_to_is_assigned_from_json()
{
    bourne::json input =
    {
        "to", 1
    };

    FlippingPagerDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getTo());








}


void test_FlippingPagerDTO_currentPage_is_assigned_from_json()
{
    bourne::json input =
    {
        "currentPage", 1
    };

    FlippingPagerDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCurrentPage());








}


void test_FlippingPagerDTO_pagesCount_is_assigned_from_json()
{
    bourne::json input =
    {
        "pagesCount", 1
    };

    FlippingPagerDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPagesCount());








}


void test_FlippingPagerDTO_pageSize_is_assigned_from_json()
{
    bourne::json input =
    {
        "pageSize", 1
    };

    FlippingPagerDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPageSize());








}



void test_FlippingPagerDTO_total_is_converted_to_json()
{
    bourne::json input =
    {
        "total", 1
    };

    FlippingPagerDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["total"] == output["total"]);




}


void test_FlippingPagerDTO_from_is_converted_to_json()
{
    bourne::json input =
    {
        "from", 1
    };

    FlippingPagerDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["from"] == output["from"]);




}


void test_FlippingPagerDTO_to_is_converted_to_json()
{
    bourne::json input =
    {
        "to", 1
    };

    FlippingPagerDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["to"] == output["to"]);




}


void test_FlippingPagerDTO_currentPage_is_converted_to_json()
{
    bourne::json input =
    {
        "currentPage", 1
    };

    FlippingPagerDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["currentPage"] == output["currentPage"]);




}


void test_FlippingPagerDTO_pagesCount_is_converted_to_json()
{
    bourne::json input =
    {
        "pagesCount", 1
    };

    FlippingPagerDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pagesCount"] == output["pagesCount"]);




}


void test_FlippingPagerDTO_pageSize_is_converted_to_json()
{
    bourne::json input =
    {
        "pageSize", 1
    };

    FlippingPagerDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pageSize"] == output["pageSize"]);




}


