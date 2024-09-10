
#include "OfferProcessingNoteDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_OfferProcessingNoteDTO_payload_is_assigned_from_json()
{


    bourne::json input =
    {
        "payload", "hello"
    };

    OfferProcessingNoteDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPayload().c_str());






}




void test_OfferProcessingNoteDTO_payload_is_converted_to_json()
{

    bourne::json input =
    {
        "payload", "hello"
    };

    OfferProcessingNoteDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["payload"] == output["payload"]);



}


