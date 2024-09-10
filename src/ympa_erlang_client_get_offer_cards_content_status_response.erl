-module(ympa_erlang_client_get_offer_cards_content_status_response).

-export([encode/1]).

-export_type([ympa_erlang_client_get_offer_cards_content_status_response/0]).

-type ympa_erlang_client_get_offer_cards_content_status_response() ::
    #{ 'status' => ympa_erlang_client_api_response_status_type:ympa_erlang_client_api_response_status_type(),
       'result' => ympa_erlang_client_offer_cards_content_status_dto:ympa_erlang_client_offer_cards_content_status_dto()
     }.

encode(#{ 'status' := Status,
          'result' := Result
        }) ->
    #{ 'status' => Status,
       'result' => Result
     }.
