-module(ympa_erlang_client_generate_goods_feedback_request).

-export([encode/1]).

-export_type([ympa_erlang_client_generate_goods_feedback_request/0]).

-type ympa_erlang_client_generate_goods_feedback_request() ::
    #{ 'businessId' := integer()
     }.

encode(#{ 'businessId' := BusinessId
        }) ->
    #{ 'businessId' => BusinessId
     }.
