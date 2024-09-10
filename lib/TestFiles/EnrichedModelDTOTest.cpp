
#include "EnrichedModelDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_EnrichedModelDTO_id_is_assigned_from_json()
{






    bourne::json input =
    {
        "id", 1
    };

    EnrichedModelDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());


}


void test_EnrichedModelDTO_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    EnrichedModelDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}




void test_EnrichedModelDTO_offlineOffers_is_assigned_from_json()
{
    bourne::json input =
    {
        "offlineOffers", 1
    };

    EnrichedModelDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getOfflineOffers());








}


void test_EnrichedModelDTO_onlineOffers_is_assigned_from_json()
{
    bourne::json input =
    {
        "onlineOffers", 1
    };

    EnrichedModelDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getOnlineOffers());








}



void test_EnrichedModelDTO_id_is_converted_to_json()
{



    bourne::json input =
    {
        "id", 1
    };

    EnrichedModelDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);

}


void test_EnrichedModelDTO_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    EnrichedModelDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}




void test_EnrichedModelDTO_offlineOffers_is_converted_to_json()
{
    bourne::json input =
    {
        "offlineOffers", 1
    };

    EnrichedModelDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["offlineOffers"] == output["offlineOffers"]);




}


void test_EnrichedModelDTO_onlineOffers_is_converted_to_json()
{
    bourne::json input =
    {
        "onlineOffers", 1
    };

    EnrichedModelDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["onlineOffers"] == output["onlineOffers"]);




}


