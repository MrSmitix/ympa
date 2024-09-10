-module(ympa_erlang_client_turnover_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_turnover_dto/0]).

-type ympa_erlang_client_turnover_dto() ::
    #{ 'turnover' := ympa_erlang_client_turnover_type:ympa_erlang_client_turnover_type(),
       'turnoverDays' => float()
     }.

encode(#{ 'turnover' := Turnover,
          'turnoverDays' := TurnoverDays
        }) ->
    #{ 'turnover' => Turnover,
       'turnoverDays' => TurnoverDays
     }.
