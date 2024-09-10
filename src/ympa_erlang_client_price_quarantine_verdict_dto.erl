-module(ympa_erlang_client_price_quarantine_verdict_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_price_quarantine_verdict_dto/0]).

-type ympa_erlang_client_price_quarantine_verdict_dto() ::
    #{ 'type' => ympa_erlang_client_price_quarantine_verdict_type:ympa_erlang_client_price_quarantine_verdict_type(),
       'params' := list()
     }.

encode(#{ 'type' := Type,
          'params' := Params
        }) ->
    #{ 'type' => Type,
       'params' => Params
     }.
