-module(ympa_erlang_client_model_price_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_model_price_dto/0]).

-type ympa_erlang_client_model_price_dto() ::
    #{ 'avg' => integer(),
       'max' => integer(),
       'min' => integer()
     }.

encode(#{ 'avg' := Avg,
          'max' := Max,
          'min' := Min
        }) ->
    #{ 'avg' => Avg,
       'max' => Max,
       'min' => Min
     }.
