
#include "GenerateUnitedMarketplaceServicesReportRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_GenerateUnitedMarketplaceServicesReportRequest_businessId_is_assigned_from_json()
{






    bourne::json input =
    {
        "businessId", 1
    };

    GenerateUnitedMarketplaceServicesReportRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBusinessId());


}


void test_GenerateUnitedMarketplaceServicesReportRequest_dateTimeFrom_is_assigned_from_json()
{








}


void test_GenerateUnitedMarketplaceServicesReportRequest_dateTimeTo_is_assigned_from_json()
{








}




void test_GenerateUnitedMarketplaceServicesReportRequest_yearFrom_is_assigned_from_json()
{
    bourne::json input =
    {
        "yearFrom", 1
    };

    GenerateUnitedMarketplaceServicesReportRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getYearFrom());








}


void test_GenerateUnitedMarketplaceServicesReportRequest_monthFrom_is_assigned_from_json()
{
    bourne::json input =
    {
        "monthFrom", 1
    };

    GenerateUnitedMarketplaceServicesReportRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMonthFrom());








}


void test_GenerateUnitedMarketplaceServicesReportRequest_yearTo_is_assigned_from_json()
{
    bourne::json input =
    {
        "yearTo", 1
    };

    GenerateUnitedMarketplaceServicesReportRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getYearTo());








}


void test_GenerateUnitedMarketplaceServicesReportRequest_monthTo_is_assigned_from_json()
{
    bourne::json input =
    {
        "monthTo", 1
    };

    GenerateUnitedMarketplaceServicesReportRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMonthTo());








}






void test_GenerateUnitedMarketplaceServicesReportRequest_businessId_is_converted_to_json()
{



    bourne::json input =
    {
        "businessId", 1
    };

    GenerateUnitedMarketplaceServicesReportRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["businessId"] == output["businessId"]);

}


void test_GenerateUnitedMarketplaceServicesReportRequest_dateTimeFrom_is_converted_to_json()
{




}


void test_GenerateUnitedMarketplaceServicesReportRequest_dateTimeTo_is_converted_to_json()
{




}




void test_GenerateUnitedMarketplaceServicesReportRequest_yearFrom_is_converted_to_json()
{
    bourne::json input =
    {
        "yearFrom", 1
    };

    GenerateUnitedMarketplaceServicesReportRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["yearFrom"] == output["yearFrom"]);




}


void test_GenerateUnitedMarketplaceServicesReportRequest_monthFrom_is_converted_to_json()
{
    bourne::json input =
    {
        "monthFrom", 1
    };

    GenerateUnitedMarketplaceServicesReportRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["monthFrom"] == output["monthFrom"]);




}


void test_GenerateUnitedMarketplaceServicesReportRequest_yearTo_is_converted_to_json()
{
    bourne::json input =
    {
        "yearTo", 1
    };

    GenerateUnitedMarketplaceServicesReportRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["yearTo"] == output["yearTo"]);




}


void test_GenerateUnitedMarketplaceServicesReportRequest_monthTo_is_converted_to_json()
{
    bourne::json input =
    {
        "monthTo", 1
    };

    GenerateUnitedMarketplaceServicesReportRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["monthTo"] == output["monthTo"]);




}





