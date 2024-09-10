-module(ympa_erlang_client_feedback_shop_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_feedback_shop_dto/0]).

-type ympa_erlang_client_feedback_shop_dto() ::
    #{ 'name' => binary()
     }.

encode(#{ 'name' := Name
        }) ->
    #{ 'name' => Name
     }.
