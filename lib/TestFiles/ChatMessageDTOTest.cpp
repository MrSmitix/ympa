
#include "ChatMessageDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ChatMessageDTO_messageId_is_assigned_from_json()
{






    bourne::json input =
    {
        "messageId", 1
    };

    ChatMessageDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMessageId());


}


void test_ChatMessageDTO_createdAt_is_assigned_from_json()
{








}



void test_ChatMessageDTO_message_is_assigned_from_json()
{


    bourne::json input =
    {
        "message", "hello"
    };

    ChatMessageDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMessage().c_str());






}




void test_ChatMessageDTO_messageId_is_converted_to_json()
{



    bourne::json input =
    {
        "messageId", 1
    };

    ChatMessageDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["messageId"] == output["messageId"]);

}


void test_ChatMessageDTO_createdAt_is_converted_to_json()
{




}



void test_ChatMessageDTO_message_is_converted_to_json()
{

    bourne::json input =
    {
        "message", "hello"
    };

    ChatMessageDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["message"] == output["message"]);



}



