-module(ympa_erlang_client_offer_param_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_offer_param_dto/0]).

-type ympa_erlang_client_offer_param_dto() ::
    #{ 'name' := binary(),
       'value' := binary()
     }.

encode(#{ 'name' := Name,
          'value' := Value
        }) ->
    #{ 'name' => Name,
       'value' => Value
     }.
